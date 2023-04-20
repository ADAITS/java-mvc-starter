package bbdd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;

public class UsersService {
	
	String tableName = "Usuarios";
	
	public ArrayList<User> getUsers() throws SQLException{
		ArrayList<User> users = new ArrayList<User>();
		
		ResultSet results = Conexion.ejecutarSentencia("SELECT * FROM " + tableName);
		
		while(results.next()) {
			String username = results.getString(1);
			String password = results.getString(2);
			users.add(new User(username, password));
		}
		
		return users;
	}

}
