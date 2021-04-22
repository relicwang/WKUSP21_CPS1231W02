import java.util.Scanner;

//Purpose: Convert distance in mile to Kilometer,
//           where the miles given by user
//General Logic:  kilometer = miles*1.6
public class ConvertMilesToKilometer {

	public static void main(String[] args) {
		//1. Get miles value
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the distance in mile:");
		double miles = input.nextDouble();
		
		input.close();
		
		//2. Convert miles to kilometer
		double kilometer = miles*1.6;		
		
		//3. Show the distance in kilometer
		System.out.println(miles + " mile(s) is equal to "+kilometer+ " kilometer(s)");
	
		
		
	}

}
