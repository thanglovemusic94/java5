package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.User;

@Controller
@RequestMapping("/home/")
public class HomeController {

	@Autowired
	User user;

	@RequestMapping("index")
	public String index(ModelMap model) {
//		model.addAttribute("user", user);
		return "home/index";
	}

	@ModelAttribute("user")
	public User getUser() {
		return user;
	}
}
