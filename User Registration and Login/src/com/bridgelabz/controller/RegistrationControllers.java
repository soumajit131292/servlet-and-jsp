package com.bridgelabz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.model.Userdetails;
import com.bridgelabz.service.RegistrationLoginIntr;
import com.bridgelabz.service.RgistrationLoginImpl;


@WebServlet("/Controllers")
public class RegistrationControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//getting the value from the registration form
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegistrationLoginIntr object = new RgistrationLoginImpl();
        String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String mobilenumber = request.getParameter("mobilenumber");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
        Userdetails user = new Userdetails(firstname, lastname, email, mobilenumber, password);
		object.doRegister(user);
		response.sendRedirect("successfulresigiteration.jsp");

	}

}
