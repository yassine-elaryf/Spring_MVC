package com.yassine.dao;


import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yassine.models.User;

public class UserDAOImpl implements UserDAO {

	
	private JdbcTemplate jdbcTemplate;
	//private DataSource dataSource;
 
	public UserDAOImpl(DataSource dataSourcce ) {
		jdbcTemplate = new JdbcTemplate(dataSourcce);
	}
	@Override
	public void register(User user) { 
		String sql = "INSERT INTO users VALUES (?,?,?,?)";
		 Object[] userInfo ={
				user.getUsername(),
				user.getPassword(),
				user.getFullname(),
				1};
		jdbcTemplate.update(sql,userInfo);
		
		System.out.println("user created successfully !");
	}
 
	 
/*
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource; // web xml
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}*/



}
