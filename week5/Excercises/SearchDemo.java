/*
* File: SearchDemo.java
* Author: Terrel Blackston
* Date: 4/17/17
* Purpose: This program demoenstrates the creation
* and use of java arrays
*/

import java.util.Arrays;

public class SearchDemo{
  // Define constant array size
  static final int ARRAYSIZE = 100;
  //Main method
  public static void main(String[] args) {
    System.out.println("Welcome to the Search Demo");

    //create array of ints
    int[] intValues = new int[ARRAYSIZE];
    //Assign  random values
    for(int i =0; i<intValues.length; i++){
      intValues[i] = (int) (Math.random() * 100);
    }
    System.out.println("*****Unsorted Array*****");
    for(int i =0; i<intValues.length; i++){
      System.out.print("\t"+intValues[i]);
    }
    System.out.println("\n");

    System.out.println("****Sorted Array*****");

    Arrays.sort(intValues);
    for(int i =0; i<intValues.length; i++){
      System.out.println("index is " + i + ", " + "values is " + intValues[i]+"\t");
    }

    //Searching array

    int lookFor = 11;

    int arrIndex = Arrays.binarySearch(intValues,lookFor);
    System.out.println("The index with value 11 is: " + arrIndex);
  }
}
