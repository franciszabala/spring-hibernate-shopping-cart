package com.franciszabala.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class ProductManagementContoller {

	@RequestMapping
	public String list(Model model) {
		String[] myArray = {"Herp", "Derp"};
		model.addAttribute("myArray",myArray );
		return "admin/product/list-products";
	}
	
}
