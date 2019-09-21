package com.sagar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HibernateTest {

	@RequestMapping("adduserdetails")
	public static void main(String[] args,@RequestParam("uid") int uid,@RequestParam("") String uname) {
		// TODO Auto-generated method stub
		
		//UsrDetails usr = new UsrDetails();
		//usr.setUid(uid);
		//usr.setUname("uname");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//session.save(usr);
		session.getTransaction().commit();  
	}

}
