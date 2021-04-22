package week8_Char;
//Purpose: Extract first and last name 
//          from user given string(full name)

import java.util.Scanner;

public class SplitName {

	public static void main(String[] args) {
		//1. Get full name(String) from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a name"
				+ "(Seperate first and last name using a space：");
		String fullName = input.nextLine();
		
		//2. Find index of the white space(indexOfSpace)
		int indexOfSpace = fullName.indexOf(' ');
		
		//3. Extract the first name .substring(0, indexOfSpace)
		String firstName = fullName.substring(0,indexOfSpace);
		
		//4. Extract the last name .substring(indexOfSpace+1)
		String lastName = fullName.substring(indexOfSpace+1);
		
		//5. Print out the first and last name
		System.out.println("First name is: "+firstName);
		System.out.println("Last name is: "+lastName);
	}

}
