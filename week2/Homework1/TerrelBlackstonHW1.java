
/*
* File: TerrelBlackstonHW1.java
* Author: Terrel Blackston
* Date: 3/26/17
* Purpose: This program receive user input and
* outputs the user data and conversions based
* on the data received
*/
// Import each required Java class
import java.util.Scanner;

public class TerrelBlackstonHW1 {
	public static void main(String[] args) {

		// Delaring the scanner variable for user input.
		Scanner scannerIn = new Scanner(System.in);

		// variable setup to hold values
		int emplId = 0;
		double quiz1 = 0.0;
		double quiz2 = 0.0;
		double quiz3 = 0.0;
		double averageScore = 0.0;
		int ageMonth = 0;
		int ageYears = 0;
		double tempC = 0;
		double tempF = 0;

		// Degree unicode symbol
		char degrees = '\u00b0';

		// User input for EmplID
		System.out.print("Enter your Student EmplID: ");
		emplId = scannerIn.nextInt();

		// User input for Quiz 1
		System.out.print("Enter your quiz1 percentage score (0.0 - 100.0): ");
		quiz1 = scannerIn.nextDouble();

		// User input for Quiz 2
		System.out.print("Enter your quiz2 percentage score (0.0 - 100.0): ");
		quiz2 = scannerIn.nextDouble();

		// User input for Quiz 3
		System.out.print("Enter your quiz3 percentage score (0.0 - 100.0): ");
		quiz3 = scannerIn.nextDouble();

		// User input for age in months
		System.out.print("Enter your age in months (0 - 1440): ");
		ageMonth = scannerIn.nextInt();

		// User input for Temperature
		System.out.print("Enter the current Temperature in degrees Celsius: ");
		tempC = scannerIn.nextDouble();

		/* **************************************
		* Equations for test score, years and Fahrenheit
		*/

		// conversions from months to years
		ageYears = ageMonth / 12;

		// Average of test scores
		averageScore = (quiz1 + quiz2 + quiz3) / 3;

		// Conversion from Celsius to Fahrenheit

		tempF = (tempC * 9 / 5) + 32;

		System.out.println("\n");

		/*
		  *************************************
		*/

		// Results from user data input.
		System.out.println("***Thank you***");
		System.out.println("Student EMPLID: " + emplId);
		System.out.println("Quiz 1 Score: " + quiz1);
		System.out.println("Quiz 2 Score: " + quiz2);
		System.out.println("Quiz 3 Score: " + quiz3);

		System.out.println("Average quiz score: " + averageScore);

		System.out.println("Age in months: " + ageMonth);
		System.out.println("Age in years: " + ageYears);

		System.out.println("Temperature in Celsius: " + tempC + degrees);

		System.out.println("Temperature in Fahrenheit: " + tempF + degrees);

	}
}
