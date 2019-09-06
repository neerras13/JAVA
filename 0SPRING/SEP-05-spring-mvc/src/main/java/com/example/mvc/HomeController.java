package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome()
	{
		return "main-menu";
	}
	
	@RequestMapping(method = RequestMethod.GET,name="/showOption")
	public String showOption() {
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.POST,name="/student")
	public String data() {
		return "studentData";
	}
}