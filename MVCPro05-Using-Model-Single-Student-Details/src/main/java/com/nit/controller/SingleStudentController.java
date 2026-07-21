package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingleStudentController {

	@GetMapping("/")
	public String singleStudent(Model model) {
		model.addAttribute("name", "Inam ahmad Baig");
		model.addAttribute("course", "java Full Stack");
		model.addAttribute("city", "Hyderabad");
		//LVN
		return "Student";
	}
}
