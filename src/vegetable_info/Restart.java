package vegetable_info;

import java.sql.Statement;

public class Restart {
	public static void start(Statement st) {
		try {
			int set1=st.executeUpdate("DELETE from veg_seller");
			set1=st.executeUpdate("DELETE from customer");
			System.out.println("\n\t\tWELCOME!!!!!\n");
			return ;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return ;
	}

}
