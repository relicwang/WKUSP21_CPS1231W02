import java.util.Scanner;

//Purpose: Implement a scissor-rock-paper game.
//      PC vs User. Computer will generate a random action:
//       where 0 for scissor, 1 for rock, 2 for paper.
//      Then, User will enter an action. 
//      Program will determine the result based on computer and user action.
//      0>2>1,  1>0
public class ScissorRockPaperGame {

	public static void main(String[] args) {
		//1. Show Game title + some info. 
		System.out.println("This is a scissor-rock-paper game");
		System.out.println("Please eneter an action: (0 for scissor, 1 for rock, 2 for paper) ");
	
		//2. Get user action
		Scanner input = new Scanner(System.in);
		int userAction = input.nextInt();
		
		//3. Randomly generate computer action
		// == random integer [0,2]
		int computerAction = (int)(Math.random()*3);
		
		//4. Check the result and show the result
		switch(userAction-computerAction) {
			case 0: System.out.println("Draw.");break;
			//0-1, 1-2
			// where 0 for scissor, 1 for rock, 2 for paper.
			case -1: System.out.println("Computer Win.");break;
			//0-2
			// where 0 for scissor, 1 for rock, 2 for paper.
			case -2:System.out.println("User Win.");break;
			//1-0, 2-1
			// where 0 for scissor, 1 for rock, 2 for paper.
			case 1:System.out.println("User Win.");break;
			//2-0
			// where 0 for scissor, 1 for rock, 2 for paper.
			case 2:System.out.println("Computer Win.");break;
		}
		
		//Approach 2
		
		//Same action -> Draw
		if(userAction==computerAction) {
			
		}
		
		switch(userAction) {
			case 0:
				switch(computerAction) {
				case 1:
				case 2:
				}
			case 1:
				switch(computerAction) {
				case 0:
				case 2:
				}
			case 2:
				switch(computerAction) {
				case 0:
				case 1:
				}
		
		}
	
		
		
		
	}

}
