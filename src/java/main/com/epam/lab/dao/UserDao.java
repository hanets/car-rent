package com.epam.lab.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.epam.lab.core.ConnectionManager;
import com.epam.lab.model.User;
import com.epam.lab.transformer.UserTransformer;


public class UserDao {
	private static final String INSERT="INSERT INTO user (login, email, password) VALUES(?, ?, ?)"; 
	private static final String SELECT="SELECT * FROM user WHERE id = ?"; 
	private static final String SELECT_ALL="SELECT * FROM user"; 
	public User getById(int id) {
		User user = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try (Connection conn = ConnectionManager.getConnection()) {
			stmt = conn.prepareStatement(SELECT);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next()) {
				user = UserTransformer.getObject(rs);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		return user;
	}
	public List<User> getAll() {
		List<User> userList= null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try (Connection conn = ConnectionManager.getConnection()) {
			stmt = conn.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			userList = UserTransformer.getListObject(rs);
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		return userList;
	}
	public int create(User user) {
		int result = 0;
		PreparedStatement stmt = null;
		try (Connection conn = ConnectionManager.getConnection()) {
			stmt = conn.prepareStatement(INSERT);
			stmt.setString(1, user.getLogin());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());
			result = stmt.executeUpdate();
			ResultSet resultSet = stmt.getGeneratedKeys();
			if (resultSet.next()) {
				result = resultSet.getInt(1);
			}
			resultSet.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		return result;
	}
}
