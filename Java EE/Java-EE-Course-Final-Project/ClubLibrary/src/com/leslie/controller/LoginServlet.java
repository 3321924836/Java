package com.leslie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leslie.entity.User;
import com.leslie.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);

		UserServiceImpl service = new UserServiceImpl();
		boolean isLegal = service.login(user);
		if (isLegal == true) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);

		UserServiceImpl service = new UserServiceImpl();
		boolean isLegal = service.login(user);
		if (isLegal == true) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
