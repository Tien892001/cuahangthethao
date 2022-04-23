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
@Table(name="danhmuc_sp")
public class DANH_MUC_SP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maDanhMuc;
	
	@Column(name="tendanhmuc")
	private String tenDanhMuc;

	public long getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(long maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	
	
	

}
