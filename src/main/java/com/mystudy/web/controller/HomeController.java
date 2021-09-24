package com.mystudy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/index")
	public String index(Model model)
	{
		model.addAttribute("data", "[Spring MVC] Index View");
		
		return "index";
	}
	
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
//	{
//		ModelAndView mv = new ModelAndView("index");
//		
//		mv.addObject("data", "Spring MVC Index View");
//		
//		return mv;
//	}

}
