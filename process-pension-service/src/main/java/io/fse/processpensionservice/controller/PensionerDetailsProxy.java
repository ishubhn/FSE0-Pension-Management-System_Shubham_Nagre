package io.fse.processpensionservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.fse.processpensionservice.model.Pension;

@FeignClient(name = "pensioner-detail", url = "localhost:8000")
public interface PensionerDetailsProxy {
	@GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
	public ResponseEntity<Pension> findPensionerByAadhaar(@PathVariable long aadhaarNumber);
}
