package week9_Loop;
//Purpose: Simuluate the traffic light via:
//             Print "Red Light" 5 times
//             Print "Green Light" 3 times
//             Print "Yellow Light" 1 time
public class TrafficLight {

	public static void main(String[] args) {
		//1. Print "Red Light" 5 times
		int countForRedLight = 0;
		
		while(countForRedLight<5) {
			System.out.println("Red Light");
			countForRedLight++;
		}
	
		//2. Print "Green Light" 3 times
		int countForGreenLight = 0;
		
		while(countForGreenLight<3) {
			System.out.println("Green Light");
			countForGreenLight++;
		}
		
		//3. Print "Yellow Light" 1 time
		int countForYellowLight = 0;
		
		while(countForYellowLight<1) {
			System.out.println("Yellow Light");
			countForYellowLight++;
		}
		
		
	}

}
