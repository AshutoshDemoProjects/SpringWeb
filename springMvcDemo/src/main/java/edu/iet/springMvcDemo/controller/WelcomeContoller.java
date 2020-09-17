package edu.iet.springMvcDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.iet.springMvcDemo.bean.User;
import edu.iet.springMvcDemo.service.UserService;

@Controller
public class WelcomeContoller {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	String forIndexPage() {
		return "index123";// "/WEB-INF/views/index123.jsp";
	}

	@RequestMapping("/home")
	String forLink2() {
		return "home";// "/WEB-INF/views/home.jsp";
	}

	@GetMapping("/regis")
	String forRegistration(Model model) {
		model.addAttribute("command", new User());
		return "registration";

	}

	@PostMapping("/addUser")
	String forPostAddUser(@ModelAttribute("command") User u, Model model) {
		System.out.println(u);
		userService.addUser(u);
		return "redirect:/home";

	}
}
