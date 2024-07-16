package stockSectionn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connection.CreateConnection;

public class StockDetailsModify extends CreateConnection
{
	Connection c;
	int PCode;
	String qry;
	Scanner obb=new Scanner(System.in);
	Scanner obbb=new Scanner(System.in);

	public void exitpcode() throws SQLException
	{
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		System.out.println("***** which P_Code you want to Modify: *****");
		PCode=obb.nextInt();
		qry="select *from stockk;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(PCode==(rs.getInt(1)))
			{
				System.out.println();
				System.out.println("---------------------------------------------");
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5));
				System.out.println("----------------------------------------------");

			}
		}
	}
	
	public void PCChange() throws SQLException
	{
		PreparedStatement ps;
		System.out.println("New P_Code:");
		int pcc;
		pcc=obb.nextInt();
		qry="update stockk set P_Code=? where P_Code=?";
		ps=c.prepareStatement(qry);
		ps.setInt(1,pcc);
		ps.setInt(2,PCode);
		ps.executeUpdate();
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("   *** New P_Code Updated Successfully ***");
		System.out.println("---------------------------------------------");
		System.out.println();
	}
	public void PNameChange() throws SQLException
	{
		c=getConnection();	
		PreparedStatement ps;
		System.out.println("New P_Name:");
		String pnn;
		pnn=obbb.nextLine();
		qry="update stockk set P_Name=? where P_Code=?";
		ps=c.prepareStatement(qry);
		ps.setString(1,pnn);
		ps.setInt(2,PCode);
		ps.executeUpdate();
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("   *** New P_Name Updated Successfully ***");
		System.out.println("---------------------------------------------");
		System.out.println();	}
	public void PSChange() throws SQLException
	{
		c=getConnection();
		PreparedStatement ps;
		System.out.println("New P_Size:");
		String pss;
		pss=obbb.nextLine();
		qry="update stockk set P_Size=? where P_Code=?";
		ps=c.prepareStatement(qry);
		ps.setString(1,pss);
		ps.setInt(2,PCode);
		ps.executeUpdate();
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("   *** New P_Size Updated Successfully ***");
		System.out.println("---------------------------------------------");
		System.out.println();
	}
	public void PPChange() throws SQLException
	{
		PreparedStatement ps;
		System.out.println("New P_Price:");
		int ppp;
		ppp=obb.nextInt();
		qry="update stockk set P_Price=? where P_Code=?";
		ps=c.prepareStatement(qry);
		ps.setInt(1, ppp);
		ps.setInt(2, PCode);
		ps.executeUpdate();
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("   *** New P_Price Updated Successfully ***");
		System.out.println("---------------------------------------------");
		System.out.println();
	}
	public void PTQChange() throws SQLException
	{
		c=getConnection();
		PreparedStatement ps;
		System.out.println("New Total_Qty:");
		int tqq;
		tqq=obb.nextInt();
		qry="update stockk set Total_Qty=? where P_Code=?";
		ps=c.prepareStatement(qry);
		ps.setInt(1, tqq);
		ps.setInt(2,PCode);
		ps.executeUpdate();
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("   *** New P_Total_Qty Updated Successfully ***");
		System.out.println("---------------------------------------------");
		System.out.println();
	}
}
