package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.HOA_DON;
import com.congnghephanmem.QLCHBDTT.repository.HOA_DON_Repository;
import com.congnghephanmem.QLCHBDTT.service.HOA_DON_Service;

@Service
public class HOA_DON_ServiceImpl implements HOA_DON_Service {
	HOA_DON_Repository repo;

	public HOA_DON_ServiceImpl(HOA_DON_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public HOA_DON saveHD(HOA_DON hd) {
		return repo.save(hd);
	}

	@Override
	public List<HOA_DON> getAllHD() {
		return repo.findAll();
	}

	@Override
	public HOA_DON getHDById(long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("HOA_DON", "Id", id));
	}

	@Override
	public HOA_DON updateHD(HOA_DON hd, long id) {
		HOA_DON existingHD = repo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("CHI_TIET_PN", "Id", id));
						existingHD.setMaNV(hd.getMaNV());
						existingHD.setMaKH(hd.getMaKH());
						existingHD.setThoiGian(hd.getThoiGian());
						existingHD.setTinhTrangDon(hd.getTinhTrangDon());
						existingHD.setHinhThucThanhToan(hd.getHinhThucThanhToan());
						existingHD.setGhichu(hd.getGhichu());
						repo.save(existingHD);
						return existingHD;
	}

	@Override
	public void deleteHD(long id) {
		repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("HOA_DON", "Id", id));
		repo.deleteById(id);

	}
	

}
