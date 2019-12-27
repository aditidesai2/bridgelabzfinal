package com.bridgeLabz.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgeLabz.utility.Util;

public class second {
	public static void main(String[] args) throws SQLException, IOException {
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aditi", "root", "aditidesai");
////		String query = "insert into addressbook(name,phonenum) values(?,?)";
////		PreparedStatement st = conn.prepareStatement(query);
////		st.setString(1, "durga");
////		st.setInt(2, 24681024);
////		int affectedRows = st.executeUpdate();
////		System.out.println(affectedRows + " row/s affected.");
//		String fetchQuery = "select * from addressbook";
//		Statement st = conn.createStatement();
////		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(fetchQuery);
//
//		while (rs.next()) {
//			System.out.println("name : " + rs.getString(1) + ", phone : " + rs.getInt("phonenum"));
//		}
//
//		st.close();
//		conn.close();
		
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aditi", "root", "aditidesai");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			// stopping auto save
			conn.setAutoCommit(false);
			String query = "insert into addressBook(name,phonenum) values (?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			System.out.println("Enter name :");
			String name = br.readLine();
			ps.setString(1, name);
			System.out.println("Enter phoneNumber :");
			String phoneNumber = br.readLine();
			ps.setString(2, phoneNumber);
			int affectedRows = ps.executeUpdate();
			System.out.println("1 -> commit/ 2 -> rollback");
			int action = Util.scanner.nextInt();
			if (action == 1) {
				conn.commit();
				System.out.println(affectedRows + " row/s affected.");
				System.out.println("saved successfully.");
			}
			if (action == 2) {
				conn.rollback();
				System.out.println("Inserted data did not updated to database.");
			}

			System.out.println("Do you want to insert more data : (y/n)");
			String answer = br.readLine();
			if (answer.equalsIgnoreCase("n")) {
				System.out.println("\nThank you visit again");
				break;
			}

		} while (true);
	}

}