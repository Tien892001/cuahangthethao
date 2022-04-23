package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.DANH_MUC_SP;
import com.congnghephanmem.QLCHBDTT.repository.DANH_MUC_SP_Repository;
import com.congnghephanmem.QLCHBDTT.service.DANH_MUC_SP_Service;

@Service
public class DANH_MUC_SP_ServiceImpl implements DANH_MUC_SP_Service {
	DANH_MUC_SP_Repository repo;
	

	public DANH_MUC_SP_ServiceImpl(DANH_MUC_SP_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public DANH_MUC_SP saveDMSP(DANH_MUC_SP dmsp) {
		return repo.save(dmsp);
	}

	@Override
	public List<DANH_MUC_SP> getAllDMSP() {
		return repo.findAll();
	}

	@Override
	public DANH_MUC_SP getDMSPById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("DANH_MUC_SP", "Id", id));
	}

	@Override
	public DANH_MUC_SP updateDMSP(DANH_MUC_SP dmsp, long id) {
		DANH_MUC_SP existingDMSP = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("DANH_MUC_SP", "Id", id));
						existingDMSP.setTenDanhMuc(dmsp.getTenDanhMuc());
						repo.save(existingDMSP);
						return existingDMSP;
	}

	@Override
	public void deleteDMSP(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("DANH_MUC_SP", "Id", id));
		repo.deleteById(id);

		
	}

}
