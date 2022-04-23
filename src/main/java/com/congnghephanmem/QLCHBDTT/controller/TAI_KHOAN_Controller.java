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

import com.congnghephanmem.QLCHBDTT.model.TAI_KHOAN;
import com.congnghephanmem.QLCHBDTT.service.TAI_KHOAN_Service;

@RestController
@RequestMapping("/api/taikhoan")
public class TAI_KHOAN_Controller {
	TAI_KHOAN_Service service;

	public TAI_KHOAN_Controller(TAI_KHOAN_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<TAI_KHOAN> saveTK(@RequestBody TAI_KHOAN tk){
		return new ResponseEntity<TAI_KHOAN>(service.saveTK(tk), HttpStatus.CREATED);
	}
	@GetMapping
	public List<TAI_KHOAN> getAllTK(){
		return service.getAllTK();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<TAI_KHOAN> getTKById(@PathVariable ("email") String email){
		return new ResponseEntity<TAI_KHOAN>(service.getTKById(email), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<TAI_KHOAN> updateTK(@PathVariable("email") String email
			                                   ,@RequestBody TAI_KHOAN tk){
		return new ResponseEntity<TAI_KHOAN>(service.updateTK(tk, email), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTK(@PathVariable("id") String email){
		service.deleteTK(email);
		return new ResponseEntity<String>("TK delete successfully!", HttpStatus.OK);
		
	}

}
