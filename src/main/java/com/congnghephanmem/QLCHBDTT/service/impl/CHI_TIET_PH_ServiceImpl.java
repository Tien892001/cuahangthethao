package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_PN;
import com.congnghephanmem.QLCHBDTT.repository.CHI_TIET_PN_Repository;
import com.congnghephanmem.QLCHBDTT.service.CHI_TIET_PN_Service;
@Service
public class CHI_TIET_PH_ServiceImpl implements CHI_TIET_PN_Service {
	private CHI_TIET_PN_Repository repo;

	public CHI_TIET_PH_ServiceImpl(CHI_TIET_PN_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public CHI_TIET_PN saveCTPN(CHI_TIET_PN ctpn) {
		return repo.save(ctpn);
	}

	@Override
	public List<CHI_TIET_PN> getAllCTPN() {
		return repo.findAll();
	}

	@Override
	public CHI_TIET_PN getCTPNById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("CHI_TIET_PN", "Id", id));
	}

	@Override
	public CHI_TIET_PN updateCTPN(CHI_TIET_PN ctpn, long id) {
		CHI_TIET_PN existingCTPN = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("CHI_TIET_PN", "Id", id));
						existingCTPN.setSoLuong(ctpn.getSoLuong());
						existingCTPN.setMaSP(ctpn.getMaSP());
						existingCTPN.setMaPN(ctpn.getMaPN());
						repo.save(existingCTPN);
						return existingCTPN;
	}

	@Override
	public void deleteCTPN(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("CHI_TIET_PN", "Id", id));
		repo.deleteById(id);

		
	}
	
	
	
	

}
