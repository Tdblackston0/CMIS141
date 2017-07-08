/*
* File: SortDemo.java
* Author: Terrel Blackston
* Date: 4/17/17
* Purpose: This program demoenstrates the creation
* and use of java arrays
*/

//import color class
import java.util.Arrays;

public class SortDemo{
  static final int ARRAYSIZE = 10;
  static final float ARRAYFLOAT = 50;


  //Method from Notes for Select SortDemo
  public static void selectionSort(int[] array) {
    // Iterate for each position in the array.
    //Note that because < (not<=) is used,
    //i<(arary.lenth-1) iterates i from 0 to
    //(array.length-2).

    for (int i = 0; i<(array.length-1); i++ ) {
      int min = i;

      /* Find the smallest value in the array. note that after each pass, the smallest values is in place so the loop starts at the position following the last pass in the loop.
      */
      for (int j=i; j<(array.length); j++ ) {
        if (array[j] <array[min])
          min = j;
        }

        int temp = array[min];
        array[min] = array[i];
        array[i]=temp;


        }//end for loop
      }//end method

      public static void main(String[] args) {
        System.out.println("Welcome to the Sort Demo");

        //Create Array of ints
        int[] intValues = new int[ARRAYSIZE];

          //assign random values
        for (int i = 0; i<intValues.length; i++) {
          intValues[i] = (int)(Math.random() * 100);
    }
    System.out.println("*****Unsorted int array*****");
    for (int i =0; i<intValues.length;i++ ) {
      System.out.println(intValues[i]);
    }
    System.out.println("************************");

    //Call the Selection Sort method
    Arrays.sort(intValues);

    System.out.println("*****Sorted int Array*****");
    //Print the sorted array
    for (int i = 0; i<intValues.length; i++){
      System.out.println(intValues[i]);
    }
    System.out.println("**************************");

    //Generate an array of doubles
    double[] doubleValues = new double[ARRAYSIZE];
    //Assign random values
    for (int i = 0; i < doubleValues.length; i++) {
    doubleValues[i] = (Math.random() * 100);
    }
    System.out.println("*****Unsorted Double Arrays*****");

    //pringt the unsorted array
    for (int i = 0; i<doubleValues.length;i++ ) {
      System.out.println(doubleValues[i]);
    }
    Arrays.sort(doubleValues);

    System.out.println("*****Sorted Double Array*****");
    for (int i = 0; i<doubleValues.length; i++){
      System.out.println(doubleValues[i]);
    }

    System.out.println("*****sorted Float******");

    /*float[] floatValues = new float[ARRAYFLOAT];
    for (int i = 0; i <floatValues.length; i++){
      floatValues[i] = (Math.random() * 50);
    }
    Arrays.sort(floatValues);
    */




  }
}
