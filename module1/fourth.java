package firstweek;

import java.util.Scanner;

public class fourth {
	
	public static void main(String[] args) {
		double result;
		System.out.println("Enter a value to find the area of the circle : ");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		
		result = 3.14*number*number;
		
		System.out.println("AREA : " + result);
		
		
		
	}

}
