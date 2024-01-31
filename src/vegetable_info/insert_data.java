package vegetable_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insert_data {
	//static Connection connection;
	public static String insertrecord(Statement st,int id,int n,String desc,int price) {
		try {
			int set=st.executeUpdate("insert into veg_seller(`vid`,`in_stock`,`veg_desc`,`rate`) values('"+id+"','"+n+"','"+desc+"','"+price+"')");
			
			return "Record Added successfully\n";
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return "Record not Added";
	}
}
