package com.sagar.mvc.project.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddService {
	
	public int add(int a,int b){
		return a+b;
		
	}
	
	@ResponseBody
	@RequestMapping("/addservice/{userName}")
	public String display(@PathVariable("userName") String name) {
		
		return "hello :- " +name;
		
	}
	
}
