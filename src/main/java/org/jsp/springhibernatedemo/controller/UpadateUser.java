package org.jsp.springhibernatedemo.controller;

import org.jsp.springhibernatedemo.dao.UserDao;
import org.jsp.springhibernatedemo.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpadateUser {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-hib.xml");
	UserDao dao=context.getBean("dao", UserDao.class);
	User u=new User();
	u.setId(1);
	u.setName("yuva");
	u.setPhone(2525);
	u.setPassword("abc1234");
	dao.updateUser(u);
}
}
