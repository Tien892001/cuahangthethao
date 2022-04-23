package com.congnghephanmem.QLCHBDTT.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="CTHD")
public class CHI_TIET_HOA_DON {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maChiTietHoaDon;
	
	@ManyToOne
	@JoinColumn(name="masp")
	private SAN_PHAM maSP;
	
	@Column(name="soluong")
	private String soLuong;
	
	@Column(name="mahd")
	private String maHD;

	public long getMaChiTietHoaDon() {
		return maChiTietHoaDon;
	}

	public void setMaChiTietHoaDon(long maChiTietHoaDon) {
		this.maChiTietHoaDon = maChiTietHoaDon;
	}

	public SAN_PHAM getMaSP() {
		return maSP;
	}

	public void setMaSP(SAN_PHAM maSP) {
		this.maSP = maSP;
	}

	public String getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	
	
	
	

}
