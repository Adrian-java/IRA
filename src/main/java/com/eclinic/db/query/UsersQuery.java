package com.eclinic.db.query;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.eclinic.db.dao.DBDao;
import com.eclinic.db.model.Users;

public class UsersQuery {

	private DBDao<Users> usersDao;

	private PasswordEncoder passwordEncoder;

	public void addUser(Users u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		usersDao.add(u, Users.class.getName());
	}

	public void deleteUser(Users user) {
		usersDao.delete(user);
	}

	public Users findUserByLogin(String login) {
		Users u = new Users();
		u.setLogin(login);
		return usersDao.findByExample(u, Users.class).get(0);
	}

	public DBDao<Users> getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(DBDao<Users> usersDao) {
		this.usersDao = usersDao;
	}

	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}

	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
}
