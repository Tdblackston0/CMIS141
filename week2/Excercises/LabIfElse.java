/*
* File: LabIfElse.java
* Author: Terrel Blacksotn
* Date: March 25, 2017
* Purpose: This program demonstrates the use of if/else selection
* statments
*/

import java.util.Scanner;

public class LabIfElse {
	public static void main(String[] args) {

		//Welcome note..why not.
		System.out.println("Welcom To my LAB HAHAHAHA");
		System.out.println("\n");
		Scanner scannerIn = new Scanner(System.in);

		/*int age = 0;
		boolean canVote = false;
		System.out.print("How old are you? ");
		age = scannerIn.nextInt();
		if (age >=18){
			canVote = true;
			System.out.println("You can vote");

		}else{
			System.out.println("You cannot Vote Yet!");
		}*/

		//**************************************
		//Variables to hold values
		int month = 0;
		int numDays = 31;

		System.out.print("Enter an Number 1-12: ");
		month = scannerIn.nextInt();

		/*if (month == 1) {
			numDays = 31;
			System.out.println("January");

		}
		else if (month == 2) {
			numDays = 28;
			System.out.println("Feburary");
		}
		else if (month == 3) {
			numDays = 31;
			System.out.println("March");

		}
		else if (month == 4) {
			numDays = 30;
			System.out.println("April");

		}
		else if (month == 5){
			numDays = 31;
			System.out.println("May");

		}
		else if (month == 6) {
			numDays = 30;
			System.out.println("June");

		}
		else if (month == 7) {
			numDays = 31;
			System.out.println("July");

		}
		else if (month == 8) {
			numDays = 31;
			System.out.println("August");

		}
		else if (month == 9) {
			numDays = 30;
			System.out.println("September");

		}
		else if (month == 10) {
			numDays = 31;
			System.out.println("October");

		}
		else if (month == 11) {
			numDays = 30;
			System.out.println("November");

		}
		else if (month == 12) {
			numDays = 31;
			System.out.println("December");

		}*/

		if ((month == 1) ||
		(month == 3) ||
		(month == 5) ||
		(month == 7) ||
		(month == 8) ||
		(month == 10) ||
		(month == 12) ) {
			numDays = 31;

		}
		else if (month == 2) {
			numDays = 28;
		}
		else if ((month == 4) ||
		(month == 6) ||
		(month == 9) ||
		(month == 11) ) {
			numDays = 30;

		}
		else {
			System.out.println("Month is not a value between 1 and 12");
			// Exit the application for invalid Months
			System.exit(0);
		}

		//OUtput the number of days in the selected month.

		System.out.println("Number of Days in month " + month + " is " + numDays);


	}
}
