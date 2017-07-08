
/*
*File: RandomDemo.java
*Author: Terrel Blacksotn
*Date: April 4, 2017
*Purpose: random practice.

*/
//Imported statement
import java.util.Scanner;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {

		System.out.println("Wecome to Random Demo!!");

		//Variables
		int randInt = 0;
		boolean randBoolean = false;
		double randDouble = 0.0;

		// construct a Randome class instance

		Random randomGen = new Random();

		//generate a random Int
		randInt = randomGen.nextInt();
		System.out.println("Random int: " + randInt);

		// Generate a random int but limit it

		randInt = randomGen.nextInt(36);
		System.out.println("Random Int Limited: " + randInt);

		//Generate a random boolean
		randBoolean = randomGen.nextBoolean();
		System.out.println("Random Boolean: " + randBoolean);
		if (randBoolean == true){
			System.out.println("pop that pussy");
		}

		//Generate a random double
		randDouble = randomGen.nextDouble();
		System.out.println("Random Double: " + randDouble);

		/* ****************Lottery Pick******************* */
		System.out.println("\n");
		int pick1 = 0;
		int pick2 = 0;
		int pick3 = 0;
		int pick4 = 0;
		int pick5 = 0;
		int megaMilPick = 0;

		pick1 = randomGen.nextInt(74) + 1;
		pick2 = randomGen.nextInt(74) + 1;
		pick3 = randomGen.nextInt(74) + 1;
		pick4 = randomGen.nextInt(74) + 1;
		pick5 = randomGen.nextInt(74) + 1;
		megaMilPick = randomGen.nextInt(14) + 1;

		System.out.println("Tonights 5 pick is: " + pick1 + ", "+ pick2 + ", "+ pick3 + ", "+ pick4 + ", "+ pick5 );
		System.out.println("Mega Milion Pick: " + megaMilPick);



	}
}
