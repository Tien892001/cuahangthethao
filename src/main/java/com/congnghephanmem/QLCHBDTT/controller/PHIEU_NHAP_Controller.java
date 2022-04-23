package com.congnghephanmem.QLCHBDTT.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.congnghephanmem.QLCHBDTT.model.PHIEU_NHAP;
import com.congnghephanmem.QLCHBDTT.service.PHIEU_NHAP_Service;

@RestController
@RequestMapping("/api/phieunhap")
public class PHIEU_NHAP_Controller {
	PHIEU_NHAP_Service service;

	public PHIEU_NHAP_Controller(PHIEU_NHAP_Service service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<PHIEU_NHAP> savePN(@RequestBody PHIEU_NHAP pn){
		return new ResponseEntity<PHIEU_NHAP>(service.savePN(pn), HttpStatus.CREATED);
	}
	@GetMapping
	public List<PHIEU_NHAP> getAllPN(){
		return service.getAllPN();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<PHIEU_NHAP> getPNById(@PathVariable ("id") long id){
		return new ResponseEntity<PHIEU_NHAP>(service.getPNById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<PHIEU_NHAP> updatePN(@PathVariable("id") long id
			                                   ,@RequestBody PHIEU_NHAP pn){
		return new ResponseEntity<PHIEU_NHAP>(service.updatePN(pn, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePN(@PathVariable("id") long id){
		service.deletePN(id);
		return new ResponseEntity<String>("PN delete successfully!", HttpStatus.OK);
		
	}

	

}
