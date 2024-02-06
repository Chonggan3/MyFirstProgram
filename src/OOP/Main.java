package OOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		myCar1.drive();

		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		myCar2.brake();
	}

}
