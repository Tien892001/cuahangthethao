package com.congnghephanmem.QLCHBDTT.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="taikhoan")
public class TAI_KHOAN {
	@Id
	private String email;
	
	@Column(name="matkhau")
	private String matKhau;
	
	@ManyToOne
	@JoinColumn(name="mavaitro")
	private VAI_TRO maVaiTro;
	
	@Column(name="trangthai")
	private String trangThai;
	
	@ManyToOne
	@JoinColumn(name="manguoidung")
	private NHAN_VIEN maNguoiDung;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}



	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public VAI_TRO getMaVaiTro() {
		return maVaiTro;
	}

	public void setMaVaiTro(VAI_TRO maVaiTro) {
		this.maVaiTro = maVaiTro;
	}

	public NHAN_VIEN getMaNguoiDung() {
		return maNguoiDung;
	}

	public void setMaNguoiDung(NHAN_VIEN maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}

	
	
	

}
