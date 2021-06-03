package week12_Array;

import java.util.Arrays;

//Purpose: Compute the average of 100 random double
//           values with range [0,100)
public class ComputeAverage {

	public static void main(String[] args) {
		//1. Generate 100 random double values
		//    range is [0,100) and save them
		double [] randomVals = new double[100];
		
		for(int i=0;i<randomVals.length;i++) {
			double randVal = Math.random()*100;
			randomVals[i]=randVal;
		}
		
		//2. Compute the average of above numbers
		double sum =0;
		
		for(int i=0;i<randomVals.length;i++) {
			sum += randomVals[i];
		}
		
		double average = sum/randomVals.length; // average = sum/ Total #
		
		//3. Output the average value
		System.out.printf("The average for %s \nis %f", 
				Arrays.toString(randomVals),average );
	}

}
