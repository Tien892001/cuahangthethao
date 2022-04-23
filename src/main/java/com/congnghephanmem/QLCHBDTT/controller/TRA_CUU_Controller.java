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

import com.congnghephanmem.QLCHBDTT.model.TRA_CUU;
import com.congnghephanmem.QLCHBDTT.service.TRA_CUU_Service;

@RestController
@RequestMapping("/api/tracuu")
public class TRA_CUU_Controller {
	TRA_CUU_Service service;

	public TRA_CUU_Controller(TRA_CUU_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<TRA_CUU> saveTC(@RequestBody TRA_CUU tc){
		return new ResponseEntity<TRA_CUU>(service.saveTC(tc), HttpStatus.CREATED);
	}
	@GetMapping
	public List<TRA_CUU> getAllTC(){
		return service.getAllTC();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<TRA_CUU> getTCById(@PathVariable ("id") long id){
		return new ResponseEntity<TRA_CUU>(service.getTCById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<TRA_CUU> updateTC(@PathVariable("id") long id
			                                   ,@RequestBody TRA_CUU tc){
		return new ResponseEntity<TRA_CUU>(service.updateTC(tc, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTC(@PathVariable("id") long id){
		service.deleteTC(id);
		return new ResponseEntity<String>("TC delete successfully!", HttpStatus.OK);
		
	}

}
