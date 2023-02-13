package firstweek;

import java.util.Scanner;


public class sixth {
	
	public static void main(String[] args) {
		double result;
		
		System.out.println("Enter details to find simple interest : ");
		
		Scanner sc = new Scanner(System.in);
		
		double p = sc.nextDouble();
		
		double r = sc.nextDouble();
		
		double t = sc.nextDouble();
		
		result = (p*r*t)/100;
		
		System.out.println("Amount = " + result );
		
		
		
		
		
		
		
		
	}

}
