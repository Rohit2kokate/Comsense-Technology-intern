package com.intern.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {
	
	public void inserts() {
		Connection con=Dbconnection.connect();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Connection Sucessfull");
		System.out.println("Enter the ID");
		int id=sc1.nextInt();
		sc1.nextLine();
		System.out.println("Enter the Name");
		String name=sc1.nextLine();

		System.out.println("Enter The Account Balance");
		long balance=sc1.nextLong();
		System.out.println("Enter the Mobile Number");
		long mobNo=sc1.nextLong();
		
		try {
			PreparedStatement pr=con.prepareStatement("insert into users values(?,?,?,?)");
			pr.setInt(1, id);
			pr.setString(2, name);
			pr.setLong(3, balance);
			pr.setLong(4, mobNo);
			int rs=pr.executeUpdate();
			
			if(rs>0) {
				System.out.println("Query Executed Succesfully");
			}
			else {
				System.out.println("Error");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sc1.close();
	}
}
