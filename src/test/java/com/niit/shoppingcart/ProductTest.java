package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		
		Product product = (Product) context.getBean("product");
		
		product.setId(123);
		product.setName("PRDName5");
		product.setPrice(10000);
		/*product.setCategory_id(567);
		product.setSupplier_id(6576);*/
		System.out.println("Hi");
		
		productDAO.saveOrUpdate(product);
		
		System.out.println("save");
		if(productDAO.get(345)==null){
			System.out.println("Product Does Not Exist");
		}else{
			System.out.println("Product Exist....");
		}
	}

}
