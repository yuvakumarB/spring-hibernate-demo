package org.jsp.springhibernatedemo.controller;

import org.jsp.springhibernatedemo.dao.UserDao;
import org.jsp.springhibernatedemo.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FetchUser {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-hib.xml");
	UserDao dao=context.getBean("dao", UserDao.class);
	User u=new User();
	u=dao.fetchUser(1);
	if(u!=null) {
		System.out.println(u);
		
	}
}
}
