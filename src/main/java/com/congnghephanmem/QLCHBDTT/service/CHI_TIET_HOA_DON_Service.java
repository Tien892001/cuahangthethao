package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_HOA_DON;


public interface CHI_TIET_HOA_DON_Service {
	CHI_TIET_HOA_DON saveCTHD(CHI_TIET_HOA_DON cthd);
	List<CHI_TIET_HOA_DON> getAllCTHD();
	CHI_TIET_HOA_DON getCTHDById(long id);
	CHI_TIET_HOA_DON updateCTHD(CHI_TIET_HOA_DON cthd, long id);
	void deleteCTHD(long id);

}
