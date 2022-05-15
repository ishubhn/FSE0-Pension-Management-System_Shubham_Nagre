package io.fse.processpensionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.fse.processpensionservice.model.Pension;

@RestController
public class ProcessPensionController {
	@Autowired
	PensionerDetailsProxy proxy;
	
	@PostMapping("/ProcessPension/{aadhaarNumber}")
	public ResponseEntity<Pension> getPensionDetails(@PathVariable long aadhaarNumber) {
		ResponseEntity<Pension> response = proxy.findPensionerByAadhaar(aadhaarNumber);
		
		Pension pension = response.getBody();
		
		// Calculate Pension Amount
		if (pension.getPensionType().equalsIgnoreCase("self")) {
			System.out.println("Inside self");
			pension.setPensionAmount((0.8 * pension.getSalaryEarned()) + pension.getAllowances());
		} else if (pension.getPensionType().equalsIgnoreCase("family")) {
			pension.setPensionAmount((0.5 * pension.getSalaryEarned()) + pension.getAllowances());
		}
		
		// Get Service charges for bank
		if (pension.getBankType().equalsIgnoreCase("public")) {
			pension.setServiceCharges(500d);
		} else if (pension.getBankType().equalsIgnoreCase("private")) {
			pension.setServiceCharges(550d);
		}
		
		return new ResponseEntity<Pension>(pension, HttpStatus.CREATED);
	}
}