package com.eclinic.db.dao;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.eclinic.db.model.Users;

public class UserDao extends DBDao<Users> implements UserDetailsService {

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		Users u = new Users();
		u.setLogin(username);
		return findByExample(u, Users.class).get(0);
	}

}
