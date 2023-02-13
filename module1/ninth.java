package firstweek;

import java.util.Scanner;


public class ninth {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a Year : ");
		
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		if(year%4==0) {
			
			System.out.println("The year is leap year");
			
		}else {
			
			System.out.println("the year is not leap");
		}
		
		
		
		
	}

}
