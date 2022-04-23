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
@Table(name="nhacungcap")
public class NHA_CUNG_CAP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maNhaCC;
	
	@Column(name="tennhacc")
	private String tenNhaCC;
	
	@Column(name="sdt")
	private String sdt;
	
	@Column(name="diachi")
	private String diaChi;

	public long getMaNhaCC() {
		return maNhaCC;
	}

	public void setMaNhaCC(long maNhaCC) {
		this.maNhaCC = maNhaCC;
	}

	public String getTenNhaCC() {
		return tenNhaCC;
	}

	public void setTenNhaCC(String tenNhaCC) {
		this.tenNhaCC = tenNhaCC;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	

}
