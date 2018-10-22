package com.brickiln;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brickiln.dao.UserDao;
import com.brickiln.entity.User;
import com.brickiln.validator.EmailValidator;;

@Controller
public class UserController {

		//Dependency of the controller
		@Autowired
		UserDao dao;
		
		@Autowired
		EmailValidator validator;
		
		@Autowired
		HttpSession session;
		
		//method to serve signup form
		@RequestMapping(value="/signup.mvc", method=RequestMethod.GET)
		public ModelAndView registrationForm()
		{
			ModelAndView mav=new ModelAndView();
			mav.setViewName("signup");
			mav.addObject("user",new User());
			return mav;
		}
		
		//method to process addEmployee request
		@RequestMapping(value="/register.mvc", method=RequestMethod.POST)
		public ModelAndView registerUser(@Valid @ModelAttribute	User user,	BindingResult validationResult)
		{
			//custom validation is applied
			/*if(validator.supports(User.class))
			{
				validator.validate(user, validationResult);
			}*/
			ModelAndView mav=new ModelAndView();
			if(validationResult.hasErrors())
			{
				mav.setViewName("signup");
				mav.addObject("user",user);
				return mav;
			}
			else
			{	
				dao.save(user);
				//viewName is stored in the ModelAndView
				mav.setViewName("registered");
				return mav;
			}
		}

		
		//Method to process login request
		@RequestMapping(value="/login.mvc",	method=RequestMethod.POST)
		public String registerUser(@RequestParam("email") String m,  @RequestParam("password") String p)
		{
			User user=dao.find(m,p);
			if(user==null)
			{
				return "relogin";
			}
			else
			{
				//user object is stored in the session
				session.setAttribute("user",user);
				return "home";
			}
		}
		
	
		
		//Method to process logout request
		@RequestMapping("/logout.mvc")
		public String logout()
		{
			//session is invalidated
			session.invalidate();
			return "loggedOut";
		}
		
		
		//Method to process view profile request
		@RequestMapping("/profile.mvc")
		public String viewProfile()
		{
			return "userProfile";
		}
		
		
		//Method to process update profile request
		@RequestMapping(value="/profileUpdate.mvc",	method=RequestMethod.POST)
		public String updateProfile(@ModelAttribute	User user)
		{
			//user details are also updated in the session
			User current=(User)session.getAttribute("user");
			current.setName(user.getName());
			current.setEmail(user.getEmail());
			//user is updated in the db
			dao.update(current);
			
			return "profileUpdated";
		}

}
