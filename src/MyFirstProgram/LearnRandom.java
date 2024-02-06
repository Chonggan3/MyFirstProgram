package MyFirstProgram;

import java.util.Random;

@SuppressWarnings("unused")
public class LearnRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		int x = random.nextInt(6);
		double y = random.nextDouble();
        boolean z = random.nextBoolean();	
        
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
