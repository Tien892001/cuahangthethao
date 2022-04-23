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

import com.congnghephanmem.QLCHBDTT.model.MAU_SP;
import com.congnghephanmem.QLCHBDTT.service.MAU_SP_Service;

@RestController
@RequestMapping("/api/mausp")
public class MAU_SP_Controller {
	MAU_SP_Service service;

	public MAU_SP_Controller(MAU_SP_Service service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<MAU_SP> saveMSP(@RequestBody MAU_SP msp){
		return new ResponseEntity<MAU_SP>(service.saveMSP(msp), HttpStatus.CREATED);
	}
	@GetMapping
	public List<MAU_SP> getAllMSP(){
		return service.getAllMSP();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<MAU_SP> getMSPById(@PathVariable ("id") long id){
		return new ResponseEntity<MAU_SP>(service.getMSPById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<MAU_SP> updateMSP(@PathVariable("id") long id
			                                   ,@RequestBody MAU_SP msp){
		return new ResponseEntity<MAU_SP>(service.updateMSP(msp, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteMSP(@PathVariable("id") long id){
		service.deleteMSP(id);
		return new ResponseEntity<String>("MSP delete successfully!", HttpStatus.OK);
		
	}
}
