package com.raj.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raj.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Raj");
		employee.setSalary(10000);
		
		Employee employee2 = new Employee();
		employee2.setId(456);
		employee2.setName("Rambo");
		employee2.setSalary(20000);
		
		Employee employee3 = new Employee();
		employee3.setId(789);
		employee3.setName("Rambabu");
		employee3.setSalary(30000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		modelAndView.addObject("employees", employees);
		
		return modelAndView;
	}
}
