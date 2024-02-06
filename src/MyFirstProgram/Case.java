package MyFirstProgram;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Pizza"; // try to put this in Friday or Sunday

		switch (day) {
		case "Sunday":
			System.out.println("It is Sunday!");
		case "Monday":
			System.out.println("It is Monday!");
		case "Tuesday":
			System.out.println("It is Tuesday!");
		case "Wednesday":
			System.out.println("It is Wednesday!");
		case "Thursday":
			System.out.println("It is Thursday!");
		case "Friday":
			System.out.println("It is Friday!");
			break;
		case "Saturday":
			System.out.println("It is Saturday!");
		default:
			System.out.println("This is not a day");
		}
	}

}
