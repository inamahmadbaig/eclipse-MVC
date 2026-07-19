package com.nit.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeGreeting {

	@GetMapping("/")
	public String employeeMsg(Model model) {
		model.addAttribute("name", "Inam Ahmad");
		model.addAttribute("department", "IT");
		model.addAttribute("salary", 50000);
		
		return "employee";
	}
}
