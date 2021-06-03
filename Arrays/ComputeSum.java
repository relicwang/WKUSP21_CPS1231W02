package week12_Array;

import java.util.Scanner;

//Purpose:  Compute the sum of 100 integers given by user
public class ComputeSum {

	public static void main(String[] args) {
		//1. Get two integers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 6 numbers seperate by a space: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		
		
		//2. Compute the sum of two integers
		int sum =  num1 + num2+ num3 + num4+ num5 + num6;
		
		//3. Print out the result (printf)
		System.out.printf("The sum of %d, %d, %d , %d, %d, %d is %d" , num1, num2, num3, num4, num5, num6, sum);
		
	}

}
