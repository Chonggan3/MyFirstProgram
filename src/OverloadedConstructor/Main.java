package OverloadedConstructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //overloaded constructors = multiple constructor within a class with the same name 
		                          // but have different parameters
		                          // name + parameter = signature 
		
		Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepper");
		
		System.out.println("Here are the ingredients of your pizza :");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		
	}

}
