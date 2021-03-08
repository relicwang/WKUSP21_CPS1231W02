

import java.util.*;


//Purpose: Compute area of circle with radius given by user
//  Goal/Main Idea:  area = PI * radius * radius
public class CircleAreaWithUserRadius {

	public static void main(String[] args) {
		//1. Define PI 
		double pi = 3.14159;
		
		//2. Get radius value from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a radius:");
		double radius = input.nextDouble();
		
		input.close();
		
		
		//3. Compute the area of circle
		double area = pi*radius*radius;
		
		//4. Show/print the area
		System.out.println("The area for circle with radius "+ radius +" is "+ area);
	
	
	}

}
