package firstweek;

import java.util.Scanner;


public class max {
	
	public static void main(String[] args) {
		
		System.out.println("Enter three numbers: ");
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number a : ");
		int a = s.nextInt();
		
		int b = s.nextInt();
		
		int c = s.nextInt();
		
		if(a>b && a>c) {
			System.out.println( a + "is the maximum");
			
		}else if(b>c && b>a) {
			System.out.println(b + "is the maximum");
			
			
		}else{
			System.out.println(c + "is the greatest");
		}
		
		
	
	}

}
