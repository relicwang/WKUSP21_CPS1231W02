package week12_Array;

public class ArrayHelperMethod {

	public static void main(String[] args) {
		//Test Cases for equals method:
		System.out.println(
			equals(new int[]{}, new int[]{})== true);
		System.out.println(
				equals(new int[]{1,2,3}, new int[]{1,2,3})== true);
		
		System.out.println(
				equals(new int[]{1,6,3}, new int[]{1,2,3})== false);
		System.out.println(
				equals(new int[]{1,6}, new int[]{1,6,3})== false);
		
		
		//Test Cases for ==:
//		System.out.println(
//				new int[]{1,2,3}==new int[]{1,2,3}== false);
//		System.out.println(
//				new int[]{}==new int[]{}== false);
//		System.out.println(
//				new int[]{1,6,3}==new int[]{1,2,3}== false);
	}
	
	//Signature: equals:  int[]  int[]->  boolean
	//Purpose: 
	//           Compare whether two given arrays have same content
	//Examples:  equals(new int[]{}, new int[]{}) -> true
	//           equals(new int[]{1,2,3}, new int[]{1,2,3}) -> true
	//           equals(new int[]{1,6,3}, new int[]{1,2,3}) -> false
	public static boolean equals(int[] arr1, int[]arr2) {
		
		if(arr1.length!=arr2.length) {
			return false;
		}
		
		for(int i=0;i<arr1.length;i++) {
			//arr1:  {1,3,5}
			//arr2:  {1,5,5}
			
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
		
	}
}