package com.cg.ska.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/index")
	public ModelAndView showIndex(HttpServletRequest req){
		return new ModelAndView("index","appTitle",req.getServletContext().getServletContextName());
	}
}
