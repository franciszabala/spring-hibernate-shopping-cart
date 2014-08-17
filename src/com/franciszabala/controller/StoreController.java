package com.franciszabala.controller;

import java.util.List;

import com.franciszabala.service.ProductService;
import com.franciszabala.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/store")
public class StoreController {
	
	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}


	@RequestMapping("/home")
	public String showStoreHomePage(Model model) {
		//model.addAttribute("form", new NewBankAccountForm());
		//model.addAttribute("accountTypes", accountTypeService.findAll());
		List<Product> myList = productService.findAll();
		
		for (Product myProduct : myList) {
			System.out.println(myProduct.getProductName());
		}
		
		return "store/index";
	}

}
