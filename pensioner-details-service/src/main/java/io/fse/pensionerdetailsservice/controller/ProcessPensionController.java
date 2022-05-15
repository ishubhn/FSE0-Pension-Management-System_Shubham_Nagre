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
	
	// Get User details from service layer
	// JWT is remaining
	@GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
	public ResponseEntity<Pensioner> FindPensionerByAadhaar(@PathVariable long aadhaarNumber) {
		return new ResponseEntity<Pensioner>(service.FindUserByAadhaarNumber(aadhaarNumber), HttpStatus.OK);
	}
	
}
