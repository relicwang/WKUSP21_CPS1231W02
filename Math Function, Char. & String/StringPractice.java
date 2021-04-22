package week8_Char;

public class StringPractice {

	public static void main(String[] args) {
		//1. Compare equality of primitive data type:int
		int i =1;
		int j =1;
		
		System.out.println(i==j);
		
		//2.  Compare equality of reference data type:String
		String s1 = "WKU ";
		String s2 = "Computer Science";
		String s3 = "WKU Computer Science";
		String s5 = "WKU Computer Science";
		String s4 = s1 + s2;
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));



	}

}
