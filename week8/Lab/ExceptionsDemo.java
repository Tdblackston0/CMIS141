import java.util.Scanner;

/*
* File: ExceptionsDemo.java
* Author: Terrel Black
* Date:5/6/17
* Purpose: This program demonstrates catching
* several Java run-time Exceptions
*/

public class ExceptionsDemo{
  //Declare private variables
  private static int age = 32;

  public static void main(String[] args) {
    //TODO code application logic here
    Scanner myScanner = new Scanner (System.in);
    //prompt use to enter an int

    while (true) {
      try {
        System.out.println("Enter your age (e.g. 32): ");
        age = Integer.parseInt(myScanner.next());
        break;
      } catch (NumberFormatException ne) {
        System.err.println("NumberFormatException: " + ne.getMessage());
      } finally {
        System.out.println("Age is only in the mind.");
      }
    } // End while loop
    // Catch arithmetricException
    try {
      int newAge = age / 0;
      //This exception seem limited to int and long math issues
    } catch(ArithmeticException ae){
      System.out.println("ArithmeticException: " + ae.getMessage());
    }
    //catch ArrayIndexOutofBoundsException;
    int[] examGrades = {85, 90, 63, 43, 86};
    try {
      for (int i = 0; i <= examGrades.length; i++) {
        System.out.println("Exam grade is " + examGrades[i]);
      }
    }catch (ArrayIndexOutOfBoundsException outOfBounds){
      System.out.println("Array out of Bounds: " + outOfBounds.getMessage());
    }
  }
}
