package MyFirstProgram;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
		
		if(age >= 75) {
			System.out.println("Ok Boomer");
		}
		else if(age >= 18) {
			System.out.println("You are adult ");
		}
		else if(age >= 13) {
			System.out.println("You are teenager");
		}
		else {
			System.out.println("You are not adult");
		}

	}

}
