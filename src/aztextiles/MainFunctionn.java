package aztextiles;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import billSection.BillEntry;
import billSection.BillSectionLogin;
import connection.CreateConnection;
import stockSectionn.StockSectionLogin;

public class MainFunctionn 
{
	 static Scanner obb=new Scanner(System.in);

	public static void main(String[] args) throws SQLException 
	{
		String i;
		System.out.println();
		System.out.println("                    ***************************************************");
		System.out.println("		                   AZ Textiles & ReadyMates            ");
		System.out.println("		        #11, Vellore Main Road, MC Road, Ambur-635802");
		System.out.println("                    ***************************************************");
		System.out.println();
		System.out.println(" ***  Press '1' - Stock-Section-Login  ***");
		System.out.println(" ***  Press '2' - Bill-Section-Login   ***");
		i=obb.nextLine();
		switch(i)
		{
		case "1":
			StockSectionLogin s=new StockSectionLogin();
			s.StockSectionloginn();
			break;
		case "2":
			BillSectionLogin bb=new BillSectionLogin();
			bb.billlogin();
			break;
		default :
			System.out.println();
			System.out.println("         *** Invalid Input *** ");
			System.out.println("    ***  Run The Program Again  ***");
			System.out.println();
		}
	}
	}