//Purpose: Compute area of circle with radius of 20
//         Goal: area = PI * radius * radius
public class ComputeCircleArea {

	public static void main(String[] args) {
		//1. Define PI and radius
		double pi = 3.14159;
		int    radius =20;
		
		//2. Compute the area
		double area = pi * radius * radius;
		
		//3. Print/show the area to user
		System.out.println("The area for circle with"
				+ " radius 20 is "+area);
		
	}

}
