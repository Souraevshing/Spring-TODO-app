package com.springapp.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private AuthLogin auth;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(ModelMap model)
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String welcome(ModelMap model, @RequestParam String name, @RequestParam String password)
	{
		String errorMessage = "Invalid Password";
		boolean validUser = auth.isUserValid(name, password);
		if(!validUser)
		{
			model.put("error", errorMessage);
			return "login";
		}
			model.put("name", name);
			model.put("password", password);
			return "welcome";
	}
}
