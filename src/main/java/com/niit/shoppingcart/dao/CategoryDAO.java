package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {
	
	public void saveOrUpdate(Category category);
	
	public void delete(int id);

	public Category get(int id);

	public List<Category> list();
	
	public Category getByName(int name);

}
