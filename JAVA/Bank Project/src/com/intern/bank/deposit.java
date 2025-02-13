package com.intern.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class deposit {
	
	public void deposits() {
		Scanner sc=new Scanner(System.in);
		Connection con=Dbconnection.connect();
		System.out.println("Enter the Id Want to Deposit");
		int id=sc.nextInt();
		System.out.println("Enter the Amount Want to Deposit");
		int amount=sc.nextInt();
		
		try {
			PreparedStatement pr=con.prepareStatement("select * from users where AccountNo=?");
			pr.setInt(1,id);
			ResultSet rs=pr.executeQuery();
			
			while(rs.next()) {
				int oldBalance=rs.getInt(3);
				if(oldBalance>0 && amount>0 && oldBalance>amount) {
					int newBal=oldBalance+amount;
					
					PreparedStatement pr1=con.prepareStatement("update users set Balance=? where AccountNo=?");
					pr1.setInt(1, newBal);
					pr1.setInt(2, id);
					pr1.executeUpdate();
				}
				else {
					System.out.println("Insufficiant Bank Balance");
				}
				System.out.println("Amount Deposit Sucessfully");
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sc.close();
	}
}
