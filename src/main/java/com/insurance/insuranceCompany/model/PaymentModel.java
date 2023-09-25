package com.insurance.insuranceCompany.model;

public class PaymentModel {
	int inpp_id;
	int inpp_iplc_id;
	String inpp_trans_id;
	double inpp_amount;
	String inpp_paymode;

	public PaymentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentModel(int inpp_id, int inpp_iplc_id, String inpp_trans_id, double inpp_amount, String inpp_paymode) {
		super();
		this.inpp_id = inpp_id;
		this.inpp_iplc_id = inpp_iplc_id;
		this.inpp_trans_id = inpp_trans_id;
		this.inpp_amount = inpp_amount;
		this.inpp_paymode = inpp_paymode;
	}

	public int getInpp_id() {
		return inpp_id;
	}

	public void setInpp_id(int inpp_id) {
		this.inpp_id = inpp_id;
	}

	public int getInpp_iplc_id() {
		return inpp_iplc_id;
	}

	public void setInpp_iplc_id(int inpp_iplc_id) {
		this.inpp_iplc_id = inpp_iplc_id;
	}

	public String getInpp_trans_id() {
		return inpp_trans_id;
	}

	public void setInpp_trans_id(String inpp_trans_id) {
		this.inpp_trans_id = inpp_trans_id;
	}

	public double getInpp_amount() {
		return inpp_amount;
	}

	public void setInpp_amount(double inpp_amount) {
		this.inpp_amount = inpp_amount;
	}

	public String getInpp_paymode() {
		return inpp_paymode;
	}

	public void setInpp_paymode(String inpp_paymode) {
		this.inpp_paymode = inpp_paymode;
	}

	@Override
	public String toString() {
		return "PaymentModel [inpp_id=" + inpp_id + ", inpp_iplc_id=" + inpp_iplc_id + ", inpp_trans_id="
				+ inpp_trans_id + ", inpp_amount=" + inpp_amount + ", inpp_paymode=" + inpp_paymode + "]";
	}

}
