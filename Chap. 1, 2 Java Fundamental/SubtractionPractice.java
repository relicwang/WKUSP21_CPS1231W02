import java.util.Scanner;

//Purpose: Create a subtraction practice question, 
//         where the numbers are single-digit number, and
//         number 1>=number 2. Show the result after check
//         user answer with key
public class SubtractionPractice {

	public static void main(String[] args) {
		//1. Generate two random single-digit integer
		int num1 = (int)(Math.random()*10);	
		int num2 = (int)(Math.random()*10);

		/**Swap Two Value
		//Swap value of num1 and num2
		//Orignal:
		//int num1 = 7;
		//int num2 = 5; 
		
		//Goal:
		//int num1 =7;
		//int num2 =5;

		int temp = num1; //Keep copy of num1 original val
		                 //5->temp
		num1 = num2;// 7 -> num1
		num2 = temp;// 5 -> num2
		
		num2 = num1;// 5 -> num2
		num1 = num2;// 5  ->num1
		**/
		
		//2. Swap the value if if number1 < number2
		if(num2>num1) {
			int temp = num1; 
	          
			num1 = num2;
			num2 = temp;
		}
		
		
		//3. Show the question and compute the key		
		System.out.println(num1+ " - "+ num2 +" = ?");
		int key =num1 - num2;
		
		//4. Get user answer
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your answer:");
		int usrAnswer = input.nextInt();
		
		//5. Verify user answer with the key and show the result
		if(usrAnswer==key) {
			System.out.println("Your answer is correct!");
		}
		else {
			System.out.println("Your answer is not correct!");
		}
	}

}
