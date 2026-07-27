package com.nit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Product {

	
	@GetMapping("/")
	public String productDataInsert(Model model) {
		Map<String, Object> map = new HashMap<>();
		
		map.put("id", 101);
		map.put("name", "Laptop");
		map.put("brand", "Dell");
		map.put("price", 65000);
		//add model
		model.addAllAttributes(map);
		//lvn .jsp
		return "Product";
		
	}
}
