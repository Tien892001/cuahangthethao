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

import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_PN;
import com.congnghephanmem.QLCHBDTT.service.CHI_TIET_PN_Service;

@RestController
@RequestMapping("/api/chitietpn")
public class CHI_TIET_PN_Controller {
	CHI_TIET_PN_Service service;

	public CHI_TIET_PN_Controller(CHI_TIET_PN_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<CHI_TIET_PN> saveCTPN(@RequestBody CHI_TIET_PN ctpn){
		return new ResponseEntity<CHI_TIET_PN>(service.saveCTPN(ctpn), HttpStatus.CREATED);
	}
	@GetMapping
	public List<CHI_TIET_PN> getAllCTPN(){
		return service.getAllCTPN();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<CHI_TIET_PN> getCTPNById(@PathVariable ("id") long id){
		return new ResponseEntity<CHI_TIET_PN>(service.getCTPNById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<CHI_TIET_PN> updateCTPN(@PathVariable("id") long id
			                                   ,@RequestBody CHI_TIET_PN ctpn){
		return new ResponseEntity<CHI_TIET_PN>(service.updateCTPN(ctpn, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCTPN(@PathVariable("id") long id){
		service.deleteCTPN(id);
		return new ResponseEntity<String>("CTPN delete successfully!", HttpStatus.OK);
		
	}

}
