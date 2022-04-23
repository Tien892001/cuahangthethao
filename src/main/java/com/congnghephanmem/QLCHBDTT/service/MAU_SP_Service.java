package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.MAU_SP;

public interface MAU_SP_Service {
	MAU_SP saveMSP(MAU_SP msp);
	List<MAU_SP> getAllMSP();
	MAU_SP getMSPById(long id);
	MAU_SP updateMSP(MAU_SP msp, long id);
	void deleteMSP(long id);

}
