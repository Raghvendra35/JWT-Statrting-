package com.login.model;

import lombok.Data;
import lombok.ToString;


public class JwtRequest 
{

	String userName;
	String passWord;
	
	
	public JwtRequest() 
	{
		super();
	}
	
	
	public JwtRequest(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getPassWord() {
		return passWord;
	}
	
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
	
}
