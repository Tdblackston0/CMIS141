/*
*File: MyStringDemo.java
*Author: Terrel Blacksotn
*Date: April 4, 2017
*Purpose: Practice using strings.

*/

//import statements
import java.util.Scanner;

public class MyStringDemo{
  public static void main(String[] args) {
    String word1;
    String word2;
    int age1 = 0;
    int dicksize = 0;

    Scanner scannerIn = new Scanner(System.in);

    System.out.print("Please enter your name: ");
    word1 = scannerIn.next();
    System.out.print("Please enter your race: ");
    word2 = scannerIn.next();

    System.out.print("Please enter your age: ");
    age1 = scannerIn.nextInt();
    System.out.print("Please enter your dick size:");
    dicksize = scannerIn.nextInt();
    System.out.print("\n");

    System.out.println("Hello " + word1 + " who is " + word2 + " and is " + age1 + " years old with a penis size of " + dicksize + ".");
  }
}
