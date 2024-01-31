package vegetable_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class display {
	static Connection connection;
	public static void show_data(Statement st) {
		try {
			ResultSet set=st.executeQuery("Select * from veg_seller");
			System.out.println("Vid Quantity Veg_Desc price");
			while(set.next()) {
				System.out.println(set.getInt(1)+"\t"+set.getInt(2)+"\t"+set.getString(3)+"\t"+set.getInt(4));
			}
			return ;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return ;
	}
	public static void show_bill(Statement st) {
		try {
			ResultSet set=st.executeQuery("Select * from customer");
			System.out.println("Vid Quantity Veg_Desc price");
			while(set.next()) {
				System.out.println(set.getInt(1)+"\t"+set.getInt(2)+"\t"+set.getString(3)+"\t"+set.getInt(4));
			}
			return ;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return ;
	}
}
