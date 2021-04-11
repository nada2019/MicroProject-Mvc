package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.beans.Client;

public class ClientDao {
	 public int registerClient(Client client) throws ClassNotFoundException {
	        String sql = "INSERT INTO user" +
	            "  (nom, prenom, email, address, ville, codePostal, tel, motDePasse) VALUES " +
	            " (?, ?, ?, ?,?,?,?,?);";

	        int result = 0;

	        Class.forName("com.mysql.cj.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/Project?useSSL=false", "root", "exosaranghae");
	            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	            preparedStatement.setString(1, client.getFirstName());
	            preparedStatement.setString(2, client.getLastName());
	            preparedStatement.setString(3, client.getEmail());
	            preparedStatement.setString(4, client.getAdress());
	            preparedStatement.setString(5, client.getVille());
	            preparedStatement.setInt(6, client.getCodePostal());
	            preparedStatement.setInt(7, client.getPhoneNumber());
	            preparedStatement.setString(8, client.getPassword());

	            System.out.println(preparedStatement);
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	        return result;
	    }
	 
	 private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
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
