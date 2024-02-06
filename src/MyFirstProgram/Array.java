package MyFirstProgram;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = { "Camaro", "Castelle", "Proton", "BMW" };

		cars[0] = "Mustang";

		System.out.println(cars[3]);
		
		String[] car = new String[3];
		
		car[0] = "Tesla";
		car[1] = "BMW";
		car[2] = "Honda";
		
		System.out.println(car[2]);
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i]);
		}
	}

}
