package secondweek;

import java.util.Scanner;


public class staticparam {

	static int id = 0;
	static String name = "";
	
	public static void main(String[] args) {
		
		staticparam sa = new staticparam();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id of employee: ");
		int id = s.nextInt();
		System.out.println("Enter the name of the employee :");
		String name = s.next();
		
		sa.id = id;
		sa.name = name;
		
		System.out.println("the name of the employee  : " + sa.name + "\n" + "the id of the employee : " + sa.id);
		
		
		
	}
	
}
