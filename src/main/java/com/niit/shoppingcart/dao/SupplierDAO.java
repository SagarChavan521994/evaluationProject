package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;

public interface SupplierDAO {
	
	public void saveOrUpdate(Supplier supplier);
	

	public void delete(int id);

	public Supplier get(int id);

	public List<Supplier> list();
	
	public Supplier getByName(int name);

}
