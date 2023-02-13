package firstweek;

import java.util.Scanner;


public class seventh {
	
	public static void main(String[] args) {
		
		double total;
		double percentage ;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter English marks : ");
		int e = s.nextInt();
		System.out.println("Enter Maths marks : ");
		int m = s.nextInt();
		System.out.println("Enter Science marks : ");
		int sc = s.nextInt();
		System.out.println("Enter history marks : ");
		int h = s.nextInt();
		System.out.println("Enter Geeology marks : ");
		int g = s.nextInt();
		
		total = e+m+sc+h+g;
		
		percentage = (total / 500)*100;
		
		System.out.println("total = " + total +  "\n" + "percentage = " + percentage + "%");
		
		if(percentage > 75) {
			System.out.println("Distinction is achieved ");
		}else if(percentage > 60 && percentage <= 75) {
			System.out.println("first class is achieved ");
			
		}else if(percentage > 50 && percentage <= 60) {
			System.out.println("second class is achieved ");
		}else if(percentage > 35 && percentage <= 50) {
			System.out.println("third class is achieved ");
		}else {
			System.out.println("not good ");
		}
		
	}

}
