package com.brickiln;


import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brickiln.dao.EmployeeDao;
import com.brickiln.entity.Employee;

@Controller
public class EmployeeController {

	//Dependency of the controller
	@Autowired
	EmployeeDao dao;
	
	//Method to process newEmployee request
	@RequestMapping(value="newEmployee.mvc", method=RequestMethod.GET)
	public ModelAndView newEmployee()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("newEmployee");
		mav.addObject("emp", new Employee());
		return mav;
		//return "newEmployee";
	}
	
	//method to process addEmployee request
	@RequestMapping(value="/addEmployee.mvc", method=RequestMethod.POST)
	public ModelAndView addEmployee(@Valid @ModelAttribute Employee emp, BindingResult validationResult)
	{
		ModelAndView mav=new ModelAndView();
		if(validationResult.hasErrors())
		{
			mav.setViewName("newEmployee");
			mav.addObject("emp",emp);
			return mav;
		}
		else
		{	
			dao.save(emp);
			//viewName is stored in the ModelAndView
			mav.setViewName("employeeAdded");
			mav.addObject("emp", emp);
			return mav;
		}
	}
	
	//Method to process viewEmployee request
	@RequestMapping(value="/viewEmployee.mvc", method=RequestMethod.GET)
	public ModelAndView viewEmployee()
	{
		List<Employee> empList = (List<Employee>)dao.allEmployee();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("viewEmployee");
		mav.addObject("empList",empList);
		return mav;
	}
	
	//Method to process delete request
	@RequestMapping(value="/deleteEmployee.mvc", method=RequestMethod.GET)
	public String deleteEmployee(@RequestParam("id") int id)
	{
		dao.remove(id);
		return "redirect:viewEmployee.mvc";
	}
	
	/*//Method to process editEmployee request
	@RequestMapping(value="/editEmployee.mvc", method=RequestMethod.GET)
	public ModelAndView editEmployee(@RequestParam("id") int id)
	{
		List<Employee> empList=dao.find(id);
		System.out.println(empList);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("editEmployee");
		mav.addObject("emp",empList);
		return mav;
	}*/
	
}
