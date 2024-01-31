package vegetable_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","amaan9876");
			Statement st=connection.createStatement();
			Restart.start(st);
			Seller.veg_data(st);
			customer.cust(st);
			
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
