package stockSectionn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connection.CreateConnection;

public class DeleteStock extends CreateConnection
{
	Connection c;
	String inpu;
	Scanner obb=new Scanner(System.in);
	Scanner ob=new Scanner(System.in);

	int PCode;
	
	public void Deletestock() throws SQLException
	{
		c=getConnection();
		String qry;
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println("Enter P_Code:");
		PCode=ob.nextInt();
		qry="select *from stockk;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(PCode==rs.getInt(1))
			{
				System.out.println("-------------------------------------");
				System.out.println(rs.getString(1)+"| "+rs.getString(2)+"| "+rs.getString(3)+" | "+rs.getString(5));
				System.out.println("-------------------------------------");
			}
		}
		System.out.println();
		System.out.println(" *** Press 'd' - to Confirm Delete the Stock ***");
		inpu=obb.nextLine();
		switch(inpu)
		{
		case "d":
			qry="delete from stockk where P_Code=?";
			ps=c.prepareStatement(qry);
			ps.setInt(1,PCode);
			ps.executeUpdate();
			System.out.println("-------------------------------------------");
			System.out.println("   ***** Stock Deleted Successfully *****  ");
			System.out.println("-------------------------------------------");
		}
	}
}
