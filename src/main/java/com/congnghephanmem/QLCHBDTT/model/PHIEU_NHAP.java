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

@Entity
@Data
@Table(name="phieunhap")
public class PHIEU_NHAP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long phieuNhap;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Column(name="thoigian")
	private Date thoigian;
	
	@ManyToOne
	@JoinColumn(name="manv")
	private NHAN_VIEN maNV;
	
	@ManyToOne
	@JoinColumn(name="manhacc")
	private NHA_CUNG_CAP maNhaCC;

	public long getPhieuNhap() {
		return phieuNhap;
	}

	public void setPhieuNhap(long phieuNhap) {
		this.phieuNhap = phieuNhap;
	}

	public Date getThoigian() {
		return thoigian;
	}

	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}

	public NHAN_VIEN getMaNV() {
		return maNV;
	}

	public void setMaNV(NHAN_VIEN maNV) {
		this.maNV = maNV;
	}

	public NHA_CUNG_CAP getMaNhaCC() {
		return maNhaCC;
	}

	public void setMaNhaCC(NHA_CUNG_CAP maNhaCC) {
		this.maNhaCC = maNhaCC;
	}

	
	
	
	
	
}
