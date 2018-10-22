package com.brickiln;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.brickiln.dao.BrickDao;
import com.brickiln.entity.Brick;


@Controller
public class BrickController {

//Dependency of the controller
	@Autowired
	BrickDao dao;

	
//Method to process brickMaster request
	@RequestMapping("/newBrick.mvc")
	public ModelAndView newBrick(@ModelAttribute Brick brick)
	{
		List<Brick> brickList=dao.allBrick();
		ModelAndView mav = new ModelAndView();
		mav.addObject("brick",brickList);
		mav.setViewName("newBrick");
		return mav;
	}
	
//method to process addEmployee request
	@RequestMapping(value="addBrick.mvc", method=RequestMethod.POST)
	public ModelAndView addBrick(@Valid@ModelAttribute Brick brick, BindingResult resultValidator)
	{
			ModelAndView mav = new ModelAndView();
			if(resultValidator.hasErrors())
			{
				mav.setViewName("newBrick");
				mav.addObject("brick", brick);
			}
			else 
			{
				dao.save(brick);
				mav.setViewName("brickAdded");
				mav.addObject("brick", brick);
			}
			return mav;
		/*	dao.save(brick);
			
			return "redirect:newBrick.mvc";*/
		
	}
	
//Method to process delete request
	@RequestMapping(value="/deleteBrick.mvc", method=RequestMethod.GET)
	public String deleteEmployee(@RequestParam("id") int id)
	{
		dao.remove(id);
		return "redirect:newBrick.mvc";
	}
	
//method to process addEmployee request
	@RequestMapping(value="editBrick.mvc", method=RequestMethod.GET)
	public String editBrick(@RequestParam("id") int id)
	{
			return "redirect:newBrick.mvc";		
	}
}
