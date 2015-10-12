package com.sapient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.models.Employee;

@Controller
public class NavigController {

	@RequestMapping(value="/index", method= RequestMethod.GET)
	public String homePage(){
		return "index";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView employeePage() {
		return new ModelAndView("employee", "command", new Employee());
	}
}
