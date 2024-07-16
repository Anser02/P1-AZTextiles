package stockSectionn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.CreateConnection;

public class TotalStocks extends CreateConnection
{
	Connection c;

	public void TotalStock() throws SQLException
	{
		c=getConnection();
		String qry;
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from stockk";
		rs=st.executeQuery(qry);
		System.out.println();
		System.out.println("     ***** Total Stock Details *****");
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("P_Code |  P_Name     | P_Size  | Total_Stocks ");
		System.out.println("*********************************************");
		while(rs.next())
		{
			System.out.println("-------------------------------------------");
			System.out.println(rs.getString(1)+"    |  "+rs.getString(2)+" |  "+rs.getString(3)+"    |   "+rs.getString(5));
			System.out.println("-------------------------------------------");
		}
	}
}
