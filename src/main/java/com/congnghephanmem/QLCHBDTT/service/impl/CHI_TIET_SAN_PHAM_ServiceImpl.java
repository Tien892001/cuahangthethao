package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_SAN_PHAM;
import com.congnghephanmem.QLCHBDTT.repository.CHI_TIET_SAN_PHAM_Repository;
import com.congnghephanmem.QLCHBDTT.service.CHI_TIET_SAN_PHAM_Service;
@Service
public class CHI_TIET_SAN_PHAM_ServiceImpl implements CHI_TIET_SAN_PHAM_Service {
	CHI_TIET_SAN_PHAM_Repository repo;

	public CHI_TIET_SAN_PHAM_ServiceImpl(CHI_TIET_SAN_PHAM_Repository repo) {
		super();
		this.repo = repo;
	}
	
	@Override
	public CHI_TIET_SAN_PHAM saveCTSP(CHI_TIET_SAN_PHAM ctsp) {
		return repo.save(ctsp);
	}
	@Override
	public List<CHI_TIET_SAN_PHAM> getAllCTSP() {
		return repo.findAll();
	}
	@Override
	public CHI_TIET_SAN_PHAM getCTSPById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("CHI_TIET_SAN_PHAM", "Id", id));
	}
	@Override
	public CHI_TIET_SAN_PHAM updateCTSP(CHI_TIET_SAN_PHAM ctsp, long id) {
		CHI_TIET_SAN_PHAM existingCTSP = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("CHI_TIET_HOA_DON", "Id", id));
						existingCTSP.setSoLuong(ctsp.getSoLuong());
						existingCTSP.setMaSP(ctsp.getMaSP());
						existingCTSP.setMaSize(ctsp.getMaSize());
						existingCTSP.setMaMau(ctsp.getMaMau());
						repo.save(existingCTSP);
						return existingCTSP;
	}

	@Override
	public void deleteCTSP(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("CHI_TIET_HOA_DON", "Id", id));
		repo.deleteById(id);

		
	}
	

}
