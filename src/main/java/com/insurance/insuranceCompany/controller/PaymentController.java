package com.insurance.insuranceCompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.insurance.insuranceCompany.repository.PaymentRepositoryInterface;

@Controller
public class PaymentController {

	@Autowired
	PaymentRepositoryInterface pri;

	@GetMapping(value = "/getPayments")
	public String getAllTransaction(Model model) {
		model.addAttribute("payments", pri.getAllTransaction());
		return "ViewPayments";
	}
}