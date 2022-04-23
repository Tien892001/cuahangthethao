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

@Entity
@Data
@Table(name="sanpham")
public class SAN_PHAM {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maSP;
	
	@Column(name="gia")
	private float gia;
	
	@Column(name="tensp")
	private String tenSP;
	
	@Column(name="mota")
	private String moTa;
	
	@Column(name="hinhanh")
	private String hinhAnh;
	
	@Column(name="magiamgia")
	private String maGiamGia;
	
	@ManyToOne
	@JoinColumn(name="madanhmuc")
	private NHA_CUNG_CAP maDanhMuc;

	public long getMaSP() {
		return maSP;
	}

	public void setMaSP(long maSP) {
		this.maSP = maSP;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getMaGiamGia() {
		return maGiamGia;
	}

	public void setMaGiamGia(String maGiamGia) {
		this.maGiamGia = maGiamGia;
	}

	public NHA_CUNG_CAP getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(NHA_CUNG_CAP maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	
	
	
	}
