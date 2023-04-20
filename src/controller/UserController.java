package controller;

import java.util.ArrayList;

import bbdd.UsersService;
import model.User;

public class UserController {

	public ArrayList<User> getUsers() {
		try {
			ArrayList<User> users = new UsersService().getUsers();	
			return users;
		} catch(Exception e) {
			return null;
		}
	}
}
