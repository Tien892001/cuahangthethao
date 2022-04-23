package com.congnghephanmem.QLCHBDTT.model;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Data
@Table(name="chitiet_sp")
public class CHI_TIET_SAN_PHAM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maChiTietSanPham;
	
	@Column(name="soluong")
	private int soLuong;
	
	@ManyToOne
	@JoinColumn(name="masp")
	private SAN_PHAM maSP;
	
	@ManyToOne
	@JoinColumn(name="mamau")
	private MAU_SP maMau;
	
	@ManyToOne
	@JoinColumn(name="masize")
	private SIZE_SP maSize;

	public long getMaChiTietSanPham() {
		return maChiTietSanPham;
	}

	public void setMaChiTietSanPham(long maChiTietSanPham) {
		this.maChiTietSanPham = maChiTietSanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}


	public MAU_SP getMaMau() {
		return maMau;
	}

	public void setMaMau(MAU_SP maMau) {
		this.maMau = maMau;
	}

	public SAN_PHAM getMaSP() {
		return maSP;
	}

	public void setMaSP(SAN_PHAM maSP) {
		this.maSP = maSP;
	}

	public SIZE_SP getMaSize() {
		return maSize;
	}

	public void setMaSize(SIZE_SP maSize) {
		this.maSize = maSize;
	}

	
	
	
}
