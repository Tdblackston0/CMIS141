
/*
* File: SwitchDemo.java
* Author: Terrel Blacksotn
* Date: March 25, 2017
* Purpose: This program demonstrates the use of switch selection.
* statments
*/

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {

    System.out.print("Welcome to the Switch Lab!!!!");

    System.out.println("\n");

    //variable hold
    int month = 0;
    int numDays = 0;

    //Scanner to input data
    Scanner scannerIn = new Scanner(System.in);

    System.out.print("Enter the Month (1-12):");
    // the nextInt() method scans the next int value
     month = scannerIn.nextInt();
     // Verify the month was entered
     System.out.println("The following month was entered " + month);

     // Selection statement to determine Holiday Greetings
     switch (month) {

        case 1:
        // Print out January Events
        System.out.println("Happy New Year!");
        System.out.println("Celebrate Martin Luther King's Birthday!");
        break;

        case 2:
        	// Print out February Events
        	System.out.println("Happy Valentine's Day!");
        	System.out.println("Happy President's Day!");
        	break;
				case 3:
        	// Print out March Events
        	System.out.println("Enjoy St. Patrick's Day!");
        	break;
        case 4:
					// Print out April Events
					System.out.println("Thomas Jefferson was born in April!");
					break;
				case 5:
					// Print out May Events
					System.out.println("Enjoy Memorial Day!");
					System.out.println("Don't forget to Celebrate with Mom!");
					break;
				case 6:
					// Print out June Events
					System.out.println("Happy Father's Day!");
					break;
				case 7:
					// Print out July Events
					System.out.println("Happy 4th of July!");
					break;
				case 8:
					// Print out August Events
					System.out.println("Barack Obama was born in August!");
					break;
				case 9:
					// Print out September Events
					System.out.println("Celebrate Labor Day!");
					break;
				case 10:
					// Print out October Events
					System.out.println("Happy Halloween!");
					break;
				case 11:
					// Print out November Events
					System.out.println("Happy Thanksgiving Day!");
					System.out.println("Remember to Thank a Vet!");
					break;
				case 12:
					// Print out December Events
					System.out.println("Enjoy those Holidays with Family!");
					break;
				default:
					 System.out.println("Month is not a value between 1 and 12");
					// Exit the application for invalid Months
					System.exit(0);
				}
  }
}
