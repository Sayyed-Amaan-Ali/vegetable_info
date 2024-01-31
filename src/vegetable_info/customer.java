package vegetable_info;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class customer {
	public static void cust(Statement st) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("\n\t\tWELCOME!!\nBuy Fresh Vegetables With us\n");
			display.show_data(st);
			System.out.println("\tselect your vegetables\n");
			System.out.println("enter the vegetable id you wants to buy");
			int id=sc.nextInt();
			System.out.println("enter the how much you wanna buy(quantity) in kg/dozen");
			int n=sc.nextInt();
			int t=Billing.bill(st, id, n);
			t=t-n;
			if(t<0) {
				System.out.println("you cant buy more than available");
				cust(st);
			}
			Update.modify(st, id, t);
			System.out.println("1->Continue Shopping");
			System.out.println("2->Check out");
			System.out.println("enter the choice");
			int ch=sc.nextInt();
			if(ch==1)
				cust(st);
			else if(ch==2) {
				display.show_bill(st);
				ResultSet set=st.executeQuery("select `price` from customer");
				int sum=0;
				while(set.next()) {
					sum+=set.getInt(1);
				}
				System.out.println("\tTotal Amount==>"+sum);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
