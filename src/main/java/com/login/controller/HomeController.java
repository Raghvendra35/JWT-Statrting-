
package com.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{

	@GetMapping("/welcome")
	public String welcome()
	{
		 String text="Welcome to India !!!";
	   //  text+="this page is not allow unauthrization person";
	
	     return text;
	}
}
