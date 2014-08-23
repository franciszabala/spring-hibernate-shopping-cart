package com.franciszabala.controller.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.franciszabala.model.Product;
import com.franciszabala.service.ProductService;

@Controller
@RequestMapping("/admin/product")
public class ProductManagementContoller {

	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	
	@RequestMapping
	public String showProductList(Model model) {		
		List<Product> productList = productService.findAll();
		model.addAttribute("productList",productList );
		return "admin/product/list-products";
	}
	
	//@RequestMapping (value="/addProductForm")
	//public String showAddProductPage() {
		//LoginFormBean formBean = new LoginFormBean();
		
		//formBean.getUserLogin().setUsername("default username");
		//send copy of login bean to the form
		//model.addAttribute("loginBackingBean",formBean);
	//	return "admin/product/add-product";
	//}
	
	@RequestMapping(value="/addProductForm")
	public String showAddProductPage(Model model) {
		
		model.addAttribute("product", new Product());
		return "admin/product/add-product";
	}
	
	@RequestMapping(value="/editProduct/{id}",  method=RequestMethod.GET)
	public String showItemDetailPage(@PathVariable int id, Model model) {
		//model.addAttribute("form", new NewBankAccountForm());
		//model.addAttribute("accountTypes", accountTypeService.findAll());
		Product product = productService.find(id);
		model.addAttribute("product", product);
		return "admin/product/edit-product";
	}
	
	@RequestMapping(value="/saveProduct", method=RequestMethod.POST)
	public String createProduct(Product product) {
		productService.create(product);
		return "redirect:/admin/product";
	}
	
	@RequestMapping(value="/updateProduct", method=RequestMethod.POST)
	public String updateProduct(Product product) {
		
		System.out.println(product);
		productService.update(product);
		return "redirect:/admin/product";
	}
	
	
}
