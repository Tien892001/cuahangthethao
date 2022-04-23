package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.NHAN_VIEN;
import com.congnghephanmem.QLCHBDTT.repository.NHAN_VIEN_Repository;
import com.congnghephanmem.QLCHBDTT.service.NHAN_VIEN_Service;

@Service
public class NHAN_VIEN_ServiceImpl implements NHAN_VIEN_Service {
	NHAN_VIEN_Repository repo;

	public NHAN_VIEN_ServiceImpl(NHAN_VIEN_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public NHAN_VIEN saveNV(NHAN_VIEN nv) {
		return repo.save(nv);
	}

	@Override
	public List<NHAN_VIEN> getAllNV() {
		return repo.findAll();
	}

	@Override
	public NHAN_VIEN getNVById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("NHAN_VIEN", "Id", id));
	}

	@Override
	public NHAN_VIEN updateNV(NHAN_VIEN nv, long id) {
		NHAN_VIEN existingNV = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("NHAN_VIEN", "Id", id));
						existingNV.setHo(nv.getHo());
						existingNV.setTen(nv.getTen());
						existingNV.setSdt(nv.getSdt());
						existingNV.setCccd(nv.getCccd());
						existingNV.setNgaySinh(nv.getNgaySinh());
						existingNV.setDiaChi(nv.getDiaChi());
						repo.save(existingNV);
						return existingNV;
	}

	@Override
	public void deleteNV(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("NHAN_VIEN", "Id", id));
		repo.deleteById(id);

		
	}
	

}
