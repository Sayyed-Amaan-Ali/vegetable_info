package vegetable_info;

import java.sql.ResultSet;
import java.sql.Statement;

public class Update {
		public static void modify(Statement st,int id,int n) {
			try {
				int set1=st.executeUpdate("update veg_seller set `in_stock`='"+n+"' where vid='"+id+"'");
				return ;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return ;
		}
}
