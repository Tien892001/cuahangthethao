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

import com.congnghephanmem.QLCHBDTT.model.KHACH_HANG;
import com.congnghephanmem.QLCHBDTT.service.KHACH_HANG_Service;

@RestController
@RequestMapping("/api/khachhang")
public class KHACH_HANG_Controller {
	KHACH_HANG_Service service;

	public KHACH_HANG_Controller(KHACH_HANG_Service service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<KHACH_HANG> saveKH(@RequestBody KHACH_HANG kh){
		return new ResponseEntity<KHACH_HANG>(service.saveKH(kh), HttpStatus.CREATED);

}
	@GetMapping
	public List<KHACH_HANG> getAllKH(){
		return service.getAllKH();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<KHACH_HANG> getKHById(@PathVariable ("id") long id){
		return new ResponseEntity<KHACH_HANG>(service.getKHById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<KHACH_HANG> updateKH(@PathVariable("id") long id
			                                   ,@RequestBody KHACH_HANG kh){
		return new ResponseEntity<KHACH_HANG>(service.updateKH(kh, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteKH(@PathVariable("id") long id){
		service.deleteKH(id);
		return new ResponseEntity<String>("KH delete successfully!", HttpStatus.OK);
		
	}
}