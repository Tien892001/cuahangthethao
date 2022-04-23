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

import com.congnghephanmem.QLCHBDTT.model.HOA_DON;
import com.congnghephanmem.QLCHBDTT.service.HOA_DON_Service;

@RestController
@RequestMapping("/api/hoadon")
public class HOA_DON_Controller {
	HOA_DON_Service service;

	public HOA_DON_Controller(HOA_DON_Service service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<HOA_DON> saveHD(@RequestBody HOA_DON hd){
		return new ResponseEntity<HOA_DON>(service.saveHD(hd), HttpStatus.CREATED);

}
	@GetMapping
	public List<HOA_DON> getAllHD(){
		return service.getAllHD();
		
	}
	@GetMapping("{id}")
	public ResponseEntity<HOA_DON> getHDById(@PathVariable ("id") long id){
		return new ResponseEntity<HOA_DON>(service.getHDById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<HOA_DON> updateHD(@PathVariable("id") long id
			                                   ,@RequestBody HOA_DON hd){
		return new ResponseEntity<HOA_DON>(service.updateHD(hd, id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteHD(@PathVariable("id") long id){
		service.deleteHD(id);
		return new ResponseEntity<String>("HD delete successfully!", HttpStatus.OK);
		
	}
}
