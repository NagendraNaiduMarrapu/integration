package com.insurance.insuranceCompany.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insurance.insuranceCompany.model.Disease;
import com.insurance.insuranceCompany.model.InsurancePackages;
import com.insurance.insuranceCompany.model.NetworkHospitals;
import com.insurance.insuranceCompany.repository.PackagesRepository;

@Controller
public class PackagesController {
	
	@Autowired
	private PackagesRepository pr;
	
	@GetMapping("/packages")
	public String getAllPackages(Model model) {
		model.addAttribute("packages",pr.getAllPackages()) ;
		model.addAttribute("insurancePackage",new InsurancePackages());
		return "packages";
	}
	
	@PostMapping("/addpackage")
	public String addhospital(Model model,@ModelAttribute("insurancePackage") InsurancePackages insp) {
		System.out.println(insp);
		int x=pr.addPackage(insp);
		model.addAttribute("packages",pr.getAllPackages()) ;
		model.addAttribute("insurancePackage",new InsurancePackages());
		if(x==1) model.addAttribute("msg", "hospital added successfully");
		else model.addAttribute("msg", "error occurred while adding hospital");
		return "packages";
	}
	
	@PostMapping(value="/deletePackage")
	@ResponseBody
	public String deleteHospital(@ModelAttribute("packageId") String pid) {
		System.out.println(pid);
		int x=pr.deletePackage(Integer.parseInt(pid));
		if(x==1) return "Package deleted successfully...!";
		return "error occured";
		
	}
	
	@GetMapping(value="/showDiseases")
	public String showDiseases(@ModelAttribute("packageId") String pid,Model model) {
		System.out.println(pid);
		ArrayList<Disease> x=pr.showDiseases(Integer.parseInt(pid));
		 System.out.println(x.get(0));
		model.addAttribute("diseaseslist",x);
		return "diseases";
		
	}
//	@GetMapping("/diseases")
//	public String diseases(Model model) {
//	    List<String> diseasesList = (List<String>) model.getAttribute("diseaseslist");
//	  
//	    model.addAttribute("diseaseNames", diseasesList);
//	    return "diseases"; // Assuming "disease" is the name of your view (HTML) template
//	}
	
//	@GetMapping("/diseases")
//	public String diseases(@RequestParam(name = "jsonData", required = false) String jsonData, Model model) {
//	    // Check if the "jsonData" parameter is present in the URL
//		ArrayList<Disease> alist=null;
//	    if (jsonData != null) {
//	        try {
//	            // Parse the JSON data back into a List<String>
//	            ObjectMapper objectMapper = new ObjectMapper();
//	            alist = (ArrayList<Disease>)objectMapper.readValue(jsonData, new TypeReference<List<Disease>>() {});
//	            System.out.println(alist.get(0));
//	            // Add the disease names to the model for rendering in the view
//	            
//	        } catch (JsonProcessingException e) {
//	            e.printStackTrace();
//	            // Handle JSON parsing error
//	        }
//	    }
//	    
//	    // Your other logic here
//	    model.addAttribute("d", alist);
//	    return "diseases"; // Return the view name
//	}


}
