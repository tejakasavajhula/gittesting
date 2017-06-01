package com.teja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("abc", "Hellooo... Do you hear me...");
		return "welcome";
	}
		
	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("def", "Hello from the other side...");
		return "welcome";
		
	}
}