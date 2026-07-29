package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping; // Add this import

import com.nit.entity.Employee;

@Controller
public class EmpController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/from")
	public String enterDeatils(@ModelAttribute("emp") Employee employee) {
		return "page";
	}

	// ADD THIS METHOD to handle the form submission
	@PostMapping("/from")
	public String processDetails(@ModelAttribute("emp") Employee employee) {
		
		// You can add your logic here, like saving the employee to a database.
		// For now, let's just print it to the server console to verify it works.
		System.out.println("Employee Submitted: " + employee);
		
		// Redirecting prevents the "Confirm Form Resubmission" browser warning if the user refreshes
		return "success"; 
	}
}