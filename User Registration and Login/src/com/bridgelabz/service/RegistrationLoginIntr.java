package com.bridgelabz.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.model.Userdetails;


//interface for Registration and Log in

public interface RegistrationLoginIntr {

	public int doRegister(Userdetails user);
	public void doLogin(String email,String firstname,HttpServletRequest request,HttpServletResponse response);
	
}