import java.util.Scanner;

//Purpose: Check whether the integer number given by user
//           is even and show the corresponding result
//Main Idea:  Number%2 ==0? ->Even: Odd
public class CheckEvenNumber {

	public static void main(String[] args) {
		//1. Get number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int number = input.nextInt();
		
		//2. Check whether the number is Even
		//    and Show the result
		
		if(number%2==0)	{
			System.out.println("The number "+ number + " is Even.");
		}
		else {
			System.out.println("The number "+ number + " is Odd.");
	    }
		
		
//		//WRONG WAY!
//		if(number%2==0);
//		{
//			System.out.println("The number "+ number + " is Even.");
//		}
//		
//	
//		//Equals as:
//		if(number%2==0) {/**NOTHING**/ };
//		{
//			System.out.println("The number "+ number + " is Even.");
//		}	
			
		
		
		
	}

}
