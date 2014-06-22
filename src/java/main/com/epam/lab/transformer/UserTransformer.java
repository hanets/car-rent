package com.epam.lab.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.epam.lab.model.User;

public class UserTransformer {
	public static User getObject(ResultSet rs) throws SQLException{
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setLogin(rs.getString("login"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	public static List<User> getListObject(ResultSet rs) throws SQLException{
		List<User> userList = new LinkedList<User>();
		while (rs.next()){
			userList.add(getObject(rs));
		}
		return userList;
	}
}
