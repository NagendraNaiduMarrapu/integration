package com.insurance.insuranceCompany.Dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.insurance.insuranceCompany.model.CustomerModel;
import com.insurance.insuranceCompany.rowMapper.CustomerRowMapper;


@Component
public class CustomerDAOImpl implements CustomerDAOInterface {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public ArrayList<CustomerModel> getAllCustomers() {
		String stmt = "SELECT * FROM Customers";
		return (ArrayList<CustomerModel>) jdbcTemplate.query(stmt, new CustomerRowMapper());
	}

	@Override
	public CustomerModel getCustomerById(int id) {
		String stmt = "SELECT * FROM Customers WHERE cust_id = ?";
		return jdbcTemplate.queryForObject(stmt, new CustomerRowMapper(), new Object[] { id });
	}

}