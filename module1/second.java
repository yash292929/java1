package firstweek;
import java.util.Scanner;
public class second {
	
	public static void main (String[] args) {
		int result;
		System.out.println("enter a character from 'a' to 'd' [ 'a' for addition , 'b' for subtraction, 'c' for multiplication, 'd' for division : ");
		
	    Scanner sc = new Scanner(System.in);
	    
	    char letter = sc.next().charAt(0);
	    
	    System.out.println("Enter first number : ");
	    int a = sc.nextInt();
	    
	    System.out.println("Enter second number : ");
	    int b = sc.nextInt();
	    
	    
	    
	    switch(letter) {
	    
	    
	    case 'a': 
	    	result = a + b;
	    	System.out.println("result : " + result);
	    break;
	    case 'b' : 
	    	result = a-b;
	    	System.out.println("result : " + result);
	    break;
	    case 'c':
	    	result = a*b;
	    	System.out.println("result : " + result);
	    break;
	    case 'd':
	    	result = a/b;
	    	System.out.println("result : " + result);
	    break;
	    
	    default:
	    	System.out.println("Entered character is invalid");
	    
	    
	    }
	    
		
		
		
	}

}
 