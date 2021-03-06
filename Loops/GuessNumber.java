package week9_Loop;

import java.util.Scanner;

//Purpose: Create a number guessing game, which
//           cross check the user input integer with
//           the random integer generated by the program.
//           (The random integer is within [0,100].)
//           Show "Too Low"  "Too High" or "Equal" based on
//           user input and random input.
//           The program should keep invite the user to give 
//            the input until the input is equal to the random integer
public class GuessNumber {

	public static void main(String[] args) {
		//1. Generate an random Integer within [0,100]
		int randInt = (int)(Math.random()*101);// ->[0,100]
		System.out.println("[Test Purpose]"+randInt);
		
		
		//2. Get user guess
		System.out.println("Please enter your guess"
				+ "(The range should be [0,100]：");
		
		Scanner input = new Scanner(System.in);
		int userGuess = input.nextInt();
		
		
		//3. Check user value with random integer 
		//     and the result accordingly
		//   Meantime, ask user to give the new input
		while(userGuess!=randInt) {
			//Keep ask user input
			if(userGuess<randInt) {
				System.out.println("Too Low");
			}
			else if(userGuess>randInt) {
				System.out.println("High");
			}
		
			System.out.println("Please try again:");
			userGuess = input.nextInt();
		}
		
	
		System.out.println("Equal");
		
	
	}

}
