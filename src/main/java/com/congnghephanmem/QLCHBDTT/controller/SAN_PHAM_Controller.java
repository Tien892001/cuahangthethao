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

import com.congnghephanmem.QLCHBDTT.model.SAN_PHAM;
import com.congnghephanmem.QLCHBDTT.service.SAN_PHAM_Service;

@RestController
@RequestMapping("/api/sanpham")
public class SAN_PHAM_Controller {
	SAN_PHAM_Service service;

	public SAN_PHAM_Controller(SAN_PHAM_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<SAN_PHAM> saveSP(@RequestBody SAN_PHAM sp){
		return new ResponseEntity<SAN_PHAM>(service.saveSP(sp), HttpStatus.CREATED);
	}
	@GetMapping
	public List<SAN_PHAM> getAllSP(){
		return service.getAllSP();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<SAN_PHAM> getSPById(@PathVariable ("id") long id){
		return new ResponseEntity<SAN_PHAM>(service.getSPById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<SAN_PHAM> updateSP(@PathVariable("id") long id
			                                   ,@RequestBody SAN_PHAM sp){
		return new ResponseEntity<SAN_PHAM>(service.updateSP(sp, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSP(@PathVariable("id") long id){
		service.deleteSP(id);
		return new ResponseEntity<String>("SP delete successfully!", HttpStatus.OK);
		
	}

}
