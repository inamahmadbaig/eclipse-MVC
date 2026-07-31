package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ElectricityController {

	@GetMapping("/")
	public String enterDetails() {
		return"inputdata";
	}
	
	@PostMapping("/billCalculator")
	public String billCalculator(@RequestParam("cName") String name,
								@RequestParam("units") Long units,Model model
			) {
		Long bill = units * 8;
		if(units > 50) {
			bill = units * 10;
		}
		model.addAttribute("cName", name);
		model.addAttribute("units", units);
		model.addAttribute("bill", bill);
				return "billDetails";
		
	}
}
