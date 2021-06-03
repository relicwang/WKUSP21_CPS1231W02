package week12_Array;

import java.util.Arrays;
import java.util.Scanner;

//Purpose:  Compute the sum of 10 integers given by user
public class ComputeSumArray {

	public static void main(String[] args) {
		// 1. Get 10 integers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 20 numbers seperate by a space: ");

		int[] nums = new int[20];
		
		for(int i=0; i< nums.length; i++) {
			nums[i]=input.nextInt();
		}

		// 2. Compute the sum of two integers
		int sum = 0;
		
		for(int i=0; i< nums.length; i++) {
			sum+=nums[i];
		}
		
		// 3. Print out the result (printf)
		System.out.printf("The sum of %s is %d", Arrays.toString(nums), sum);

	}

}
