package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.TAI_KHOAN;

public interface TAI_KHOAN_Service {
	TAI_KHOAN saveTK(TAI_KHOAN tk);
	List<TAI_KHOAN> getAllTK();
	TAI_KHOAN updateTK(TAI_KHOAN tk, String email);
	void deleteTK(String email);
	TAI_KHOAN getTKById(String email);

}
