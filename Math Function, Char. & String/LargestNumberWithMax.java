package week7_MathCharString;

import java.util.Scanner;

//Purpose: Find and show the largest number among 5 double values from user
//          with Math.max() methods
public class LargestNumberWithMax {

	public static void main(String[] args) {
		//1. Get 5 double values from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter five double values:");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		double num4 = input.nextDouble();
		double num5 = input.nextDouble();
	
		//2. Compare and find the largest number using Max
		//   Logic?
		
		double largestNum = 
				Math.max(num5,Math.max(num4,Math.max(num3,Math.max(num1,num2))));//#5, compare the largest among #1-#4, #1-#4Largest
		
		//3. Show the result
		System.out.println("The largest number is "+largestNum);

	}

}
