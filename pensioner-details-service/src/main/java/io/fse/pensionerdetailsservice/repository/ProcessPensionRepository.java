package io.fse.pensionerdetailsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.fse.pensionerdetailsservice.model.Pensioner;

public interface ProcessPensionRepository extends JpaRepository<Pensioner, Long> {
	Pensioner findByAadhaarNumber(long aadhaarNumber);
}
