package week7_MathCharString;

import java.util.Scanner;

//Purpose: Compare the user given double value with boundary[5,26].
//          If inside the range, show the user value;
//          Otherwise, show the closest boundary to user given value.
public class ClosestValue {

	public static void main(String[] args) {
		
		//1. Define upper and lower boundary
		final double LOWER = 5;
		final double UPPER = 26;
		
		//2. Get double value from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		double number = input.nextDouble();
		
		//3. Compare the value with the range [5,26]
		//    Inside range, show the user value.
		//    Otherwise, show the closest boundary
		double result = Math.max(Math.min(number, UPPER), LOWER);
	
		//4. Show the result
		System.out.println("The result is "+ result);
	}

}
