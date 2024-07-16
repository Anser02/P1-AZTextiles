package stockSectionn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import connection.CreateConnection;

public class AddNewStock extends CreateConnection
{
	Connection c;
	String qry,PCode,PName,PSize;
	int PPrice,TotalQty;
	Scanner ob=new Scanner(System.in);
	Scanner obb=new Scanner(System.in);

	
	public void AddNewstockk() throws SQLException
	{
		c=getConnection();	
		PreparedStatement ps;
		System.out.println("P_Code:");
		PCode=obb.nextLine();
		System.out.println("P_Name:");
		PName=obb.nextLine();
		System.out.println("P_Size:");
		PSize=obb.nextLine();
		System.out.println("P_Price:");
		PPrice=ob.nextInt();
		System.out.println("Total_Qty:");
		TotalQty=ob.nextInt();
		qry="insert into stockk (P_Code,P_Name,P_Size,P_Price,Total_Qty) values(?,?,?,?,?)";
		ps=c.prepareStatement(qry);
		ps.setString(1,PCode);
		ps.setString(2,PName);
		ps.setString(3,PSize);
		ps.setInt(4,PPrice);
		ps.setInt(5,TotalQty);
		ps.executeUpdate();
		System.out.println("----------------------------------------------");
		System.out.println("   ***** New Stock Added Successfull *****   ");
		System.out.println("----------------------------------------------");
	}	
}
