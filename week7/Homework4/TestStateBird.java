/*
* File: TestStateBird.java
* Author: Terrel Blackston
* Date: 4/30/17
* Purpose: This program Displays the state bird and flower.
*/

import java.util.Scanner;

public class TestStateBird {
	public static void main(String[] args) {
		// Assigning scanner to variable
		Scanner scanner1 = new Scanner(System.in);
		boolean running = false;

		// setting do while state to continue prompting user for input.
		do {
			System.out.print("Enter a State or None to exit: ");

			// scanning for user state input
			String stateSearch = scanner1.nextLine();

			// Maryland state bird and flower object 1
			State md1 = new State("Maryland");
			StateBird md2 = new StateBird("Baltimore Oriole", "Blackeyed Susan");

			// florida state bird and flower object 2
			State fl1 = new State("Florida");
			StateBird fl2 = new StateBird("Northern Mockingbird", "Orange Blossom");

			// California state bird and flower object 3

			State ca1 = new State("California");
			StateBird ca2 = new StateBird("California Quail", "California Poppy");

			// if and else if statement used to print results from user input
			if (stateSearch.equalsIgnoreCase(md1.getStates())) {

				// print reults
        //Maryland else if statement 
				System.out.println("Bird: " + md2.getBird());
				System.out.println("Flower: " + md2.getFlower());
        //Florida else if statement
			} else if (stateSearch.equalsIgnoreCase(fl1.getStates())) {
				System.out.println("Bird: " + fl2.getBird());
				System.out.println("Flower: " + fl2.getFlower());
        //California else if statement
			} else if (stateSearch.equalsIgnoreCase(ca1.getStates())) {
				System.out.println("Bird: " + ca2.getBird());
				System.out.println("Flower: " + ca2.getFlower());
        //None else if statement
			} else if (stateSearch.equalsIgnoreCase("none")) {
				System.out.println("*****Thank you******");
				System.out.println("A summary report for each State, Bird, and Flower is: ");

				System.out.println(md1.getStates() + ", " + md2.getBird() + ", " + md2.getFlower());

				System.out.println(fl1.getStates() + ", " + fl2.getBird() + ", " + fl2.getFlower());

				System.out.println(ca1.getStates() + ", " + ca2.getBird() + ", " + ca2.getFlower());
				System.out.println("Please visit our site again!");

        //Switching while loop to true to stop looping after None is entered
				running = true;
			}

		} while (!running);

	}
}
