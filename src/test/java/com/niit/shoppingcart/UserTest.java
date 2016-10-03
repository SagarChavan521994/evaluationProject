package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();

		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		
		User user = (User) context.getBean("user");
		
		
		user.setId("durvesh");
		user.setName("Durvesh");
		user.setAdd("ADD001");
		user.setMob("9012345678");
		user.setEmail("durvesh@gmail.com");
		user.setPassword("durvesh");
		user.setAdmin((byte) 0);
		
		System.out.println("Hi");
		
		userDAO.saveOrUpdate(user);
		
		System.out.println("save");
		if(userDAO.get("admin")==null){
			System.out.println("User Does Not Exist");
		}else{
			System.out.println("User Exist....");
		}
	}
}
