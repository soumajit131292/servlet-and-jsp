package com.bridgelabz.service;

import com.bridgelabz.model.DataAccessObject;
import com.bridgelabz.model.Userdetails;

//interface implementation

public class RgistrationLoginImpl implements RegistrationLoginIntr {

	DataAccessObject accessdata = new DataAccessObject();

	public int doRegister(Userdetails user) {
		int execute = 0;
		try {
			execute = accessdata.doRegistration(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return execute;
	}

	public int doLogin(String email, String firstname)

	{

		try {

			int execute = accessdata.Login(email, firstname);
			if (execute == 1) {
				return 1;

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return 0;

	}

}