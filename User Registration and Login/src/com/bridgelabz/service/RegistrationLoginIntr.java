package com.bridgelabz.service;

import com.bridgelabz.model.Userdetails;


//interface for Registration and Log in

public interface RegistrationLoginIntr {

	public int doRegister(Userdetails user);
	public int doLogin(String email,String firstname);
	
}