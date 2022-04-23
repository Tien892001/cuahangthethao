package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.KHACH_HANG;

public interface KHACH_HANG_Service {
	KHACH_HANG saveKH(KHACH_HANG kh);
	List<KHACH_HANG> getAllKH();
	KHACH_HANG getKHById(long id);
	KHACH_HANG updateKH(KHACH_HANG kh, long id);
	void deleteKH(long id);

}
