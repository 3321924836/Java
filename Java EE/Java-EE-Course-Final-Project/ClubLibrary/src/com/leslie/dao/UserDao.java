package com.leslie.dao;

import com.leslie.entity.User;

public interface UserDao {
	User findByUsername(String username);
}
