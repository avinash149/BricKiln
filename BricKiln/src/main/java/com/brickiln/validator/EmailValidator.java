package com.brickiln.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.*;

import com.brickiln.entity.*;
import com.brickiln.dao.*;

@Controller
public class EmailValidator implements Validator {
 
	@Autowired
	UserDao dao;
	
	public boolean supports(Class<?> c) {
		
		// this method is used to specify objects
				// of which classes can be validated using
				//this validator
				return c.equals(User.class);
	}

	public void validate(Object model, Errors bindingResult) {
        
		// this method contains the custom validation
				//logic.
				User user=(User)model;
				if(dao.exists(user.getEmail()))
				{
					//An error message is stored in the
					//bindingResult object.
					bindingResult.rejectValue(
						"mailId",
						"error.mailId", 
						"MailId already registered."	);
				}
	}

}
