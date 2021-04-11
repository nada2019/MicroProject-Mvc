package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.beans.Client;

public class LoginDao {
	public boolean validate(Client client) throws ClassNotFoundException {
		boolean status = false;

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/Project?useSSL=false", "root", "exosaranghae");
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from user where email = ? and motDePasse = ? ")) {
			preparedStatement.setString(1, client.getEmail());
			preparedStatement.setString(2, client.getPassword());

			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			printSQLException(e);
		}
		return status;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}
