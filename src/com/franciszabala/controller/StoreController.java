package com.franciszabala.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.franciszabala.model.Product;
import com.franciszabala.service.ProductService;


@SessionAttributes("myRequestObject")
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
		List<Product> myProductList = productService.findAll();
		
//		for (Product myProduct : myList) {
//			System.out.println(myProduct.getProductName());
//		}
		model.addAttribute("myProductList", myProductList);
		return "store/index";
	}
	
	@RequestMapping("/ajaxtestmethod")
	public String ajaxTestMethod(@RequestParam String thoughtParam, Model model, HttpSession session) {
		
		//kasi wala pa sa session
		//model.addAttribute("myRequestObject", thoughtParam);
		
		
		session.setAttribute("myRequestObject", thoughtParam);
		//model.addAttribute("form", new NewBankAccountForm());
		//model.addAttribute("accountTypes", accountTypeService.findAll());
		List<Product> myProductList = productService.findAll();
		
//		for (Product myProduct : myList) {
//			System.out.println(myProduct.getProductName());
//		}
		model.addAttribute("myProductList", myProductList);
		
		System.out.println("*** Session data ***");
		Enumeration<String> e = session.getAttributeNames();
		  while (e.hasMoreElements()){
		    String s = e.nextElement();
		    System.out.println(s);
		    System.out.println("**" + session.getAttribute(s));
		  }


		
		return "store/index";
	}

}
