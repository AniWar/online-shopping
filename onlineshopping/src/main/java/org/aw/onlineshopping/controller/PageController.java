package org.aw.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		 ModelAndView mv=new ModelAndView("page");
		 mv.addObject("greeting","Welcome to the world");
		 return mv;
	}
	
	@RequestMapping(value="query")
	public ModelAndView test(@RequestParam(value="greeting",required=false) String greeting){
		if(greeting==null){
			greeting="Welcome dear";
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	
	@RequestMapping(value="/test/{path}")
	public ModelAndView test2(@PathVariable(value="path",required=false)String id){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", id);
		return mv;
		
	}

}
