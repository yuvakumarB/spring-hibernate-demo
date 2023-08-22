package org.jsp.springhibernatedemo.dao;

import javax.transaction.Transactional;

import org.jsp.springhibernatedemo.dto.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {
	@Transactional
	public User saveUser(User user) {
		getHibernateTemplate().save(user);
		return user;
}
	@Transactional
	public User updateUser(User user) {
		getHibernateTemplate().update(user);
		return user;
	}
	@Transactional
	public User fetchUser(int id) {
		return getHibernateTemplate().get(User.class,id);	
	}
	@Transactional
	public User deleteUser(User user) {
		getHibernateTemplate().delete(user);
		return user;
	}
	
}
