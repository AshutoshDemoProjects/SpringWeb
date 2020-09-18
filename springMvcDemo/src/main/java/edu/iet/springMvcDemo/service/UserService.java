package edu.iet.springMvcDemo.service;

import java.util.List;

import edu.iet.springMvcDemo.bean.User;

public interface UserService {
	public void addUser(User u);
	public List<User> getAllUser();
	public User getUser(int id);
	public User validate(User u);
}
