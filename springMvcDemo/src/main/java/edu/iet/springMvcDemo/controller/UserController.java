package edu.iet.springMvcDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.iet.springMvcDemo.service.ProductService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/allProduct")
	String forAllProducts(Model model) {
		model.addAttribute("products", productService.getAllProduct());
		return "users/showProducts";
	}
}
