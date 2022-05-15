package io.fse.pensionerdetailsservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pension")
public class Pensioner {

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(nullable = false, updatable = false)
//	private Long id;
	
	@Column(name = "Name")
	private String name;
	
	@Id
	@Column(name = "Aadhaar_Number")
	private Long aadhaarNumber;
	
	@Column(name = "Date_of_Birth")
	private String dateOfBirth;
	
	@Column(name = "Pan")
	private String pan;
	
	@Column(name = "Salary_Earned")
	private Double salaryEarned;
	
	@Column(name = "Allowances")
	private Double allowances;
	
	@Column(name = "Pension_Type")
	private String pensionType;
	
	@Column(name = "Name_of_Bank")
	private String bankName;
	
	@Column(name = "Bank_Account_Number")
	private String bankAccountNumber;
	
	@Column(name = "Bank_Type")
	private String bankType;
	
	public Pensioner() {
		super();
	}

	public Pensioner(String name, Long aadhaarNumber, String dateOfBirth, String pan, Double salaryEarned,
			Double allowances, String pensionType, String bankName, String bankAccountNumber, String bankType) {
		this.name = name;
		this.aadhaarNumber = aadhaarNumber;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.bankAccountNumber = bankAccountNumber;
		this.bankType = bankType;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(Long aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Double getSalaryEarned() {
		return salaryEarned;
	}

	public void setSalaryEarned(Double salaryEarned) {
		this.salaryEarned = salaryEarned;
	}

	public Double getAllowances() {
		return allowances;
	}

	public void setAllowances(Double allowances) {
		this.allowances = allowances;
	}

	public String getPensionType() {
		return pensionType;
	}

	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	@Override
	public String toString() {
		return "Pensioner [name=" + name + ", aadhaarNumber=" + aadhaarNumber + ", dateOfBirth=" + dateOfBirth
				+ ", pan=" + pan + ", salaryEarned=" + salaryEarned + ", allowances=" + allowances + ", pensionType="
				+ pensionType + ", bankName=" + bankName + ", bankAccountNumber=" + bankAccountNumber + ", bankType="
				+ bankType + "]";
	}
}