package com.insurance.insuranceCompany.Dao;


import java.util.ArrayList;

import com.insurance.insuranceCompany.model.CustomerModel;



public interface CustomerDAOInterface {

	ArrayList<CustomerModel> getAllCustomers();

	CustomerModel getCustomerById(int id);
}
