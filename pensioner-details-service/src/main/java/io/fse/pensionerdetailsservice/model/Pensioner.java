package io.fse.pensionerdetailsservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Pension")
//@Data
//@NoArgsConstructor
@Getter
@Setter
public class Pensioner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	
	@Column(name = "Name")
	private String name;
	
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

	public Pensioner(Long id, String name, Long aadhaarNumber, String dateOfBirth, String pan, Double salaryEarned,
			Double allowances, String pensionType, String bankName, String bankAccountNumber, String bankType) {
		this.id = id;
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

	public Pensioner() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Pensioner [id=" + id + ", name=" + name + ", aadhaarNumber=" + aadhaarNumber + ", dateOfBirth="
				+ dateOfBirth + ", pan=" + pan + ", salaryEarned=" + salaryEarned + ", allowances=" + allowances
				+ ", pensionType=" + pensionType + ", bankName=" + bankName + ", bankAccountNumber=" + bankAccountNumber
				+ ", bankType=" + bankType + "]";
	}
	
	
	
	
}
