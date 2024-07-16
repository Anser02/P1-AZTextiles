package stockSectionn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connection.CreateConnection;

public class RemainingStocks extends CreateConnection
{
	Connection c;
	String qry;
	int PCode;
	Scanner obb=new Scanner(System.in);
	
	public void RemainingStock() throws SQLException
	{
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		System.out.println();
		System.out.println();
		System.out.println("          ***** Available Remaining Stocks  *****");
		System.out.println();
		qry="select *from stockk";
		rs=st.executeQuery(qry);
		System.out.println("***************************************************************");
		System.out.println(" P_Code | P_Name    | P_Size | Total Stocks  | Remaining_Stock ");
		System.out.println("***************************************************************");
		while(rs.next())
		{
			System.out.println("--------------------------------------------------------------");
			System.out.println(" "+rs.getInt(1) + "    | "+ rs.getString(2) + "|  "+rs.getString(3) + "   |    " +rs.getString(5)+"        |     "+rs.getString(7));		
			System.out.println("--------------------------------------------------------------");
		}
		System.out.println();
	}
	
	public void particularRemainingstock() throws SQLException
	{
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select * from stockk";
		rs=st.executeQuery(qry);
		System.out.println("enter P_Code:");
		PCode=obb.nextInt();
		System.out.println();
		System.out.println("***************************************************************");
		System.out.println(" P_Code | P_Name    | P_Size | Total Stocks  | Remaining_Stock ");
		System.out.println("***************************************************************");
		while(rs.next())
		{
			if(PCode==rs.getInt(1))
			{
				System.out.println("--------------------------------------------------------------");
				System.out.println(" "+rs.getInt(1) + "    | "+ rs.getString(2) + "|  "+rs.getString(3) + "   |    " +rs.getString(5)+"        |     "+rs.getString(7));		
				System.out.println("--------------------------------------------------------------");
				System.out.println();
			}
		}
	}
}
