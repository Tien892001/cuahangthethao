package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.SIZE_SP;
import com.congnghephanmem.QLCHBDTT.repository.SIZE_SP_Repository;
import com.congnghephanmem.QLCHBDTT.service.SIZE_SP_Service;
@Service
public class SIZE_SP_ServiceImpl implements SIZE_SP_Service {
	SIZE_SP_Repository repo;

	public SIZE_SP_ServiceImpl(SIZE_SP_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public SIZE_SP saveSSP(SIZE_SP ssp) {
		return repo.save(ssp);
	}

	@Override
	public List<SIZE_SP> getAllSSP() {
		return repo.findAll();
	}

	@Override
	public SIZE_SP getSSPById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("SIZE_SP", "Id", id));
	}

	@Override
	public SIZE_SP updateSSP(SIZE_SP ssp, long id) {
		SIZE_SP existingSSP = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("SIZE_SP", "Id", id));
						existingSSP.setSize(ssp.getSize());
						repo.save(existingSSP);
						return existingSSP;
	}

	@Override
	public void deleteSSP(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("SIZE_SP", "Id", id));
		repo.deleteById(id);

		
	}
	

	

}
