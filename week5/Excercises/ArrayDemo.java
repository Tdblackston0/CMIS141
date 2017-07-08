/*
* File: ArrayDemo.java
* Author: Terrel Blackston
* Date: 4/15/17
* Purpose: This program demoenstrates the creation
* and use of java arrays
*/

//Import Color class
import java.awt.Color;

public class ArrayDemo{
  // Define constant array size
  static final int ARRAYSIZE = 20;
  static final int STRARRAYSIZE = 5;

  // main method
  public static void main(String[] args) {

    System.out.println("Welcome to the Array Demo");

    // Create array of instances
    int[] intValues = new int[ARRAYSIZE];
    // Assign random values
    for (int i = 0; i<intValues.length; i++) {
      intValues[i] = (int) (Math.random() * 10);
    }
    // create array of string
    String [] stringValues = new String[STRARRAYSIZE];

    stringValues[0] = "Have a Nice Day!";
    stringValues[1] = "I'll be back!";
    stringValues[2] = "Welcome again!";
    stringValues[3] = "Work hard! Play hard!";
    stringValues[4] = "I can program arrays in Java!";

    // Create array of doubles
    double[] doubleValues = new double [ARRAYSIZE];
    // Assign random values
    for (int i = 0; i < doubleValues.length; i++){
      doubleValues[i] = Math.random() * 100.0;
    }

    // create an array of color

    Color[] colorValues = new Color [ARRAYSIZE];
    for (int i = 0; i < colorValues.length; i++){
      int red = (int) (Math.random() * 255);
      int green = (int) (Math.random() * 255);
      int blue = (int) (Math.random() * 255);
      colorValues[i] = new Color (red, green, blue);
    }
      //Display the results
      System.out.println("Int Values:");
      for (int i = 0; i < intValues.length; i++){
        if ((i % 10) == 0) {
          System.out.println("");
        }
        System.out.print(intValues[i] +"\t");

    }

    System.out.println("");
    System.out.println("Double values:");

    for (int i = 0; i < doubleValues.length; i++) {
      if ((i % 10)==0) {
        System.out.println("");
      }
      // Use string.format to show 2 decimals
      System.out.print(String.format("%.4f\t", doubleValues[i]));
    }

    System.out.println("\nString values: ");
    for (int i = 0; i < stringValues.length; i++) {
      System.out.println(stringValues[i]);
    }

    System.out.println("\nColor values: ");
    for (int i = 0; i < colorValues.length; i++) {
      //Print new line every 10 times
      if ((i % 10)==0) {
        System.out.println("");
      }
      // toString show rgb values
      System.out.print(colorValues[i].toString() +"\t");
      System.out.println("");
    }

  }
}
