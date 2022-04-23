package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_HOA_DON;
import com.congnghephanmem.QLCHBDTT.repository.CHI_TIET_HOA_DON_Repository;
import com.congnghephanmem.QLCHBDTT.service.CHI_TIET_HOA_DON_Service;

@Service
public class CHI_TIET_HOA_DON_ServiceImpl implements CHI_TIET_HOA_DON_Service {
	private CHI_TIET_HOA_DON_Repository repo;

	public CHI_TIET_HOA_DON_ServiceImpl(CHI_TIET_HOA_DON_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public CHI_TIET_HOA_DON saveCTHD(CHI_TIET_HOA_DON cthd) {
		return repo.save(cthd);
	}

	@Override
	public List<CHI_TIET_HOA_DON> getAllCTHD() {
		return repo.findAll();
	}

	@Override
	public CHI_TIET_HOA_DON getCTHDById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("CHI_TIET_HOA_DON", "Id", id));
	}

	@Override
	public CHI_TIET_HOA_DON updateCTHD(CHI_TIET_HOA_DON cthd, long id) {
		CHI_TIET_HOA_DON existingCTHD = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("CHI_TIET_HOA_DON", "Id", id));
		existingCTHD.setMaSP(cthd.getMaSP());
		existingCTHD.setSoLuong(cthd.getSoLuong());
		existingCTHD.setMaHD(cthd.getMaHD());
		repo.save(existingCTHD);
		return existingCTHD;
	}

	@Override
	public void deleteCTHD(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("CHI_TIET_HOA_DON", "Id", id));
		repo.deleteById(id);

	}

}
