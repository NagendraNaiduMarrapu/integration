package com.insurance.insuranceCompany.repository;

import java.util.ArrayList;

import com.insurance.insuranceCompany.model.PaymentModel;

public interface PaymentRepositoryInterface {
	public ArrayList<PaymentModel> getAllTransaction();
}