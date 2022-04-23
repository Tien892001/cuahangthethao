package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.PHIEU_NHAP;

public interface PHIEU_NHAP_Service {
	PHIEU_NHAP savePN(PHIEU_NHAP pn);
	List<PHIEU_NHAP> getAllPN();
	PHIEU_NHAP getPNById(long id);
	PHIEU_NHAP updatePN(PHIEU_NHAP pn, long id);
	void deletePN(long id);

}
