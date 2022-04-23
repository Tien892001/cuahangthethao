package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.NHAN_VIEN;

public interface NHAN_VIEN_Service {
	NHAN_VIEN saveNV(NHAN_VIEN nv);
	List<NHAN_VIEN> getAllNV();
	NHAN_VIEN getNVById(long id);
	NHAN_VIEN updateNV(NHAN_VIEN nv, long id);
	void deleteNV(long id);

}
