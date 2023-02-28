package com.placement.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.User;
import com.placement.repository.UserRepository;
 

@Service
@Transactional
public class UserService {
 
    @Autowired
    private UserRepository us;
     
    public List<User> listAll() {
        return us.findAll();
    }
     
    public void save(User user) {
    	us.save(user);
    }
    public User get(Integer id) {
    	return us.findById(id).get();
	}
   
    public void delete(Integer id) {
    	us.deleteById(id);
    }
}