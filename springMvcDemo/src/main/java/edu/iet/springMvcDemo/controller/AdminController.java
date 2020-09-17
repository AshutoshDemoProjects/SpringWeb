package edu.iet.springMvcDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.iet.springMvcDemo.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private UserService userService;
	@GetMapping("/allUser")
	String forAllUser(Model model) {
		model.addAttribute("users", userService.getAllUser());
		return "admin/allUser";
	}
}
