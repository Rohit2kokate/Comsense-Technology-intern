package com.intern.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class display {
	
	void displays() {
			Connection con=Dbconnection.connect();
			
			
			PreparedStatement pr;
			try {
				pr = con.prepareStatement("select * from users");
				ResultSet rs=pr.executeQuery();
				
				while(rs.next()) {
					String name=rs.getString(2);
					long bala=rs.getLong(3);
					int id=rs.getInt(1);
					System.out.println("ID : "+id+" Name : "+name+"   Balance : "+bala);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Unable to display");
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("DID NOT DISCONNECTED");
			}
			
	}
}

