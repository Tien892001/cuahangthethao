package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.PHIEU_NHAP;
import com.congnghephanmem.QLCHBDTT.repository.PHIEU_NHAP_Repository;
import com.congnghephanmem.QLCHBDTT.service.PHIEU_NHAP_Service;

@Service
public class PHIEU_NHAP_ServiceImpl implements PHIEU_NHAP_Service {
	PHIEU_NHAP_Repository repo;

	public PHIEU_NHAP_ServiceImpl(PHIEU_NHAP_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public PHIEU_NHAP savePN(PHIEU_NHAP pn) {
		return repo.save(pn);
	}

	@Override
	public List<PHIEU_NHAP> getAllPN() {
		return repo.findAll();
	}

	@Override
	public PHIEU_NHAP getPNById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("PHIEU_NHAP", "Id", id));
	}

	@Override
	public PHIEU_NHAP updatePN(PHIEU_NHAP pn, long id) {
		PHIEU_NHAP existingPN = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("PHIEU_NHAP", "Id", id));
						existingPN.setThoigian(pn.getThoigian());
						existingPN.setMaNV(pn.getMaNV());
						existingPN.setMaNhaCC(pn.getMaNhaCC());
						repo.save(existingPN);
						return existingPN;
	}

	@Override
	public void deletePN(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("PHIEU_NHAP", "Id", id));
		repo.deleteById(id);

		
	}
	

}
