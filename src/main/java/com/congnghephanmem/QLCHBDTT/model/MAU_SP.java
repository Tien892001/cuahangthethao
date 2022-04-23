package com.congnghephanmem.QLCHBDTT.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="mausp")
public class MAU_SP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maMau;
	
	@Column(name="mau")
	private String mau;

	public long getMaMau() {
		return maMau;
	}

	public void setMaMau(long maMau) {
		this.maMau = maMau;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}
	
	
	
	

}
