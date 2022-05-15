package io.fse.processpensionservice.model;

public class Pension {
	
	private String name;
	private long aadhaarNumber;
	private String dateOfBirth;
	private String pan;
	private Double salaryEarned;
	private Double allowances;
	private String pensionType;
	private String bankName;
	private String bankAccountNumber;
	private String bankType;
	private Double pensionAmount;
	private Double serviceCharges;
	
	public Pension() {
		super();
	}

	public Pension(String name, long aadhaarNumber, String dateOfBirth, String pan, Double salaryEarned,
			Double allowances, String pensionType, String bankName, String bankAccountNumber, String bankType,
			Double pensionAmount, Double serviceCharges) {
		super();
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
		this.pensionAmount = pensionAmount;
		this.serviceCharges = serviceCharges;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(long aadhaarNumber) {
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

	public Double getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(Double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

	public Double getServiceCharges() {
		return serviceCharges;
	}

	public void setServiceCharges(Double serviceCharges) {
		this.serviceCharges = serviceCharges;
	}
	
}
