package MyFirstProgram;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Bro";
		int age = 21;
		hello(name, age);

		int x = 5;
		int y = 7;

		int z = add(x, y);
		System.out.println(z);
	}

	static int add(int x, int y) {
		int z = x + y;
		return z;
	}

	static void hello(String name, int age) {
		System.out.println("Hello" + " " + name + " " + age);
	}
}
