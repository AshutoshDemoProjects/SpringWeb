package edu.iet.springHibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iet.springHibernate.dao.UserDao;
import edu.iet.springHibernate.model.User;

@Service
public class UserServiceImpl implements UserService {
 
   @Autowired
   private UserDao userDao;
 
   @Transactional
   public void save(User user) {
      userDao.save(user);
   }
 
   @Transactional
   public List<User> list() {
      return userDao.list();
   }
}
