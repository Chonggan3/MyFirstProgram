package MyFirstProgram;

import java.util.Scanner;

public class LogicalOperatorrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit ");
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You are quit the game");
		}else {
			System.out.println("You are still playing the game");
		}
	}

}
