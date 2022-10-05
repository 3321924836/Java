package com.leslie.dao.impl;

import com.leslie.dao.UserDao;
import com.leslie.database.Database;
import com.leslie.entity.User;

public class UserDaoImpl implements UserDao {
	
	public User findByUsername(String username) {
		for(User user:Database.users) {
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
}
