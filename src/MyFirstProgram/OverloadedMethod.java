package MyFirstProgram;

public class OverloadedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x = add(1,2,3);
         
         System.out.println(x);
	}
	
	//for this is overloading if we want to solve this problem we add variable change name of class and increase variable
	static int add(int a, int b ) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b ,int c ) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c , int d ) {
		System.out.println("This is overloaded method #2");
		return a + b + c + d;
	}

}
