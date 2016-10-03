package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Product;

public interface ProductDAO {
	
	public void saveOrUpdate(Product product);
	

	public void delete(int id);

	public Product get(int id);

	public List<Product> list();

}
