package com.allstate.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.training.daos.ProductDao;
import com.allstate.training.entites.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productDao;

	public void addProduct(Product p) {
		if(p.getBrand().matches("[a-zA-z]{4,}")) {
			productDao.addProduct(p);
		}
		throw new RuntimeException("brand is invalid");		
	}

	public void updateProductCost(int cost, int pid) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

	public void deletProduct(int pid) {
		// TODO Auto-generated method stub
		
	}

	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProducts() {
		List<Product> products=productDao.getProducts();
		if(!products.isEmpty()) {
			return products;
		}else {
			throw new RuntimeException("No Products available");
		}	
	}

	public List<Product> getProductsByBrand(String brand) {
		List<Product> products=productDao.getProductsByBrand(brand);
		if(!products.isEmpty()) {
			return products;
		}else {
			throw new RuntimeException("No Products available with this brand");
		}	
	}

}
