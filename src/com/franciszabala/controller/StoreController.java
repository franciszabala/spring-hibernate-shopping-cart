package com.franciszabala.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.franciszabala.model.Product;
import com.franciszabala.service.ProductService;


@SessionAttributes("cart")
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
	    if(!model.containsAttribute("cart")) {
	    	System.out.println("created new cart");
	        model.addAttribute("cart", new ArrayList<Product>());
	      }
		
		List<Product> myProductList = productService.findAll();
		
		for (Product myProduct : myProductList) {
			System.out.println(myProduct.getProductName());
		}
		model.addAttribute("myProductList", myProductList);
		return "store/index";
	}

	
	@RequestMapping(value="/view/{id}",  method=RequestMethod.GET)
	public String showItemDetailPage(@PathVariable int id, Model model) {
	    if(!model.containsAttribute("cart")) {
	    	System.out.println("created new cart");
	        model.addAttribute("cart", new ArrayList<Product>());
	      }
		
		//model.addAttribute("form", new NewBankAccountForm());
		//model.addAttribute("accountTypes", accountTypeService.findAll());
		Product product = productService.find(id);
		model.addAttribute("product", product);
		return "store/itemdetail";
	}
	

	/**
	   * The shopping cart (list of products) is stored in session. Simply inject it using
	   * method argument
	   */
	  @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	  public String addProduct(@ModelAttribute Product product,
	      @ModelAttribute("cart") List<Product> cart) {
		  System.out.println("addProduct");
	    cart.add(product);
	    return "redirect:/store/home";
	  }
	  
	  @RequestMapping(value = "/checkout")
	  public String showCheckoutPage() {
		  System.out.println("showCheckoutPage");
	    return "store/checkout";
	  }
	
	
	
	@RequestMapping("/ajaxtestmethod")
	public void ajaxTestMethod(@RequestParam String thoughtParam, Model model, HttpSession session) {
		
		//kasi wala pa sa session
		//model.addAttribute("myRequestObject", thoughtParam);
		
		
		session.setAttribute("myRequestObject", thoughtParam);
		//model.addAttribute("form", new NewBankAccountForm());
		//model.addAttribute("accountTypes", accountTypeService.findAll());
		//List<Product> myProductList = productService.findAll();
		
//		for (Product myProduct : myList) {
//			System.out.println(myProduct.getProductName());
//		}
		//model.addAttribute("myProductList", myProductList);
		
		System.out.println("*** Session data ***");
		Enumeration<String> e = session.getAttributeNames();
		  while (e.hasMoreElements()){
		    String s = e.nextElement();
		    System.out.println(s);
		    System.out.println("**" + session.getAttribute(s));
		  }


		
		//return "store/index";
	}

}
