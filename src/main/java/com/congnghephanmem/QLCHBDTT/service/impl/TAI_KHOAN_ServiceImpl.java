package com.congnghephanmem.QLCHBDTT.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.congnghephanmem.QLCHBDTT.exception.ResourceNotFoundException;
import com.congnghephanmem.QLCHBDTT.model.TAI_KHOAN;
import com.congnghephanmem.QLCHBDTT.repository.TAI_KHOAN_Repository;
import com.congnghephanmem.QLCHBDTT.service.TAI_KHOAN_Service;

@Service
public class TAI_KHOAN_ServiceImpl implements TAI_KHOAN_Service{
	TAI_KHOAN_Repository repo;

	public TAI_KHOAN_ServiceImpl(TAI_KHOAN_Repository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public TAI_KHOAN saveTK(TAI_KHOAN tk) {
		return repo.save(tk);
	}

	@Override
	public List<TAI_KHOAN> getAllTK() {
		return repo.findAll();
	}

	@Override
	public TAI_KHOAN getTKById(String email) {
		return repo.findById(email).orElseThrow(() -> new ResourceNotFoundException("TAI_KHOAN", "Email", email));
	}

	@Override
	public TAI_KHOAN updateTK(TAI_KHOAN tk, String email) {
		TAI_KHOAN existingTK = repo.findById(email).orElseThrow(
				() -> new ResourceNotFoundException("TAI_KHOAN", "Email", email));
						existingTK.setEmail(tk.getEmail());
						existingTK.setMatKhau(tk.getMatKhau());
						existingTK.setTrangThai(tk.getTrangThai());
						existingTK.setMaVaiTro(tk.getMaVaiTro());
						existingTK.setMaNguoiDung(tk.getMaNguoiDung());
						repo.save(existingTK);
						return existingTK;
	
	}

	@Override
	public void deleteTK(String email) {
		repo.findById(email).orElseThrow(() -> new ResourceNotFoundException("TAI_KHOAN", "Email", email));
		repo.deleteById(email);

		
	}
	}

	
	
	
	

