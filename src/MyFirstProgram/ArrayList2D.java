package MyFirstProgram;

import java.util.*;

public class ArrayList2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>>groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();// <this is variable>
		bakeryList.add("Pasta");
		bakeryList.add("Garlic bread");
		bakeryList.add("Donuts");

		ArrayList<String> sauceList = new ArrayList();
		sauceList.add("Tomato");
		sauceList.add("Chili");
		sauceList.add("Cheese");
		
		ArrayList<String> drinkList = new ArrayList();// <this is variable>
		drinkList.add("Soda");
		drinkList.add("Coffee");
		drinkList.add("Fanta");
		
		groceryList.add(bakeryList);
		groceryList.add(sauceList);
		groceryList.add(drinkList); //if add all this is a curly of all in this 
		
		System.out.println(groceryList);  //groceryList.get().get()   index num , index num


	}

}
