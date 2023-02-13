package firstweek;

import java.util.Scanner;


public class brushup {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Enter your birth date: ");
		int date = sc.nextInt();
		System.out.println("Enter your age : ");
		int age =sc.nextInt();
		
		System.out.println("name : " + name + "\n" +"birth date : " + date + " \n" + "age : " + age);
		
		
	}

}
