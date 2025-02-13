package com.intern.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class transfer {
	
	void transfer() {
		Scanner sc=new Scanner(System.in);
		Connection con=Dbconnection.connect();
		System.out.println("enter the id 1 Do you want to transfer Amount  ");
		int id=sc.nextInt();
		System.out.println("enter the id 2 Do you want to transfer from Account Amount");
		int id1=sc.nextInt();
		System.out.println("enter the id Do you want to transfer Amount from Account ");
		int amount=sc.nextInt();
		PreparedStatement pr=null,pr2=null;
		try {
			pr = con.prepareStatement("select * from users where AccountNo=?");
			pr.setInt(1, id);
			//pr.setInt(1, id1);
			ResultSet rs=pr.executeQuery();
			 int FisAccBal = 0;
	            if (rs.next()) {
	            	FisAccBal = rs.getInt("Balance");
	            } else {
	                System.out.println("Error: Sender account not found.");
	                return;
	            }			
			
	            
			pr2 = con.prepareStatement("select * from users where AccountNo=?");
			pr2.setInt(1, id1);
			int secAccBal=0;
			ResultSet rs1=pr2.executeQuery();
			if (rs1.next()) {
				secAccBal = rs1.getInt("Balance");
            } else {
                System.out.println("Error: Sender account not found.");
                return;
            }
			
			
			
			if(FisAccBal>500) {
				//System.out.println("in whileloop");
						
				PreparedStatement prs=con.prepareStatement("update users set Balance=? where AccountNo=?");
				int nw1=FisAccBal-amount;
				prs.setInt(1, nw1);
				prs.setInt(2, id1);
						//prs.setInt(2, id);
				prs.executeUpdate();
				
				int newBal=secAccBal+amount;
				PreparedStatement pr1=con.prepareStatement("update users set Balance=? where AccountNo=?");
				pr1.setInt(1, newBal);
				pr1.setInt(2, id);
				pr1.executeUpdate();
					
					
					}
			rs.close();
			rs1.close();
			pr.close();
			pr2.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
