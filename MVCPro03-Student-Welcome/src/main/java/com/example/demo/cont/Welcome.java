package com.example.demo.cont;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

	@GetMapping("/")
	public String welcome(Model model) {
		String msg = "Welcome Inam Ahmad Baig";
		model.addAttribute("welcome", msg);
		return "hello";
	}
}
