package com.springapp.auth;

import org.springframework.stereotype.Component;

@Component
public class AuthLogin {
	
	public boolean isUserValid(String user,String password)
	{
		if(user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("Sk@100600"))
			return true;
		return false;
	}
	
}
