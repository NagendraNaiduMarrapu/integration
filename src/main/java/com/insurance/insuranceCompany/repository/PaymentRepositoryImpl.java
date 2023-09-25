package com.insurance.insuranceCompany.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.insurance.insuranceCompany.Dao.PaymentDAOInterface;
import com.insurance.insuranceCompany.model.PaymentModel;

@Repository
public class PaymentRepositoryImpl implements PaymentRepositoryInterface {

	@Autowired
	PaymentDAOInterface pdaoi;

	@Override
	public ArrayList<PaymentModel> getAllTransaction() {
		// TODO Auto-generated method stub
		return pdaoi.getAllTransaction();
	}
}
