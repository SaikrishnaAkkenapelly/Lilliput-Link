package com.sai.lilliputLink.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sai.lilliputLink.ui.service.UIService;

@Controller
public class UIContoller
{
	@Autowired
	UIService uiService;
	
	@GetMapping(path = "/home")
	public ModelAndView showHome()
	{
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("home");
		
		return modelAndView;
	}
	
	@PostMapping(path = "/get")
	public ModelAndView getShortURL(@RequestParam String longURL)
	{
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("longURL",longURL);
		modelAndView.addObject("shortURL",uiService.getShortURL(longURL));
		
		modelAndView.setViewName("home");
		
		return modelAndView;
	}
}
