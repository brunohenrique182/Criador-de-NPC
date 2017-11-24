package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/auxdemesa", "root", "171097");
		} catch (SQLException e) {
			System.out.println("não conectou!!");
			throw new RuntimeException(e);
			
		}
	}
}
