package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.NHA_CUNG_CAP;
import com.congnghephanmem.QLCHBDTT.repository.NHA_CUNG_CAP_Repository;
import com.congnghephanmem.QLCHBDTT.service.NHA_CUNG_CAP_Service;

@Service
public class NHA_CUNG_CAP_ServiceImpl implements NHA_CUNG_CAP_Service {
	private NHA_CUNG_CAP_Repository repo;

	public NHA_CUNG_CAP_ServiceImpl(NHA_CUNG_CAP_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public NHA_CUNG_CAP saveNCC(NHA_CUNG_CAP sp) {
		return repo.save(sp);
	}
	@Override
	public List<NHA_CUNG_CAP> getAllNCC() {
		return repo.findAll();
	}
	@Override
	public NHA_CUNG_CAP getNCCById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("NHA_CUNG_CAP", "Id", id));
	}
	@Override
	public NHA_CUNG_CAP updateNCC(NHA_CUNG_CAP ncc, long id) {
		NHA_CUNG_CAP existingNCC = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("NHA_CUNG_CAP", "Id", id));
						existingNCC.setTenNhaCC(ncc.getTenNhaCC());
						existingNCC.setSdt(ncc.getSdt());
						existingNCC.setDiaChi(ncc.getDiaChi());
						repo.save(existingNCC);
						return existingNCC;
	}

	@Override
	public void deleteNCC(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("NHA_CUNG_CAP", "Id", id));
		repo.deleteById(id);

		
	}
	
	
	
	

}
