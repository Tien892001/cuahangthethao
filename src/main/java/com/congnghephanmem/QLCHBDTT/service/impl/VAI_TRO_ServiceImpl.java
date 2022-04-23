package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.VAI_TRO;
import com.congnghephanmem.QLCHBDTT.repository.VAI_TRO_Repository;
import com.congnghephanmem.QLCHBDTT.service.VAI_TRO_Service;

@Service
public class VAI_TRO_ServiceImpl implements VAI_TRO_Service {
	VAI_TRO_Repository repo;

	public VAI_TRO_ServiceImpl(VAI_TRO_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public VAI_TRO saveVT(VAI_TRO vt) {
		return repo.save(vt);
	}

	@Override
	public List<VAI_TRO> getAllVT() {
		return repo.findAll();
		}

	@Override
	public VAI_TRO getVTById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("VAI_TRO", "Id", id));
	}

	@Override
	public VAI_TRO updateVT(VAI_TRO vt, long id) {
		VAI_TRO existingVT = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("VAI_TRO", "Id", id));
						existingVT.setTenVaiTro(vt.getTenVaiTro());
						repo.save(existingVT);
						return existingVT;
	}

	@Override
	public void deleteVT(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("VAI_TRO", "Id", id));
		repo.deleteById(id);

		
	}
	
	

}
