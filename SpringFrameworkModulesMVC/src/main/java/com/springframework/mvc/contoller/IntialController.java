/**
 * 
 */
package com.springframework.mvc.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springframework.mvc.bean.Employee;

/**
 * @author Narsingh Mahankali
 *
 */
@Controller
public class IntialController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView init() {
		//call service layer
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("dummyValueKey", "Coming from Controller class");
		return modelAndView;
	}
	
	@RequestMapping(value = "openRegPage", method = RequestMethod.GET)
	public ModelAndView openRegistration() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Registration");
		return modelAndView;
	}
	
	@RequestMapping(value = "OpenSearchPage", method = RequestMethod.GET)
	public ModelAndView openSearch() {
		ModelAndView modelAndView = new ModelAndView();
		List<Employee> dummyList = new ArrayList<Employee>();
		mockData(dummyList);
		modelAndView.setViewName("Search");
		modelAndView.addObject("DummySearchResults", dummyList);
		return modelAndView;
	}

	/**
	 * @param dummyList
	 */
	private void mockData(List<Employee> dummyList) {
		Employee employee = null;
		for(int i=0;i<=5;i++) {
			employee = new Employee();
			dummyList.add(employee);
			
		}
	}

}
