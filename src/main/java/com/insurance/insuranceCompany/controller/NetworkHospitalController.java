package com.insurance.insuranceCompany.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.insurance.insuranceCompany.model.NetworkHospitals;
import com.insurance.insuranceCompany.repository.NetworkHospitalRepository;

@Controller
public class NetworkHospitalController {
	
	@Autowired
	private NetworkHospitalRepository nr;
	
	@GetMapping(value="/hospitals")
	public String getAllHospitals(HttpServletRequest request, Model model ){
		int hospitalCount = nr.getAllHospitals().size();
		System.out.println(hospitalCount+"hiiii");
		model.addAttribute("networkHospital", new NetworkHospitals());
		model.addAttribute("hospitals", nr.getAllHospitals());
		model.addAttribute("hospitalCount", hospitalCount);
		return "networkHospitals";
	}
	
	@PostMapping("/addhospital")
	public String addhospital(Model model,@ModelAttribute("networkHospital") NetworkHospitals netHsp) {
		System.out.println(netHsp);
		int x=nr.addHospital(netHsp);
		model.addAttribute("networkHospital", new NetworkHospitals());
		model.addAttribute("hospitals", nr.getAllHospitals());
		if(x==1) model.addAttribute("msg", "hospital added successfully");
		else model.addAttribute("msg", "error occurred while adding hospital");
		return "networkHospitals";
	}
	
	
	@PostMapping(value="/deleteHospital")
	@ResponseBody
	public String deleteHospital(@ModelAttribute("hospitalId") String hid) {
		System.out.println(hid);
		int x=nr.deleteHospital(Integer.parseInt(hid));
		if(x==1) return "hospital deleted successfully...!";
		return "error occured";
		
	}

}
