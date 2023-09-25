package com.insurance.insuranceCompany.repository;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.insurance.insuranceCompany.Dao.CustomerDAOInterface;
import com.insurance.insuranceCompany.model.CustomerModel;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryInterface{
	
	@Autowired
	CustomerDAOInterface cdao;
	
	@Override
	public ArrayList<CustomerModel> getAllCustomers() {
		return cdao.getAllCustomers();
	}

	@Override
	public CustomerModel getCustomerId(int Id) {
		return cdao.getCustomerById(Id);
	}
	
}