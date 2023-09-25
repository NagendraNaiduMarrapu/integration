package com.insurance.insuranceCompany.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.insurance.insuranceCompany.model.CustomerModel;



public class CustomerRowMapper implements RowMapper<CustomerModel> {
    @Override
    public CustomerModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        CustomerModel customer = new CustomerModel();
        customer.setCustId(rs.getInt("cust_id"));
        customer.setCustFname(rs.getString("cust_fname"));
        customer.setCustLname(rs.getString("cust_lname"));
        customer.setCustDob(rs.getDate("cust_dob"));
        customer.setCustAddress(rs.getString("cust_address"));
        customer.setCustGender(rs.getString("cust_gender").charAt(0));
        customer.setCustCdate(rs.getDate("cust_cdate"));
        customer.setCustAadhar(rs.getLong("cust_aadhar"));
        customer.setCustStatus(rs.getString("cust_status"));
        customer.setCustLuudate(rs.getDate("cust_luudate"));
        customer.setCustLuuser(rs.getInt("cust_luuser"));
        
        return customer;
    }
}