package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.DANH_MUC_SP;

public interface DANH_MUC_SP_Service {
	DANH_MUC_SP saveDMSP(DANH_MUC_SP dmsp);
	List<DANH_MUC_SP> getAllDMSP();
	DANH_MUC_SP getDMSPById(long id);
	DANH_MUC_SP updateDMSP(DANH_MUC_SP dmsp, long id);
	void deleteDMSP(long id);
	

}
