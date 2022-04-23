package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.SAN_PHAM;
import com.congnghephanmem.QLCHBDTT.repository.SAN_PHAM_Repository;
import com.congnghephanmem.QLCHBDTT.service.SAN_PHAM_Service;
@Service
public class SAN_PHAM_ServiceImpl implements SAN_PHAM_Service {
	private SAN_PHAM_Repository repo;

	public SAN_PHAM_ServiceImpl(SAN_PHAM_Repository repo) {
		super();
		this.repo = repo;
	}
	@Override
	public SAN_PHAM saveSP(SAN_PHAM sp) {
		return repo.save(sp);
	}
	@Override
	public List<SAN_PHAM> getAllSP() {
		return repo.findAll();
	}
	@Override
	public SAN_PHAM getSPById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("SAN_PHAM", "Id", id));
	}
	@Override
	public SAN_PHAM updateSP(SAN_PHAM sp, long id) {
		SAN_PHAM existingSP = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("SAN_PHAM", "Id", id));
						existingSP.setGia(sp.getGia());
						existingSP.setTenSP(sp.getTenSP());
						existingSP.setMoTa(sp.getMoTa());
						existingSP.setHinhAnh(sp.getHinhAnh());
						existingSP.setMaGiamGia(sp.getMaGiamGia());
						existingSP.setMaDanhMuc(sp.getMaDanhMuc());
						repo.save(existingSP);
						return existingSP;
	
	}
	@Override
	public void deleteSP(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("SAN_PHAM", "Id", id));
		repo.deleteById(id);

		
	}
	

}
