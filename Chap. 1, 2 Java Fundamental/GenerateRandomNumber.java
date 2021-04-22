//Purpose: Generate a random double number range [0,10)
//         and print out
public class GenerateRandomNumber {

	public static void main(String[] args) {
		//1.Get a random number in range [0,10)
		double number = Math.random()*10; // -> [0,1) ->*10 -> [0,10)
		
		//2.Print out the number
		System.out.println("A random double number in [0,10) is "+number);
		
		
//		System.out.println(Math.random());
	}

}
