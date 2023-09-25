package com.insurance.insuranceCompany.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.insurance.insuranceCompany.model.LoginClass;
import com.insurance.insuranceCompany.model.OTPclass;
import com.insurance.insuranceCompany.repository.NetworkHospitalRepository;
import com.insurance.insuranceCompany.repository.PackagesRepository;
import com.insurance.insuranceCompany.repository.RepositoryAdmin;

@Controller
public class InsuranceController {
	
	RepositoryAdmin rep;
	NetworkHospitalRepository nhr;
	PackagesRepository pr;
	
	@Autowired
	public InsuranceController(RepositoryAdmin rep, NetworkHospitalRepository nhr, PackagesRepository pr){
		this.rep = rep;
		this.nhr = nhr;
		this.pr = pr;
	}
	
	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("login", new LoginClass());
		return "loginPage";
	}
	
	@PostMapping("/adminLogin")
	public String adminlogin(HttpServletRequest request, @ModelAttribute("login") LoginClass lc, Model model ) {
		System.out.println("came to this method  "+lc);
		int check=rep.checkCredentials(lc);
		if(check==1) {
			model.addAttribute("hospitalCount", nhr.getHospitalsCount());
			model.addAttribute("packageCount", pr.getPackagesCount());
			return "dashboard";
		}
		
		model.addAttribute("user_name", "lc.getUser_name()");
        model.addAttribute("password", "lc.getPassword()");
        model.addAttribute("errorMessage", "incorrect credentials"); 
		return "loginPage";
	}
	@GetMapping("/forgotpassword")
	public String forgotpassword(Model model) {
		model.addAttribute("to", "");
		model.addAttribute("login", new OTPclass());
		model.addAttribute("enotp", "");
		model.addAttribute("otp", "");
		
		return "forgotPasswordPage";
	}
	
}
