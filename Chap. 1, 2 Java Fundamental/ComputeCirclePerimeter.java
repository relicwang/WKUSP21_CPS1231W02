import java.util.Scanner;

//Purpose: Compute the perimeter for a circle, 
//with radius given by user
//General Logic: perimeter = 2*PI*radius
public class ComputeCirclePerimeter {

	public static void main(String[] args) {
		//1.Define PI value
		final double PI = 3.14159;
		
		//2. Get radius value
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius for cicle:");
		double radius = input.nextDouble();
		
		//3. Compute the perimeter
		double perimeter = 2*PI*radius;
		
		//4. Show perimeter
		System.out.println("The perimeter for Circle with radius: "+
		radius +  " is "+ perimeter);
	}

}
