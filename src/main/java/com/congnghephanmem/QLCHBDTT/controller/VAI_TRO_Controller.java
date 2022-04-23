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

import com.congnghephanmem.QLCHBDTT.model.VAI_TRO;
import com.congnghephanmem.QLCHBDTT.service.VAI_TRO_Service;

@RestController
@RequestMapping("/api/vaitro")
public class VAI_TRO_Controller {
	VAI_TRO_Service service;

	public VAI_TRO_Controller(VAI_TRO_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<VAI_TRO> saveVT(@RequestBody VAI_TRO vt){
		return new ResponseEntity<VAI_TRO>(service.saveVT(vt), HttpStatus.CREATED);
	}
	@GetMapping
	public List<VAI_TRO> getAllVT(){
		return service.getAllVT();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<VAI_TRO> getVTById(@PathVariable ("id") long id){
		return new ResponseEntity<VAI_TRO>(service.getVTById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<VAI_TRO> updateVT(@PathVariable("id") long id
			                                   ,@RequestBody VAI_TRO vt){
		return new ResponseEntity<VAI_TRO>(service.updateVT(vt, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteVT(@PathVariable("id") long id){
		service.deleteVT(id);
		return new ResponseEntity<String>("VT delete successfully!", HttpStatus.OK);
		
	}

}
