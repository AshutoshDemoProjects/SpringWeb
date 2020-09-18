package edu.iet.springMvcDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.iet.springMvcDemo.bean.User;
@Service
public class UserServiceImpl implements UserService {
	private List<User> uList=new ArrayList<>();
	public UserServiceImpl() {
		uList.add(new User("Admin","pass123",85245679,"admin"));
		uList.add(new User("Ashutosh","pass345",147852963,"user"));
	}
	public void addUser(User u) {
		uList.add(u);	
	}
	public List<User> getAllUser(){
		return uList;
	}
	public User getUser(int id){
		return uList.stream()
				.filter(u->u.getUserId()==id)
				.collect(Collectors.toList()).get(0);
	}
	public User validate(User u) {
		return uList.stream()
				.filter(user->user.getUserName().equals(u.getUserName()) && user.getPass().equals(u.getPass()))
				.collect(Collectors.toList())
				.get(0);
	}
}
