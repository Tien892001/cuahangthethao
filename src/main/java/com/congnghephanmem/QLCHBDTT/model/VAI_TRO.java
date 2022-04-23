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
@Table(name="vaitro")
public class VAI_TRO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maVaiTro;
	
	@Column(name="tenvaitro")
	private String tenVaiTro;

	public long getMaVaiTro() {
		return maVaiTro;
	}

	public void setMaVaiTro(long maVaiTro) {
		this.maVaiTro = maVaiTro;
	}

	public String getTenVaiTro() {
		return tenVaiTro;
	}

	public void setTenVaiTro(String tenVaiTro) {
		this.tenVaiTro = tenVaiTro;
	}
	
	
	
	

}
