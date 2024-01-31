package vegetable_info;

import java.sql.Statement;
import java.util.Scanner;

public class Seller {
	public Seller() {
		System.out.println("\\tWelcome-Seller\\n");
	}
	public static void veg_data(Statement st) {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter the details of available vegetables");
			System.out.println("enter the vegetable id");
			int id=sc.nextInt();
			System.out.println("enter the vegetable quantity available in kg/dozen");
			int n=sc.nextInt();
			System.out.println("enter the vegetable description");
			String desc=sc.next();
			System.out.println("enter the vegetable rates per kg/dozen");
			int price=sc.nextInt();
			System.out.println(insert_data.insertrecord(st,id,n,desc,price));
			display.show_data(st);
			System.out.println("enter 0 if you are done or any key to continue");
			String string=sc.next();
			if(string.equalsIgnoreCase("0"))
				return;
			else {
				veg_data(st);
			}
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
