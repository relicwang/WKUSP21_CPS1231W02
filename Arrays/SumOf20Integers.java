package week12_Array;

import java.util.Arrays;
import java.util.Scanner;

//Purpose: Compute the sum of 20 integers given by user
public class SumOf20Integers {

	public static void main(String[] args) {
		//1. Get 20 integers from user
		//    and save in an array
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 20 numbers: ");
		
		int[] nums = new int[20];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=input.nextInt();
		}
		
		//2. Compute the sum of 20 integers
		
		int sum = 0;
		
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		
		//3. Print out the sum
		System.out.printf("The sum for: %s is %d. ",Arrays.toString(nums), sum);
	}

}
