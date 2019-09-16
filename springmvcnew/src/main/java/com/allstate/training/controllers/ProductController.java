package com.allstate.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.allstate.training.entites.Product;
import com.allstate.training.services.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("/products")
	public ModelAndView getProducts() {
		System.out.println("controller called");
		ModelAndView mv=new ModelAndView();
		List<Product> products=null;
		try {
			products=productService.getProducts();
			mv.addObject("listproducts",products);
			mv.setViewName("product");
		}catch(RuntimeException e) {
			mv.addObject("listproducts",e.getMessage());
			mv.setViewName("product");
		}
		return mv;
	}

}
