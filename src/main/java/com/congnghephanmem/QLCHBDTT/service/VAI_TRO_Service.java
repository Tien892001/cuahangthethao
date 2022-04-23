package com.congnghephanmem.QLCHBDTT.service;

import java.util.List;

import com.congnghephanmem.QLCHBDTT.model.VAI_TRO;

public interface VAI_TRO_Service {
	VAI_TRO saveVT(VAI_TRO vt);
	List<VAI_TRO> getAllVT();
	VAI_TRO getVTById(long id);
	VAI_TRO updateVT(VAI_TRO vt, long id);
	void deleteVT(long id);

}
