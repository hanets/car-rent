package com.epam.lab.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.lab.dao.UserDao;
import com.epam.lab.model.User;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		String pwd_repit = request.getParameter("pwd_repit");
		String email = request.getParameter("email");
		if (!pwd.equals(pwd_repit)){
			response.sendRedirect("index.jsp");
			return;
		}
		User user = new User();
		user.setLogin(login);
		user.setEmail(email);
		user.setPassword(pwd);
		UserDao userDao = new UserDao();
		userDao.create(user);
		response.sendRedirect("users");
	}

}
