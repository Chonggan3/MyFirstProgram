package MyFirstProgram;

public class Array2D {

	public static void main(String[] args) {
		// 2D array = an array of arrays

		/*String[][] cars = new String[3][3];

		cars[0][0] = "Axia";
		cars[0][1] = "BMW";
		cars[0][2] = "Proton";
		cars[1][0] = "Honda";
		cars[1][1] = "Mustang";
		cars[1][2] = "F-150";
		cars[2][1] = "Ferrari";
		cars[2][2] = "Lambo";*/
		
		
		String[][] cars = {
				{"Camaro","Corvette","Silverado"},
				{"Mustang","Ranger","F-150"},
				{"Ferrari","Lambo","Tesla"}
		};


		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.println(cars[i][j]+ " ");
			}
		}
	}
}
