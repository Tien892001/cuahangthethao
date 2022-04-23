package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_PN;

public interface CHI_TIET_PN_Service {
	CHI_TIET_PN saveCTPN(CHI_TIET_PN ctpn);
	List<CHI_TIET_PN> getAllCTPN();
	CHI_TIET_PN getCTPNById(long id);
	CHI_TIET_PN updateCTPN(CHI_TIET_PN ctpn, long id);
	void deleteCTPN(long id);
	

}
