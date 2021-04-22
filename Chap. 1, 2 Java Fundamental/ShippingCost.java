import java.util.Scanner;

//Purpose: Compute the package cost based on following rules:
//         weight <0               --> show user the weight is not valid
//         weight>0 && weight<=2   --> cost is 2.5
//         weight>2 && weight<=4   --> cost is 4.5
//         weight>4 && weight<=10  --> cost is 7.5
//         weight>10 && weight<=20 --> cost is 10.5
//         weight >20              --> show the package can't be shipped

public class ShippingCost {

	public static void main(String[] args) {
		//1. Get weight from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the weight in pound(s):");
		
		double weight = input.nextDouble();
		
		
		//2. Show the result based on the rules
		if(weight<=0) {
			System.out.println("Please enter a valid weight. ");
		}
		else if(weight<=2) {
			System.out.println("The cost is 2.5 ");
		}
		else if(weight<=4) {
			System.out.println("The cost is 4.5 ");
		}
		else if(weight<=10) {
			System.out.println("The cost is 7.5 ");
		}
		else if(weight<=20) {
			System.out.println("The cost is 10.5 ");
		}
		else {
			System.out.println("The package is too large and can't be shipped ");
		}
		
	}

}
