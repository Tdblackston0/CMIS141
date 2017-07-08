/*
*File: StringDemo.java
*Author: Terrel Blacksotn
*Date: April 4, 2017
*Purpose: convert string to numeric value practice.

*/

//import statements
import java.util.Scanner;

public class StringDemo {
  public static void main(String[] args) {

    //Construct strings using literal assignment
    String welcome = "Welcome to the String Demo";
    //Display welcome
    System.out.println(welcome);

    //Use the typical methode to construct a class
    String welcome2 = new String("Welcome again");
    System.out.println(welcome2);

    // Use the concatenation methode
    String concatWelcome = welcome.concat(welcome2);
    // Achieve the same results with the + concatenation
    String concatWelcome2 = welcome + welcome2;

    System.out.println(concatWelcome);

    System.out.println(concatWelcome2);

    //Display the length of each of the strings
    String lengthString = "String Lengths are: \n" +
     "welcome: " + welcome.length() +
     "\nwelcome2: " + welcome2.length() +
     "\nconcatWelcome: " + concatWelcome.length() + "\nconcatWelcome2: " +  concatWelcome2.length();

     System.out.println(lengthString);

     //Adding spaces between the strings

     concatWelcome = welcome.concat(" ").concat(welcome2);
     concatWelcome2 = welcome + " " + welcome2;

     System.out.println("concatWelcome with space: " + concatWelcome);
     System.out.println("concatWelcome2 with space: " + concatWelcome2);

     //Redisplay the length of each of the string with the space included.

     lengthString = "String Lengths are: \n" +
      "welcome: " + welcome.length() +
      "\nwelcome2: " + welcome2.length() +
      "\nconcatWelcome: " + concatWelcome.length() + "\nconcatWelcome2: " +  concatWelcome2.length();

      System.out.println(lengthString);

      // Variables hold
      int age = 0;
      double avgScore = 0.0;

      //scanner class
      Scanner scannerIn = new Scanner(System.in);

      //prompt user for age and avgScore
      System.out.print("Enter your age: ");
      age = Integer.parseInt(scannerIn.next());

      System.out.println("Enter average score: ");
      avgScore = Double.parseDouble(scannerIn.next());

      //display
      System.out.println("Age and average score are: " + age +", " + avgScore);

      //convert number to strings

      String stringAge = Integer.toString(age);
      String stringScore = Double.toString(avgScore);
      // Display
      System.out.println("String age and score are: " + stringAge +", " + stringScore);
  }
}
