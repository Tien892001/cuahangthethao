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

import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_HOA_DON;
import com.congnghephanmem.QLCHBDTT.service.CHI_TIET_HOA_DON_Service;


@RestController
@RequestMapping("/api/chitiethoadon")
public class CHI_TIET_HOA_DON_Controller {
	CHI_TIET_HOA_DON_Service service;

	public CHI_TIET_HOA_DON_Controller(CHI_TIET_HOA_DON_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<CHI_TIET_HOA_DON> saveCTHD(@RequestBody CHI_TIET_HOA_DON cthd){
		return new ResponseEntity<CHI_TIET_HOA_DON>(service.saveCTHD(cthd), HttpStatus.CREATED);
	}
	@GetMapping
	public List<CHI_TIET_HOA_DON> getAllCTHD(){
		return service.getAllCTHD();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<CHI_TIET_HOA_DON> getCTHDById(@PathVariable ("id") long id){
		return new ResponseEntity<CHI_TIET_HOA_DON>(service.getCTHDById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<CHI_TIET_HOA_DON> updateCTHD(@PathVariable("id") long id
			                                   ,@RequestBody CHI_TIET_HOA_DON cthd){
		return new ResponseEntity<CHI_TIET_HOA_DON>(service.updateCTHD(cthd,  id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCTHD(@PathVariable("id") long id){
		service.deleteCTHD(id);
		return new ResponseEntity<String>("CTHD delete successfully!", HttpStatus.OK);
		
	}

}
