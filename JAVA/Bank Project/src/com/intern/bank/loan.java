package com.intern.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class loan {
	
	void loan() {
		Connection con =Dbconnection.connect();
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the id do you want to give loan");
			int id=sc.nextInt();
			PreparedStatement pr=con.prepareStatement("select * from users where AccountNo=?");
			pr.setInt(1, id);
			ResultSet rs=pr.executeQuery();
			if(rs.next()) {
				int amount=rs.getInt(3);
				String name=rs.getString(2);
				if(amount>500) {
					amount=amount*3;
					PreparedStatement pr1=con.prepareStatement("insert into transactions values(?,?,?,?,?,?)");
					pr1.setInt(2, id);
					pr1.setInt(1, id);
					pr1.setInt(4,amount);
					pr1.setString(3, name);
					pr1.setString(5,"Adhar");
					pr1.setString(6,"Pending");
					pr1.executeUpdate();
				}
				else {
					System.out.println("NOT ELIGIBLE FOR LOAN");
				}
				
				
				
			}
			else {
				System.out.println("No User Found");
			}
			//int id=sc.nextInt();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
