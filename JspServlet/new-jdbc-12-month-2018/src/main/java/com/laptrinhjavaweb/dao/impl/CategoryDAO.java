package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;

public class CategoryDAO implements ICategoryDAO{
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql:/localhost:";
			String user = "";
			String password = "";
			return DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException e) {
			return null;
		}
	}
	
	@Override
	public List<CategoryModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
