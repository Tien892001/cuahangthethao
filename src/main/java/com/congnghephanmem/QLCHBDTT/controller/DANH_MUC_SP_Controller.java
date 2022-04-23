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

import com.congnghephanmem.QLCHBDTT.model.DANH_MUC_SP;
import com.congnghephanmem.QLCHBDTT.service.DANH_MUC_SP_Service;

@RestController
@RequestMapping("/api/danhmucsp")
public class DANH_MUC_SP_Controller {
	DANH_MUC_SP_Service service;

	public DANH_MUC_SP_Controller(DANH_MUC_SP_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<DANH_MUC_SP> saveDMSP(@RequestBody DANH_MUC_SP dmsp){
		return new ResponseEntity<DANH_MUC_SP>(service.saveDMSP(dmsp), HttpStatus.CREATED);
	}
	@GetMapping
	public List<DANH_MUC_SP> getAllDMSP(){
		return service.getAllDMSP();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<DANH_MUC_SP> getCTSPById(@PathVariable ("id") long id){
		return new ResponseEntity<DANH_MUC_SP>(service.getDMSPById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<DANH_MUC_SP> updateDMSP(@PathVariable("id") long id
			                                   ,@RequestBody DANH_MUC_SP dmsp){
		return new ResponseEntity<DANH_MUC_SP>(service.updateDMSP(dmsp, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDMSP(@PathVariable("id") long id){
		service.deleteDMSP(id);
		return new ResponseEntity<String>("DMSP delete successfully!", HttpStatus.OK);
		
	}
	

}
