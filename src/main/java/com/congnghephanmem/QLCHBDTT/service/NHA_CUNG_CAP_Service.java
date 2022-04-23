package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.NHA_CUNG_CAP;

public interface NHA_CUNG_CAP_Service {
	NHA_CUNG_CAP saveNCC(NHA_CUNG_CAP sp);
	List<NHA_CUNG_CAP> getAllNCC();
	NHA_CUNG_CAP getNCCById(long id);
	NHA_CUNG_CAP updateNCC(NHA_CUNG_CAP ncc, long id);
	void deleteNCC(long id);

}
