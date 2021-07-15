package com.example.Addition.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.Addition.Entity.Addition;
@Controller
public class AddtionController {
	
	
	@GetMapping("index")
	public String addNumber(Model model) {
		model.addAttribute("addition", new Addition());
		return "index";
	}
	
	@PostMapping("addition")
	public String addTwoNumber(@ModelAttribute Addition addition, BindingResult result, Model model) {
		model.addAttribute("addition", addition);
		return "result";
	}

}
