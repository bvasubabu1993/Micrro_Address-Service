package com.app.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.entity.Address;
import com.app.main.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService service;
	
	@GetMapping("/home")
	public String homePage() {
		return "Welcome to Address_HomePage";
	}
	
	
	@PostMapping("/save")
	public Address saveAddress(@RequestBody Address address) {
		return service.saveAddress(address);
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Address>> getAddressById(@PathVariable int id) {
		Optional<Address> response = service.getById(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}
	
	@GetMapping("/getAll")
	public List<Address> getAllAddress(){
		return service.getAllAddress();
	}

}
