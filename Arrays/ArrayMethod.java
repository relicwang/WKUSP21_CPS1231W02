package week12_Array;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3};
		System.out.println("Array1 before m "
				+ "is: "+Arrays.toString(arr1));
		m(arr1);
		System.out.println("Array1 before m "
				+ "is: "+Arrays.toString(arr1));
	}
	public static void m(int[] arr2) {
		arr2[2]=5;
		System.out.println("Array2 is: "+Arrays.toString(arr2));
	}
	
}
