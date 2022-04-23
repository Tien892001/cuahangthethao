package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.SIZE_SP;

public interface SIZE_SP_Service {
	SIZE_SP saveSSP(SIZE_SP ssp);
	List<SIZE_SP> getAllSSP();
	SIZE_SP getSSPById(long id);
	SIZE_SP updateSSP(SIZE_SP ssp, long id);
	void deleteSSP(long id);

}
