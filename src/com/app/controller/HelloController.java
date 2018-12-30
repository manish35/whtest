package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping("/show")
	public ModelAndView showPage(){
		//System.out.println("calling show..");
		ModelAndView mv=new ModelAndView("hello");
		return mv;
				
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView hello() {
		//System.out.println("Calling model");
		ModelAndView mv = new ModelAndView();
		mv.addObject("keys", "Hello JSP.!!!");
		mv.setViewName("Welcome");
		return mv;
	}
}
