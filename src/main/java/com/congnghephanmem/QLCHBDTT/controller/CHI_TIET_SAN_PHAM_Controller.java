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

import com.congnghephanmem.QLCHBDTT.model.CHI_TIET_SAN_PHAM;
import com.congnghephanmem.QLCHBDTT.service.CHI_TIET_SAN_PHAM_Service;

@RestController
@RequestMapping("/api/chitietsanpham")
public class CHI_TIET_SAN_PHAM_Controller {
	CHI_TIET_SAN_PHAM_Service service;

	public CHI_TIET_SAN_PHAM_Controller(CHI_TIET_SAN_PHAM_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<CHI_TIET_SAN_PHAM> saveCTSP(@RequestBody CHI_TIET_SAN_PHAM ctsp){
		return new ResponseEntity<CHI_TIET_SAN_PHAM>(service.saveCTSP(ctsp), HttpStatus.CREATED);
	}
	@GetMapping
	public List<CHI_TIET_SAN_PHAM> getAllCTSP(){
		return service.getAllCTSP();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<CHI_TIET_SAN_PHAM> getCTSPById(@PathVariable ("id") long id){
		return new ResponseEntity<CHI_TIET_SAN_PHAM>(service.getCTSPById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<CHI_TIET_SAN_PHAM> updateCTSP(@PathVariable("id") long id
			                                   ,@RequestBody CHI_TIET_SAN_PHAM ctsp){
		return new ResponseEntity<CHI_TIET_SAN_PHAM>(service.updateCTSP(ctsp, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCTSP(@PathVariable("id") long id){
		service.deleteCTSP(id);
		return new ResponseEntity<String>("CTSP delete successfully!", HttpStatus.OK);
		
	}
	

}
