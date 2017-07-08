/*
* File: ErrorsDemo.java
* Author: Terrel Blackston
* Date: 3/25/17
* Purpose: This program demonstrates the generation and
* mitigation of common programming errors
*/
// Import each required Java class
import java.util.Scanner;

public class ErrorsDemo {
  public static void main(String[] args) {
    // Variables to hold values
    byte age = 0;
    double averageScore = 81.9;
    boolean isMarried = false;
    // Use the Scanner class to read System.in

    Scanner scannerIn = new Scanner(System.in);
    // Prompt the user to enter another int
    System.out.println("Enter your age:");
    // the nextByte() method scans the next int value
    age = scannerIn.nextByte();
    // Prompt the user to enter another double
    System.out.println("Enter the average exam score:");
    // the nextDouble() method scans the next int value
    averageScore = scannerIn.nextDouble();
    // Prompt the user to enter another double
    System.out.println("I am married (true or false):");
    // the nextBoolean() method scans the next boolean value
    isMarried = scannerIn.nextBoolean();
    // Print the results to verify your data
    System.out.println("Thank you for responding to our survey.");
    System.out.println("Your results are: ");
    System.out.println("Your age is: " + age);
    System.out.println("The average Score is: " + averageScore);
    // Logic to print Marriage status
    if (isMarried) {
      System.out.println("I am married.");
    }
    else {
      System.out.println("I am currently not married.");
}
 }
}
