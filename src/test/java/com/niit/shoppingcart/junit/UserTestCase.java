package com.niit.shoppingcart.junit;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

import junit.framework.TestCase;

public class UserTestCase extends TestCase {

	@Autowired
	static
	UserDAO userDAO;

	@Autowired
	static
	 User user;

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	public static void init()
	{
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingcart");
	context.refresh();
	userDAO=(UserDAO)context.getBean("userDAO");
	user=(User)context.getBean("user");
	}
	
	@AfterClass
	public static void close()
	{
		context.close();
		userDAO=null;
	}
	
	@Test
	public void UserTestCase()
		{
		int size=userDAO.list().size();

		assertEquals("User list test case", 4,size);
		}
	
	@Test
	public void UsernameTestCase()
		{
		user=userDAO.get("NIIT");
		String name=user.getName();
		
		assertEquals("Name test case","niit",name);	
		}
}
