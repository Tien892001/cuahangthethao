package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.MAU_SP;
import com.congnghephanmem.QLCHBDTT.repository.MAU_SP_Repository;
import com.congnghephanmem.QLCHBDTT.service.MAU_SP_Service;

@Service
public class MAU_SP_ServiceImpl implements MAU_SP_Service  {
	MAU_SP_Repository repo;

	public MAU_SP_ServiceImpl(MAU_SP_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public MAU_SP saveMSP(MAU_SP msp) {
		return repo.save(msp);
	}

	@Override
	public List<MAU_SP> getAllMSP() {
		return repo.findAll();
				
	}

	@Override
	public MAU_SP getMSPById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("MAU_SP", "Id", id));
	}

	@Override
	public MAU_SP updateMSP(MAU_SP msp, long id) {
		MAU_SP existingMSP = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("MAU_SP", "Id", id));
						existingMSP.setMau(msp.getMau());
						repo.save(existingMSP);
						return existingMSP;
	}

	@Override
	public void deleteMSP(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("MAU_SP", "Id", id));
		repo.deleteById(id);

		
	}
	

}
