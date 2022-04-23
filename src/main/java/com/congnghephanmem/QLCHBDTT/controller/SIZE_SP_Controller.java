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

import com.congnghephanmem.QLCHBDTT.model.SIZE_SP;
import com.congnghephanmem.QLCHBDTT.service.SIZE_SP_Service;

@RestController
@RequestMapping("/api/sizesp")
public class SIZE_SP_Controller {
	SIZE_SP_Service service;

	public SIZE_SP_Controller(SIZE_SP_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<SIZE_SP> saveSSP(@RequestBody SIZE_SP ssp){
		return new ResponseEntity<SIZE_SP>(service.saveSSP(ssp), HttpStatus.CREATED);
	}
	@GetMapping
	public List<SIZE_SP> getAllSSP(){
		return service.getAllSSP();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<SIZE_SP> getSSPById(@PathVariable ("id") long id){
		return new ResponseEntity<SIZE_SP>(service.getSSPById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<SIZE_SP> updateSSP(@PathVariable("id") long id
			                                   ,@RequestBody SIZE_SP ssp){
		return new ResponseEntity<SIZE_SP>(service.updateSSP(ssp, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSSP(@PathVariable("id") long id){
		service.deleteSSP(id);
		return new ResponseEntity<String>("SSP delete successfully!", HttpStatus.OK);
		
	}

}
