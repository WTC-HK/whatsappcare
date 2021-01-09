package com.rai.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rai.binding.Customer;
import com.rai.repository.CustomerRepository;
import com.rai.service.MessageService;

@RestController
public class CustomerRequestController {
	
	@Autowired
	private CustomerRepository productRepo;
	@Autowired
	private MessageService messageService;
	
	@GetMapping(value ="/customer/{mobileNumber}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Customer> addCustomerByNumber(@PathVariable("mobileNumber") String mobileNumber){
		Customer customer =null;
		
		
	    Optional<Customer>  findById=	productRepo.findById(mobileNumber);
	    if(findById.isPresent()) {
	    	customer=findById.get();
	    	messageService.sentMessage(mobileNumber);
	    }
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}

}
