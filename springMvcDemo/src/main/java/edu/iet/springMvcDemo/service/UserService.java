package edu.iet.springMvcDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.iet.springMvcDemo.bean.User;
@Service
public class UserService {
	private List<User> lUser=new ArrayList<>();
	public UserService() {
		lUser.add(new User("Admin","pass123",85245679,"admin"));
		lUser.add(new User("Ashutosh","pass345",147852963,"user"));
	}
	public void addUser(User u) {
		lUser.add(u);
	}
	public List<User> getAllUser(){
		return lUser;
	}
	public User getUser(int id){
		return lUser.stream()
				.filter(u->u.getUserId()==id)
				.collect(Collectors.toList()).get(0);
	}
}
