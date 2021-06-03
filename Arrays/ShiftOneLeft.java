package week12_Array;

public class ShiftOneLeft {

	public static void main(String[] args) {
		//Test Case for shiftOneLeft
//		
//		int i =5;
//		int[] intArr = {1,2,3};
//		System.out.println(i);
//		System.out.println(intArr);
//		
		
      System.out.println(
    		  ArrayHelperMethod.equals(
    				  shiftOneLeft(new int[]{2,0}), new int[]{0,2}));
    		  
    		  
      System.out.println(	  
    		  ArrayHelperMethod.equals(
    				  shiftOneLeft(new int[]{1,1}), new int[]{1,1}));
    		
      System.out.println(
    		  ArrayHelperMethod.equals(
    				  shiftOneLeft(new int[]{1,2,3}), new int[]{2,3,1}));
    		
      System.out.println(
    		  ArrayHelperMethod.equals(
    				  shiftOneLeft(new int[]{}), new int[]{}));
    		

		
		
	}
	
	//Signature: shiftOneLeft: int[] -> int[]/Void
	//Purpose:  
	//           Shift all elements in the given array one left,
	//           while move the first element to the tail.
	//           Return the shifted array.
	//Examples:
	//           shiftOneLeft(new int[]{2,0})-> {0,2}
	//           shiftOneLeft(new int[]{1,1})-> {1,1}
	//           shiftOneLeft(new int[]{1,2,3})-> {2,3,1}
	//           shiftOneLeft(new int[]{})-> {}
	public static int[] shiftOneLeft(int[] arr) {
		
		if(arr.length==0) {
			return arr;
		}
		
		int temp = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		
		arr[arr.length-1]=temp;
		
		return arr;
	} 
}
