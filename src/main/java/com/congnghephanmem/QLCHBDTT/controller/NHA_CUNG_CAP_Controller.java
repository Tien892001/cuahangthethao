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

import com.congnghephanmem.QLCHBDTT.model.NHA_CUNG_CAP;
import com.congnghephanmem.QLCHBDTT.service.NHA_CUNG_CAP_Service;

@RestController
@RequestMapping("api/nhacungcap")
public class NHA_CUNG_CAP_Controller {
	NHA_CUNG_CAP_Service service;

	public NHA_CUNG_CAP_Controller(NHA_CUNG_CAP_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<NHA_CUNG_CAP> saveNCC(@RequestBody NHA_CUNG_CAP ncc){
		return new ResponseEntity<NHA_CUNG_CAP>(service.saveNCC(ncc), HttpStatus.CREATED);
	}
	@GetMapping
	public List<NHA_CUNG_CAP> getAllNCC(){
		return service.getAllNCC();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<NHA_CUNG_CAP> getNCCById(@PathVariable ("id") long id){
		return new ResponseEntity<NHA_CUNG_CAP>(service.getNCCById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<NHA_CUNG_CAP> updateNCC(@PathVariable("id") long id
			                                   ,@RequestBody NHA_CUNG_CAP ncc){
		return new ResponseEntity<NHA_CUNG_CAP>(service.updateNCC(ncc, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteNCC(@PathVariable("id") long id){
		service.deleteNCC(id);
		return new ResponseEntity<String>("NCC delete successfully!", HttpStatus.OK);
		
	}
}
