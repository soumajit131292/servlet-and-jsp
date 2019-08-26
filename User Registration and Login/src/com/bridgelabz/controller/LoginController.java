package com.bridgelabz.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.service.RegistrationLoginIntr;
import com.bridgelabz.service.RgistrationLoginImpl;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// getting the value from log in form

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegistrationLoginIntr object = new RgistrationLoginImpl();

		String email = request.getParameter("email");
		String firstname = request.getParameter("firstname");

		int value = object.doLogin(email, firstname);
		if (value == 1) {
			System.out.println("logged in");
			request.getSession().invalidate();
			HttpSession newsession = request.getSession();
			newsession.setAttribute("email", email);

			newsession.setMaxInactiveInterval(20);
			System.out.println("in login page");
			Cookie cookiesemail = new Cookie("email", email);
			Cookie cookiesname = new Cookie("firstname", firstname);
			response.addCookie(cookiesemail);
			response.addCookie(cookiesname);

			//RequestDispatcher rd = request.getRequestDispatcher("Filterworing.jsp");
			//rd.forward(request, response);
			 response.sendRedirect("Filterworing.jsp");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
			rd.forward(request, response);
		}

		// response.sendRedirect("Error.jsp");

	}
}
