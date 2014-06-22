package com.epam.lab.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.lab.dao.UserDao;
import com.epam.lab.model.User;

public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> listUser = null;
		UserDao userDao = new UserDao();
		listUser = userDao.getAll();
		request.setAttribute("listUsers", listUser);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/users.jsp");
		dispatcher.forward(request, response);
	}
}
