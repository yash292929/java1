package firstweek;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
    	
    	double result;
    	
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter height :  ");
    	
    	double height = sc.nextDouble();
    	System.out.println("Enter base :  ");
    	
    	double base = sc.nextDouble();
    	
    	result = 0.5 * base * height;
    	
    	System.out.println("AREA  = 0.5 * " + height + "* " + base + " = " + result);
    	
    	
    	
    	
    	
    	
    }
}
