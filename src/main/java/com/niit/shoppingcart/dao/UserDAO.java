package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.User;

public interface UserDAO {
	
	public void saveOrUpdate(User user);
	
	public void delete(String id);

	public User get(String id);

	public List<User> list();
	
	public boolean isValidUser(String userid,String password);

}
