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
@Table(name="chitietpn")
public class CHI_TIET_PN {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maChiTietPN;
	
	@Column(name="soluong")
	private int soLuong;
	
	@ManyToOne
	@JoinColumn(name="masp")
	private SAN_PHAM maSP;
	
	@ManyToOne
	@JoinColumn(name="mapn")
	private PHIEU_NHAP maPN;

	public long getMaChiTietPN() {
		return maChiTietPN;
	}

	public void setMaChiTietPN(long maChiTietPN) {
		this.maChiTietPN = maChiTietPN;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public SAN_PHAM getMaSP() {
		return maSP;
	}

	public void setMaSP(SAN_PHAM maSP) {
		this.maSP = maSP;
	}

	public PHIEU_NHAP getMaPN() {
		return maPN;
	}

	public void setMaPN(PHIEU_NHAP maPN) {
		this.maPN = maPN;
	}

	
	
	

}
