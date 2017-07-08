
/*
*File: LoopsDemo.java
*Author: Terrel Blacksotn
*Date: April 4, 2017
*Purpose: This demo is proacticing loops (while, do-while and for).

*/

//imported files
import java.util.Scanner;

public class LoopsDemo{
  public static void main(String[] args) {

    int maxLoop = 0;

    System.out.println("Welcome to the Loops Demo");

    Scanner scannerIn = new Scanner(System.in);

    // prompt use for how many random integers to generator
    System.out.println("How many integers to generate?");
    maxLoop = scannerIn.nextInt();

    // while loops

    int cnt = 0;
    int randInt = 0;
    while (cnt < maxLoop) {
      randInt = (int) (Math.random() * 10);
      System.out.println("WHile loop: Random value is " + randInt);
      cnt++;
    }

    //do while loop same logic as while loop

    cnt = 0;
    do {
      randInt = (int) (Math.random() * 10);
      System.out.println("do-while: random value is " + randInt);
      cnt++;
    } while (cnt <maxLoop);

    for (int i = 0; i < maxLoop; i++) {
      randInt = (int) (Math.random() * 10);
        System.out.println("for loop: Random value is " + randInt);
    }

    //break out of loop
    cnt = 0;
    while (cnt < maxLoop) {
      randInt = (int) (Math.random() * 10);

      if (randInt == 9){
        System.out.println("Found the first 9.");
        break;
      }
      System.out.println("End of loop. Cnt is " + cnt);
      cnt++;
    }
  }
}
