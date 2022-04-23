package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.HOA_DON;

public interface HOA_DON_Service {
	HOA_DON saveHD(HOA_DON hd);
	List<HOA_DON> getAllHD();
	HOA_DON getHDById(long id);
	HOA_DON updateHD(HOA_DON hd, long id);
	void deleteHD(long id);

}
