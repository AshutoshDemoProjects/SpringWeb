package edu.iet.springHibernate.service;

import java.util.List;

import edu.iet.springHibernate.model.User;

public interface UserService {
	void save(User user);

	List<User> list();
}
