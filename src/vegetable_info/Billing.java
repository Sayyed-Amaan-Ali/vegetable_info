package vegetable_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;

public class Billing {
	public static int bill(Statement st,int id,int n) {
		try {
			
			ResultSet set=st.executeQuery("select * from veg_seller where vid='"+id+"'");
			set.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","amaan9876");
			Statement st1=connection.createStatement();
			int r=st1.executeUpdate("insert into customer values('"+set.getInt(1)+"','"+n+"','"+set.getString(3)+"','"+(set.getInt(4)*n)+"')");
			display.show_bill(st1);
			return set.getInt(2);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
