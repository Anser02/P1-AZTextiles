package stockSectionn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connection.CreateConnection;

public class StockSectionLogin extends CreateConnection
{
	Connection c;
	boolean found=false;
	String qry,inpu,Uname,Up;
	Scanner obb=new Scanner(System.in);
	
	public void StockSectionloginn() throws SQLException
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
		qry="select *from login";
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
		System.out.println("*** Press '1' - Total Available Stocks                  ***");
		System.out.println("*** Press '2' - Add New Stock                           ***");
		System.out.println("*** Press '3' - Delete a ParticularStock                ***");
		System.out.println("*** Press '4' - All Remaining Stock                     ***");
		System.out.println("*** Press '5' - Prticular Remaining Stock               ***");
		System.out.println("*** Press 'm' - Modify the Details of Existing Stock    ***");
		System.out.println("*** Press 'l' - Logout                                  ***");
		System.out.println();
		TotalStocks t=new TotalStocks();
		AddNewStock a=new AddNewStock();
		DeleteStock d=new DeleteStock();
		RemainingStocks r=new RemainingStocks();
		StockDetailsModify aa=new StockDetailsModify();
		inpu=obb.nextLine();
		switch(inpu)
		{
		case "1":t.TotalStock();
		break;
		case "2": a.AddNewstockk();
		break;
		case "3": d.Deletestock();
		break;
		case "4": r.RemainingStock();
		break;
		case "5": r.particularRemainingstock();
		break;
		case "m":
			aa.exitpcode();
			System.out.println();
			System.out.println("***  Modify P_Code    - Press '1'  ***");
			System.out.println("***  Modify P_Name    - Press '2'  ***");
			System.out.println("***  Modify P_Size    - Press '3'  ***");
			System.out.println("***  Modify P_Price   - Press '4'  ***");
			System.out.println("***  Modify Total_Qty - Press '5'  ***");
			String pc=obb.nextLine();
			switch(pc)
			{
			case "1":
				aa.PCChange();
				break;
			case "2":
				aa.PNameChange();
				break;
			case "3":
				aa.PSChange();
				break;
			case "4":
				aa.PPChange();
				break;
			case "5":
				aa.PTQChange();
				break;
			default: 
				System.out.println("*** check the input - ( Modity ) ***");
			}
			break;
		case "l":
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
