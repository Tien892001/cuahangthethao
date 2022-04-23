package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.TRA_CUU;

public interface TRA_CUU_Service {
	TRA_CUU saveTC(TRA_CUU tc);
	List<TRA_CUU> getAllTC();
	TRA_CUU getTCById(long id);
	TRA_CUU updateTC(TRA_CUU tc, long id);
	void deleteTC(long id);


}
