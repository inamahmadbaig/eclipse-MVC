package com.nit.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloMsg {

	@GetMapping("/")
	public String HelloMsgJsp(Model model) {
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		String formattedTime = time.format(formatter);
		
		// 3. JSP page ke liye time ko Model mein add karna
		model.addAttribute("myTime", formattedTime);
		return "hello";
		
	}
	
}
