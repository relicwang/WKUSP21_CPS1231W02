package week8_Char;

//Purpose: Generate a random lowercase letter
//Idea:    
//      a. [97,122] -> convert into character
//      b. [0,25]+'a'(get the range for lowercase letter)
//              -> convert int character
public class RandomLowLetter {

	public static void main(String[] args) {

		// Approach 1:
		// 1. Generate a random integer within [97,122]
		int randomInt = (int) (Math.random() * (122 - 97 + 1)) + 97;

		// 2. Convert the integer to character
		char lowerLetter = (char) randomInt;

		// 3. Print the character
		System.out.println(lowerLetter);

		// Approach 2
		// 1. Generate a random integer within [0,25]
		int randomInt2 = (int) (Math.random() * (25+1)) ;

		// 2. Convert the integer to character
		char lowerLetter2 = (char) (randomInt2+'a');

		// 3. Print the character
		System.out.println(lowerLetter2);

	}

}
