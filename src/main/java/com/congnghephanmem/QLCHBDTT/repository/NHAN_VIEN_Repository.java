package com.congnghephanmem.QLCHBDTT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.congnghephanmem.QLCHBDTT.model.NHAN_VIEN;

@Repository
public interface NHAN_VIEN_Repository extends JpaRepository<NHAN_VIEN, Long> {

}
