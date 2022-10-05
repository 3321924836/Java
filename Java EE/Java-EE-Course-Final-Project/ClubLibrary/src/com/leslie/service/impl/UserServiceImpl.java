package com.leslie.service.impl;

import com.leslie.dao.impl.UserDaoImpl;
import com.leslie.entity.User;
import com.leslie.service.UserService;

public class UserServiceImpl implements UserService {

	public boolean login(User user) {
		UserDaoImpl dao = new UserDaoImpl();
		User data = dao.findByUsername(user.getUsername());
		if (data != null)
			if (data.getPassword().equals(user.getPassword()))
				return true;
		return false;
	}
}
