package edu.iet.springHibernate.dao;

import java.util.List;

import edu.iet.springHibernate.model.User;

public interface UserDao {
	   void save(User user);
	   List<User> list();
	}
