package com.bridgelabz.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataAccessObject {

	public static final String URL = "jdbc:mysql://localhost:3306/users";
	public static final String USER = "souma";
	public static final String PASS = "password";

	// connecting with database

	public static Connection getConnection() throws ClassNotFoundException {
		try {

			Connection connect = null;
			DriverManager.registerDriver(new Driver());
			connect = DriverManager.getConnection(URL, USER, PASS);
			return connect;
		} catch (SQLException ex) {
			throw new RuntimeException("Error connecting to the database", ex);
		}
	}

	// setting data to database for registration

	public int doRegistration(Userdetails user) throws Exception {

		Connection con = DataAccessObject.getConnection();

		String sql = "insert into UsersDetails values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user.getFirstname());
		ps.setString(2, user.getLastname());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getEmail());
		ps.setString(5, user.getMobilenumber());

		int execute = ps.executeUpdate();
		if (execute > 0) {
			System.out.println("inserted");

		}
		return execute;
	}

	// logging in

	public int Login(String useremail, String username) throws Exception {

		Connection connection = getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT email,firstname FROM UsersDetails");
			while (rs.next()) {
				String enterdemail = rs.getString("email");
				String enteredname = rs.getString("firstname");
				if (useremail.equals(enterdemail) && username.equals(enteredname)) {
					return 1;

				}
			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return 0;
	}
}