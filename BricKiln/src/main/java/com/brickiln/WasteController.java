package com.brickiln;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.brickiln.dao.UserDao;
import com.brickiln.entity.User;

@Controller
public class WasteController {

	//Dependency of the controller
	@Autowired
	UserDao dao;
	
	//Method to process pathaiMaster request
	@RequestMapping("/waste.mvc")
	public String execute()throws Exception
	{
		return "waste";
	}
	
}
