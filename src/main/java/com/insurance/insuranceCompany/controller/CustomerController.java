package com.insurance.insuranceCompany.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.insurance.insuranceCompany.repository.CustomerRepositoryInterface;



@Controller
public class CustomerController {
	
	@Autowired
	CustomerRepositoryInterface cri;
	
	@GetMapping("/Customers")
	public String getCustomers(Model model) {
		model.addAttribute("customers", cri.getAllCustomers());
		return "customerList";
	}
	
	@GetMapping("/getCustomerDetails")
	public String getCustomerDetails(@RequestParam("IdVal") String Id, Model model) {
		model.addAttribute("customer", cri.getCustomerId(Integer.parseInt(Id)));
		return "customerDetails";
	}
}
