package com.congnghephanmem.QLCHBDTT.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tracuu")
public class TRA_CUU {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maTraCuu;
	
	@Column(name="kieu")
	private String kieu;
	
	@Column(name="giatri")
	private String giaTri;

	public long getMaTraCuu() {
		return maTraCuu;
	}

	public void setMaTraCuu(long maTraCuu) {
		this.maTraCuu = maTraCuu;
	}

	public String getKieu() {
		return kieu;
	}

	public void setKieu(String kieu) {
		this.kieu = kieu;
	}

	public String getGiaTri() {
		return giaTri;
	}

	public void setGiaTri(String giaTri) {
		this.giaTri = giaTri;
	}
	
	
	
	
}
