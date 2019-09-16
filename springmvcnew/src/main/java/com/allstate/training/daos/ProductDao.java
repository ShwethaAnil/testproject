package com.allstate.training.daos;

import java.util.List;

import com.allstate.training.entites.Product;

public interface ProductDao {

	public void addProduct(Product p);
	public void updateProductCost(int cost,int pid);
	public void updateProduct(Product p);
	public void deletProduct(int pid);
	public Product getProductById(int pid);
	public List<Product> getProducts();
	public List<Product> getProductsByBrand(String brand);
	
}
