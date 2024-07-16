package billSection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connection.CreateConnection;

public class BillEntry extends CreateConnection
{
	Connection c;
	String qry,qryy,inpu,pc;
	Scanner ob=new Scanner(System.in);
	Scanner obb=new Scanner(System.in);
	int bn,qty;
	int i,t=0;
	
	public void Billentryy() throws SQLException
	{
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;

		System.out.println("Enter Bill No:");
		bn=ob.nextInt();
		for (i=0;i<9;i++)
		//while(true)
		{ 
		System.out.println(" ***   Press 'c'    - Complete The Bill                    ***");
		System.out.println(" ***   Enter PCode: - For Continue to the product Entry    ***");

		inpu=obb.nextLine();
		qry="select *from stockk;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(inpu.equals(rs.getString(1)))
			{
				System.out.println("--------------------------------------");
				System.out.println(rs.getString(1)+"| "+rs.getString(2)+"| "+rs.getString(3)+" | "+rs.getString(4));
				System.out.println("--------------------------------------");
			}
		}
		switch(inpu)
		{
		case "101":
			System.out.println("Qty:");
			qty=ob.nextInt();
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,101,'Shirt     ',300,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			qryy="update stockk set qty=? where P_Code=101;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "102":
			System.out.println("Qty:");
			qty=ob.nextInt();
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,102,'Shirt     ',350,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			qryy="update stockk set qty=? where P_Code=102;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "103":
			System.out.println("Qty:");
			qty=ob.nextInt();
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,103,'Shirt     ',400,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			qryy="update stockk set qty=? where P_Code=103;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "104":
			System.out.println("Qty:");
			qty=ob.nextInt();
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,104,'Shirt     ',450,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			qryy="update stockk set qty=? where P_Code=104;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "105":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,105,'Shirt     ',500,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=105;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "201":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,201,'Jeans     ',450,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=201;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "202":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,202,'Jeans     ',500,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=202;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "203":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,203,'Jeans     ',550,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=203;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "204":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,204,'Jeans     ',600,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=204;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "205":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,205,'Jeans     ',650,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=205;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
			
			
		case "301":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,301,'T-Shirt   ',180,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=301;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "302":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,302,'T-Shirt   ',200,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=302;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "303":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,303,'T-Shirt   ',220,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=303;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "304":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,304,'T-Shirt   ',300,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=304;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "305":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,305,'T-Shirt   ',330,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=305;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "401":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,401,'Saree     ',400,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=401;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "402":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,402,'Saree     ',550,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=402;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "403":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,403,'Saree     ',600,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=403;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "404":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,404,'T-Shirt   ',800,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=404;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "405":
			System.out.println("Qty:");
			qty=ob.nextInt();
			
			qry="insert into GeneralBill (Billno,PCode,PName,PPrice,Qty) values (?,405,'T-Shirt   ',900,?);";
			ps=c.prepareStatement(qry);		
			ps.setInt(1,bn );
			ps.setInt(2, qty);
			ps.executeUpdate();
			System.out.println("*** Poduct Added into the bill ***");
			System.out.println();
			
			qryy="update stockk set qty=? where P_Code=405;";
			ps=c.prepareStatement(qryy);
			ps.setInt(1,qty);
			ps.executeUpdate();
			break;
			
		case "c":
			int d;
			System.out.println("Enter the Discount % :");
			d=ob.nextInt();
			System.out.println();System.out.println();
			
			
			
			
			System.out.println();
			System.out.println("		    ====================================================");
			System.out.println("		                  AZ Textiles & ReadyMates            ");
			System.out.println("		        #11, Vellore Main Road, MC Road, Ambur-635802.");
			System.out.println("		                  GST No : ABCD98765432175865           ");
			System.out.println("		            Contact No : +91 9043536088/9876543210     ");
			System.out.println();
			System.out.println("		                 -----------------------              ");
			System.out.println("		                  *** Purchase Bill ***               ");
			System.out.println("		                 -----------------------              ");
			
			System.out.println();
			System.out.println("		         Bill No : "+bn);
			System.out.println("		        *********************************************");
			System.out.println("		           Desc        Price    Qty     Amount");
			System.out.println("		        *********************************************");
			qry="select *from GeneralBill;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(bn==rs.getInt(1))
				{
				System.out.println("		           "+rs.getString(3)+"   " +rs.getInt(4)+"      " +rs.getInt(5)+"      "+rs.getInt(6) );
				t=t+rs.getInt(6);
				}
			}
			
			System.out.println("				       ----------------------");
			System.out.println("				        Sub Total : Rs. "+t);
			System.out.println("				       ----------------------");
			int g1,g2;
			g1=t*6/100;
			g2=t*6/100;
			int tt1 =t+g1+g2;
			System.out.println();
			System.out.println("				SGST   - 6%       : Rs. "+g1);
			System.out.println("				CGST   - 6%       : Rs. "+g2);
			System.out.println("			          --------------------------");
			System.out.println("				    Gross Amount  : Rs. "+tt1);
			System.out.println("			          -------------------------");
			System.out.println();
			int dd;
			dd=tt1*d/100;
			System.out.println("				     Discount     : Rs. "+dd);
			int ff;
			ff=tt1-dd;
			System.out.println("			          ===========================");
			System.out.println("				    Total Amount  : Rs. "+ff);
			System.out.println("			          ===========================");
			System.out.println();
			System.out.println();
			System.out.println("		            *** THANKS FOR YOUR SHOPPING ***          ");
			System.out.println("		                *** HAVE A NICE DAY ***                ");
			System.out.println();
			System.out.println("		    ====================================================");
			System.out.println();
			System.out.println();
			System.out.println();
		}
		}		
	}	
}
