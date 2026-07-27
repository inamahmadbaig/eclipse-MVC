package com.nit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/")
	public String empDetails(Model model) {
		
		model.addAttribute("id", "101");
		model.addAttribute("name", "Inam Ahmad Baig");
		model.addAttribute("department", "IT");
		model.addAttribute("salary", 60000);
		//logical view name jsp
		return "Employee";
		
	}
}
