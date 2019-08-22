package com.bridgelabz.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	public void doLogin(String email, String firstname, HttpServletRequest request, HttpServletResponse response)

	{

		try {

			int execute = accessdata.Login(email, firstname);
			if (execute == 1) {

				request.getSession().invalidate();
				HttpSession newsession = request.getSession(true);
				newsession.setAttribute("email", email);
				newsession.setMaxInactiveInterval(20);
				response.sendRedirect("Welcome.jsp");
            }
			else
			{
				response.sendRedirect("Error.jsp");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}