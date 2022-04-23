package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_SAN_PHAM;

public interface CHI_TIET_SAN_PHAM_Service {
	CHI_TIET_SAN_PHAM saveCTSP(CHI_TIET_SAN_PHAM ctsp);
	List<CHI_TIET_SAN_PHAM> getAllCTSP();
	CHI_TIET_SAN_PHAM getCTSPById(long id);
	CHI_TIET_SAN_PHAM updateCTSP(CHI_TIET_SAN_PHAM ctsp, long id);
	void deleteCTSP(long id);

}
