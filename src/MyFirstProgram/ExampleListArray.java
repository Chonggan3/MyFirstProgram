package MyFirstProgram;

import java.util.ArrayList;

public class ExampleListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hambuger");
		food.add("hotdog");
		
		food.set(0,"sushi"); //(index,element)
		food.remove(2);
		food.clear(); //clear all the result
		
	
		for(int i =0; i<food.size();i++) {
			System.out.println(food.get(i));
		}
	}

}
