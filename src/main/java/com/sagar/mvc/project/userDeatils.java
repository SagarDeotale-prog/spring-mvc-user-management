package com.sagar.mvc.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userDeatils {

	//String firstName1 = "Preeti";
	//String lastName1 = "Deotale";
	
	//@ResponseBody
	@RequestMapping(value="userdetails", method=RequestMethod.POST)
	public ModelAndView userDeatilsAdd(@RequestParam("firstName1") String firstName1,@RequestParam("lastName1") String lastName1) {
		
		ModelAndView model = new ModelAndView("view.jsp");
		model.addObject("fullName", " " +firstName1+  "  " +lastName1 );
		return model;
		
		//return firstName1  +"  "+ lastName1;
		
		
	}
}
