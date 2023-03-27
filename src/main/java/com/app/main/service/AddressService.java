package com.app.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.main.dao.AddressRepository;
import com.app.main.entity.Address;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repository;
	
	public Address saveAddress(Address address) {
		return repository.save(address);
		
	}

	public List<Address> getAllAddress(){
		return repository.findAll();
	}
	
	public Optional<Address> getById(int id){
		return repository.findById(id);
	}
}
