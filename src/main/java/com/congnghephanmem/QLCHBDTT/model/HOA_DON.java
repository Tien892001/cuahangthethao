package com.congnghephanmem.QLCHBDTT.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="hoadon")
public class HOA_DON {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maHD;
	
	@ManyToOne
	@JoinColumn(name="manv")
	private NHAN_VIEN maNV;
	
	@ManyToOne
	@JoinColumn(name="makh")
	private KHACH_HANG maKH;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Column(name="thoigian")
	private Date thoiGian;
	
	@Column(name="tinhtrangdon")
	private String tinhTrangDon;
	
	@Column(name="hinhthucthanhtoan")
	private String hinhThucThanhToan;
	
	@Column(name="ghichu")
	private String ghichu;

	public long getMaHD() {
		return maHD;
	}

	public void setMaHD(long maHD) {
		this.maHD = maHD;
	}

	public NHAN_VIEN getMaNV() {
		return maNV;
	}

	public void setMaNV(NHAN_VIEN maNV) {
		this.maNV = maNV;
	}

	public KHACH_HANG getMaKH() {
		return maKH;
	}

	public void setMaKH(KHACH_HANG maKH) {
		this.maKH = maKH;
	}

	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

	public String getTinhTrangDon() {
		return tinhTrangDon;
	}

	public void setTinhTrangDon(String tinhTrangDon) {
		this.tinhTrangDon = tinhTrangDon;
	}

	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}

	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	
	
	
	
	

}
