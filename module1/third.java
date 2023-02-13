package firstweek;

import java.util.Scanner;

public class third {
	public static void main(String[] args) {
	  int result;
	  System.out.println("enter a character a or b for square or cube of the number respectively : ");
	  Scanner sc = new Scanner(System.in);
	  char letter = sc.next().charAt(0);
	  
	  System.out.println("Enter a number : ");
	  int a = sc.nextInt();
	  
	  switch(letter) {
	  
	  case 'a' :
		  result = a*a;
	      System.out.println("Result : " + result);
	  break;
	  
	  case 'b':
		  result = a*a*a;
		  System.out.println("Result : " + result);
	  break;
	  default:
		  System.out.println("Entered character is invalid ");

	  
	  
	  }
	  
	}

}
