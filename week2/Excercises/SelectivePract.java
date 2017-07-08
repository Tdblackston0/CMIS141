/*
* File: SelectiveIfPract.java
* Author: Terrel Blacksotn
* Date: March 25, 2017
* Purpose: This program demonstrates the use of if/else selection
* statments
*/

import java.util.Scanner;

public class SelectivePract {
	public static void main(String[] args) {

		//Welcome note..why not.
		System.out.println("Welcom To My LAB HAHAHAHA");
		System.out.println("\n");
		Scanner scannerIn = new Scanner(System.in);

    double income = 0;

    System.out.print("Enter your income: ");
    income = scannerIn.nextInt();

    //Calculating income taxes.
    if (income > 0 && income <= 20000){

      income = income * .10;

    }

    else if (income >= 20001 && income <=40000){
      income = income * .17;

    }

    else if (income >= 40001 && income <=60000){
      income = income * .24;

    }

    else if (income >= 60001 && income <=100000){
      income = income * .27;

    }
    else if (income >=100001){
      income = income * .34;



    }else {
      System.out.println("Not a valid Salary!");
      System.exit(0);
    }

  System.out.println("Your taxes are: $" + income);

  }
}
