package io.fse.pensionerdetailsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.fse.pensionerdetailsservice.model.Pensioner;
import io.fse.pensionerdetailsservice.repository.ProcessPensionRepository;

@Service
public class ProcessPensionService {
	@Autowired
	ProcessPensionRepository repo;
	
	public Pensioner FindUserByAadhaarNumber (long aadhaarNumber) {
		// Get user details from repository
		Pensioner user = repo.findByAadhaarNumber(aadhaarNumber);
		System.out.println(user);
		if (user == null) {
			throw new RuntimeException("No user pension details found for Aadhar: " + aadhaarNumber);
		}
		
		return user;
	}
	
}
