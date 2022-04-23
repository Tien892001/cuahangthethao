package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.KHACH_HANG;
import com.congnghephanmem.QLCHBDTT.repository.KHACH_HANG_Repository;
import com.congnghephanmem.QLCHBDTT.service.KHACH_HANG_Service;

@Service
public class KHACH_HANG_ServiceImpl implements KHACH_HANG_Service {
	KHACH_HANG_Repository repo;

	public KHACH_HANG_ServiceImpl(KHACH_HANG_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public KHACH_HANG saveKH(KHACH_HANG kh) {
		return repo.save(kh);
	}
	@Override
	public List<KHACH_HANG> getAllKH() {
		return repo.findAll();
	}

	@Override
	public KHACH_HANG getKHById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("KHACH_HANG", "Id", id));
	}

	@Override
	public KHACH_HANG updateKH(KHACH_HANG kh, long id) {
		KHACH_HANG existingKH = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("KHACH_HANG", "Id", id));
						existingKH.setHo(kh.getHo());
						existingKH.setTen(kh.getTen());
						existingKH.setSdt(kh.getSdt());
						existingKH.setDiaChi(kh.getDiaChi());
						repo.save(existingKH);
						return existingKH;
	}

	@Override
	public void deleteKH(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("KHACH_HANG", "Id", id));
		repo.deleteById(id);

		
	}
	

}
