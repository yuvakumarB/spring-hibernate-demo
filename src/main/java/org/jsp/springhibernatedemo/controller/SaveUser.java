package org.jsp.springhibernatedemo.controller;

import org.jsp.springhibernatedemo.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class SaveUser {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-hib.xml");
		HibernateTemplate template=context.getBean(HibernateTemplate.class); 
		User u=new User();
		u.setId(1);
		u.setName("yuva");
		u.setPhone(12345);
		u.setPassword("a123");
		template.save(u);
		
}
}
