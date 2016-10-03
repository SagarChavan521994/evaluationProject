package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
@Entity
@Table(name = "PRODUCT")
@Component
public class Product {

	@Id
	@NotNull
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotNull
	@Column(name = "name")
	private String name;
	@NotNull
	@Column(name = "price")
	private int price;
	/*private int category_id;
	private int supplier_id;*/
	/*@ManyToOne
    @JoinColumn(name="category_id", nullable = false, updatable = false, insertable = false)
   	private Category category;
	@ManyToOne
	   @JoinColumn(name="supplier_id",nullable = false, updatable = false, insertable = false)
		private Supplier supplier;
	*/
	private String Fpath;
	//transient private MultipartFile file1;

	
	public String getFpath() {
		return Fpath;
	}

	public void setFpath(String fpath) {
		Fpath = fpath;
	}


	/*public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/*public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}*/
	
	/*public MultipartFile getFile1() {
		return file1;
	}

	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}

	public  String getFilePath(String path1,String contextpath)
	{	
		String fileName = null;
		if (!file1.isEmpty()) 
		{
	        try 
	        {       	
	        	
	            fileName = file1.getOriginalFilename();
	            byte[] bytes = file1.getBytes();
	            	String npath=path1+"\\resources\\images\\"+ fileName;
	        
	    				BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File(npath)));
	            buffStream.write(bytes);
	            buffStream.close();
	           String dbfilename=contextpath+"/resources/images/"+fileName;
	            
	            this.setFpath(dbfilename);
	            return dbfilename;
	        }
	        catch (Exception e) 
	        {
	            return "You failed to upload " + fileName + ": " + e.getMessage();
	        }
	    } 
		else 
		{
			return "Unable to upload. File is empty.";
		}
	}	*/

	
}
