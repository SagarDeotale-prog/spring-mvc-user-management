package com.sagar.mvc.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sagar.hibernate.UsrDetails;
import com.sagar.mvc.project.service.AddService;

@RestController
public class AddController {
	
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("uid") int uid,@RequestParam("uname") String uname) {
		// TODO Auto-generated method stub
		
		UsrDetails usr = new UsrDetails(uid, uname);
		
		//usr.setUid(uid);
		//usr.setUname(uname);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//session.save(usr);
		session.delete(usr);
		session.getTransaction().commit();
		
		ModelAndView mv = new ModelAndView("view.jsp");
		mv.setViewName("view.jsp");
		mv.addObject("greetings", usr.getUname());
		return mv;
		
	}
		
		//int a = Integer.parseInt(request.getParameter("t1"));
		//int b = Integer.parseInt(request.getParameter("t2"));
		//int c = a+b;
		
/*//		AddService as = new AddService();
//		int c = as.add(a, b);
//		
//		ModelAndView mv = new ModelAndView("view.jsp");
//		//mv.setViewName("view.jsp");
//		mv.addObject("result", c);
//		mv.addObject("firstName", fname);
//		return mv;
*/		
	}
	
	/*@ModelAttribute
	public void addUser(Model model1, @RequestParam("lastName") String lastName) {
		
		model1.addAttribute("lastName", lastName);
	}
	
	@ModelAttribute
	public void addUserDetails(Model model2) {
		
		
		userDeatils uda = new userDeatils();
		String firstName1 = null;
		String lastName1 = null;
		
		uda.userDeatilsAdd(firstName1, lastName1);
		
		model2.addAttribute("fullName", uda);
	}*/
	

