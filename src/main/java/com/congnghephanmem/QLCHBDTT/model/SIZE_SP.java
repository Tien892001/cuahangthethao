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
@Table(name="size_sp")
public class SIZE_SP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maSize;
	
	@Column(name="size")
	private String size;

	public long getMaSize() {
		return maSize;
	}

	public void setMaSize(long maSize) {
		this.maSize = maSize;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	


}
