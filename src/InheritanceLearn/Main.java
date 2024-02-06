package InheritanceLearn;

public class Main {

	public static void main(String[] args) {
	    //inheritance = the process where one class arquaries
		//              the attributes and methods of another 
	
		Car car = new Car();
	    
		car.go();
		
		Bicycle bike = new Bicycle();
		
	    bike.stop();
	    
	    System.out.print(car.speed);
	    System.out.print(bike.pedals);
	}

}
