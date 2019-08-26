package com.bridgelabz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Log out user


@WebServlet("/LpgoutController")
public class LpgoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getSession().invalidate();
		Cookie[] cookies=request.getCookies();
		for(Cookie cookie : cookies)
		{
			if(cookie.getName().equals("email")) {
			cookie.setValue(null);
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			}
			if(cookie.getName().equals("firstname")) {
				cookie.setValue(null);
				cookie.setMaxAge(0);
				response.addCookie(cookie);
				}
		}
		
		System.out.println("in log out page");
		response.sendRedirect("Login.jsp");

	}

}
