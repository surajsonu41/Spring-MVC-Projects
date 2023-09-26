/**
 * 
 */
package com.springframework.mvc.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springframework.mvc.bean.Employee;
import com.springframework.mvc.service.EmployeeService;

/**
 * @author Narsingh Mahankali
 *
 */
@Controller
public class FormController {
	@Autowired
	EmployeeService service;
	
	@RequestMapping(value = "/EmployeeRegForm", method = RequestMethod.POST)
	public ModelAndView readRegForm(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView();
		service.insertData(employee);
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/searchEmp", method = RequestMethod.GET)
	public void readSearchData( @RequestParam("searchParam") String searchParam) {
		System.out.println(searchParam);
		
	}
}
