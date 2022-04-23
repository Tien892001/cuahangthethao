package com.congnghephanmem.QLCHBDTT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.congnghephanmem.QLCHBDTT.model.KHACH_HANG;

@Repository
public interface KHACH_HANG_Repository extends JpaRepository<KHACH_HANG, Long> {
	

}
