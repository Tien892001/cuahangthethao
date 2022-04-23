package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.SAN_PHAM;

public interface SAN_PHAM_Service {
	SAN_PHAM saveSP(SAN_PHAM sp);
	List<SAN_PHAM> getAllSP();
	SAN_PHAM getSPById(long id);
	SAN_PHAM updateSP(SAN_PHAM sp, long id);
	void deleteSP(long id);
	

}
