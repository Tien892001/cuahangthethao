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
import com.congnghephanmem.QLCHBDTT.model.NHAN_VIEN;
import com.congnghephanmem.QLCHBDTT.service.NHAN_VIEN_Service;

@RestController
@RequestMapping("/api/nhanvien")
public class NHAN_VIEN_Controller {
	NHAN_VIEN_Service service;

	public NHAN_VIEN_Controller(NHAN_VIEN_Service service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<NHAN_VIEN> saveNV(@RequestBody NHAN_VIEN ctsp){
		return new ResponseEntity<NHAN_VIEN>(service.saveNV(ctsp), HttpStatus.CREATED);
	}
	@GetMapping
	public List<NHAN_VIEN> getAllNV(){
		return service.getAllNV();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<NHAN_VIEN> getNVById(@PathVariable ("id") long id){
		return new ResponseEntity<NHAN_VIEN>(service.getNVById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<NHAN_VIEN> updateCTSP(@PathVariable("id") long id
			                                   ,@RequestBody NHAN_VIEN nv){
		return new ResponseEntity<NHAN_VIEN>(service.updateNV(nv, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteNV(@PathVariable("id") long id){
		service.deleteNV(id);
		return new ResponseEntity<String>("NV delete successfully!", HttpStatus.OK);
		
	}

}
