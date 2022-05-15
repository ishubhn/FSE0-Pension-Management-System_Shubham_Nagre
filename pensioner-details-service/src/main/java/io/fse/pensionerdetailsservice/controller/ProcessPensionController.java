package io.fse.pensionerdetailsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.fse.pensionerdetailsservice.model.Pensioner;
import io.fse.pensionerdetailsservice.service.ProcessPensionService;

@RestController
public class ProcessPensionController {
	
	@Autowired
	ProcessPensionService service;
	
	
//	Pensioner user;
	
	// Get User details from service layer
	// JWT is remaining
	@GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
	public ResponseEntity<Pensioner> findPensionerByAadhaar(@PathVariable long aadhaarNumber) {
		Pensioner user = service.findUserByAadhaarNumber(aadhaarNumber);
		
		return new ResponseEntity<Pensioner>(user, HttpStatus.OK);
	}
	
}