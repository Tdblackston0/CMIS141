/*
* File: Quiz3.java
* Author: Terrel Blackston
* Date: 4/18/17
* Purpose: 2 Deminsional Arrays that prints random numbers
* in a 5x10 table
*/

public class Quiz3{

  //Assign variables for the table rows and columns
  static final int RowNum1 = 5;
  static final int ColNum1 = 10;

  public static void main(String[] args) {

    //Creating multidemisional Array
    int [][] demo2D = new int [RowNum1][ColNum1];

    //Assigning Random values
    for (int i = 0; i < RowNum1; i++){
      for (int j = 0; j < ColNum1; j++){
        demo2D [i][j] = (int)(Math.random() * 50);
      }
    }

    //Print results
    for (int j = 0; j < ColNum1; j++){
      for (int i = 0; i < RowNum1; i++){
        System.out.print(demo2D[i][j]+"\t");
      }
      System.out.println("");
    }
  }
}
