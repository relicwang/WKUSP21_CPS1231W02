import java.util.Scanner;

//Purpose: Get two integer from user
//           and show the one that is larger

public class FindLargerNumber {

	public static void main(String[] args) {
		//1. Get two integers from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please eneter two numbers in integer"
				+ " and seperated by a space:");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//2. Compare the two numbers and find the larger one
		//     Print out the larger number
		if(num1>num2) {
			System.out.println(num1+" is larger compared to "+num2);
		}
		else {
			System.out.println(num2+" is larger compared to "+num1);
		}
		
		
		
	}

}
