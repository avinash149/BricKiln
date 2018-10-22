package com.brickiln;


import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.brickiln.dao.EmployeeDao;
import com.brickiln.entity.Employee;


@Controller
public class RateController {

	//Dependency of the controller
	@Autowired
	EmployeeDao dao;
	
	//Method to process rateMaster request
	@RequestMapping("/rateMaster.mvc")
	public String execute()throws Exception
	{
		return "rateMaster";
	}
	
	
	
}
