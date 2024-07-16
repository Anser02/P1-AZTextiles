package billSection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import connection.CreateConnection;

public class BillSectionLogin extends CreateConnection
{
	Connection c;
	boolean found=false;
	String qry,inpu,Uname,Up;
	Scanner obb=new Scanner(System.in);
	
	public void billlogin() throws SQLException
	{
			c=getConnection();
			Statement st=c.createStatement();
			ResultSet rs;
			while(true)
			{
			System.out.println("Enter User-Id:");
			Uname=obb.nextLine();
			System.out.println("Enter Password:");
			Up=obb.nextLine();
			qry="select *from billlogin";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(Uname.equals(rs.getString(1))&&Up.equals(rs.getString(2)))
				{
					found=true;
					System.out.println();
					System.out.println("----------------------------------");
					System.out.println("     *** Login Sucessfull ***");
					System.out.println("----------------------------------");
					System.out.println();
			while(true)
			{
			System.out.println();
			System.out.println("  *********************************************");
			System.out.println("     *** Press '1' - Bill Entry          ***");
			System.out.println("     *** Press '2' - Logout              ***");
			System.out.println("  *********************************************");

			System.out.println();
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "1":
				BillEntry b=new BillEntry();
				b.Billentryy();
				break;
			case "2":
				System.out.println();
				System.out.println("-----------------------------------");
				System.out.println("     *** Logout Successfull ***"); 
				System.out.println("-----------------------------------");
				System.out.println();

			System.exit(0);
			break;
			default: 
				System.out.println("*** Invalid Input ***");
			}
		}
				}
			}
			if(!found)
			{
				System.out.println();
				System.out.println("         *** Invalid login ***   ");
				System.out.println();
				System.out.println(" *** Enter Correct Userid & Password *** ");
				System.out.println();
			}
			}
	}
}