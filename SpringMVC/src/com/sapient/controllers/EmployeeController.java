package com.sapient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.models.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value= "/addEmployee", method = RequestMethod.POST)
	public String addEmp(@ModelAttribute("empModel") Employee emp, ModelMap model){
		model.addAttribute("id", emp.getId());
		model.addAttribute("name", emp.getName());
		model.addAttribute("age", emp.getAge());
		
		return "result";
	}
}
