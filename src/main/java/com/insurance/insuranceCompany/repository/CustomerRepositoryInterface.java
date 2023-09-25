package com.insurance.insuranceCompany.repository;



import java.util.ArrayList;

import com.insurance.insuranceCompany.model.CustomerModel;



public interface CustomerRepositoryInterface {

	ArrayList<CustomerModel> getAllCustomers();

	CustomerModel getCustomerId(int Id);
}