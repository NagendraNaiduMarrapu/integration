package com.insurance.insuranceCompany.model;


import java.util.Date;

public class CustomerModel {
	private int custId;
    private String custFname;
    private String custLname;
    private Date custDob;
    private String custAddress;
    private char custGender;
    private Date custCdate;
    private long custAadhar;
    private String custStatus;
    private Date custLuudate;
    private int custLuuser;
	
    public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerModel(int custId, String custFname, String custLname, Date custDob, String custAddress,
			char custGender, Date custCdate, long custAadhar, String custStatus, Date custLuudate, int custLuuser) {
		super();
		this.custId = custId;
		this.custFname = custFname;
		this.custLname = custLname;
		this.custDob = custDob;
		this.custAddress = custAddress;
		this.custGender = custGender;
		this.custCdate = custCdate;
		this.custAadhar = custAadhar;
		this.custStatus = custStatus;
		this.custLuudate = custLuudate;
		this.custLuuser = custLuuser;
	}

	@Override
	public String toString() {
		return "CustomerModel [custId=" + custId + ", custFname=" + custFname + ", custLname=" + custLname
				+ ", custDob=" + custDob + ", custAddress=" + custAddress + ", custGender=" + custGender
				+ ", custCdate=" + custCdate + ", custAadhar=" + custAadhar + ", custStatus=" + custStatus
				+ ", custLuudate=" + custLuudate + ", custLuuser=" + custLuuser + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustFname() {
		return custFname;
	}

	public void setCustFname(String custFname) {
		this.custFname = custFname;
	}

	public String getCustLname() {
		return custLname;
	}

	public void setCustLname(String custLname) {
		this.custLname = custLname;
	}

	public Date getCustDob() {
		return custDob;
	}

	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public char getCustGender() {
		return custGender;
	}

	public void setCustGender(char custGender) {
		this.custGender = custGender;
	}

	public Date getCustCdate() {
		return custCdate;
	}

	public void setCustCdate(Date custCdate) {
		this.custCdate = custCdate;
	}

	public long getCustAadhar() {
		return custAadhar;
	}

	public void setCustAadhar(long custAadhar) {
		this.custAadhar = custAadhar;
	}

	public String getCustStatus() {
		return custStatus;
	}

	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}

	public Date getCustLuudate() {
		return custLuudate;
	}

	public void setCustLuudate(Date custLuudate) {
		this.custLuudate = custLuudate;
	}

	public int getCustLuuser() {
		return custLuuser;
	}

	public void setCustLuuser(int custLuuser) {
		this.custLuuser = custLuuser;
	}

}
