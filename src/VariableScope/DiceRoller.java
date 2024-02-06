package VariableScope;

import java.util.Random;

public class DiceRoller {
	// global
	Random random;
	Number num;

	DiceRoller() {
		random = new Random();
		roll();
	}

	void roll() {
		num = random.nextInt(6) + 1;
		System.out.println(num);
	}

	// local
	/*
	 * DiceRoller(){ Random random = new Random(); int num = 0; roll(random,num); }
	 * 
	 * void roll(Random random, Number num) { num = random.nextInt(6)+1;
	 * System.out.println(num); }
	 */
}
