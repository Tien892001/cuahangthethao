package com.congnghephanmem.QLCHBDTT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.congnghephanmem.QLCHBDTT.model.SAN_PHAM;

@Repository
public interface SAN_PHAM_Repository extends JpaRepository<SAN_PHAM, Long>{

}
