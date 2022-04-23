package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.TRA_CUU;
import com.congnghephanmem.QLCHBDTT.repository.TRA_CUU_Repository;
import com.congnghephanmem.QLCHBDTT.service.TRA_CUU_Service;

@Service 
public class TRA_CUU_ServiceImpl implements TRA_CUU_Service {
	TRA_CUU_Repository repo;

	public TRA_CUU_ServiceImpl(TRA_CUU_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public TRA_CUU saveTC(TRA_CUU tc) {
		return repo.save(tc);
	}

	@Override
	public List<TRA_CUU> getAllTC() {
		return repo.findAll();
	}

	@Override
	public TRA_CUU getTCById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("TRA_CUU", "Id", id));
	}

	@Override
	public TRA_CUU updateTC(TRA_CUU tc, long id) {
		TRA_CUU existingTC = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("TRA_CUU", "Id", id));
						existingTC.setKieu(tc.getKieu());
						existingTC.setGiaTri(tc.getGiaTri());
						repo.save(existingTC);
						return existingTC;
	
	}

	@Override
	public void deleteTC(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("TRA_CUUS", "Id", id));
		repo.deleteById(id);

		
	}
}
