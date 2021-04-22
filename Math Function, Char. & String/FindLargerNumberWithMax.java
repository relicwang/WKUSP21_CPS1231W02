package week7_MathCharString;

import java.util.Scanner;

//Purpose: Find and show the larger number among 2 double values 
//         given by user. Only use Math.max() function       

public class FindLargerNumberWithMax {

	public static void main(String[] args) {
		//1. Get two double values from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two double values:");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		//2. Compare and find the larger number with max() function
		//3. Show the result
		System.out.println(Math.max(num1, num2)+" is the larger number among "
				+ num1+" and "+num2); 
		
		

	}

}
