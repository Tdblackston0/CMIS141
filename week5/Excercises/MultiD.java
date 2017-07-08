/*
* File: MultiD.java
* Author: Terrel Blackston
* Date: 4/17/17
* Purpose: This program demoenstrates the creation
* and use of java arrays]
*/

//Import color class
import java.util.Arrays;

public class MultiD{
  static final int NUMYEARS = 7;
  static final int NUMMONTHS = 12;
  static final int NUMDAYS = 31;

  public static void main(String[] args) {

    double [][] precip2D = new double[NUMMONTHS][NUMDAYS];
    //Assign random values
    for (int i = 0; i<NUMMONTHS; i++) {
      for (int j = 0; j<NUMDAYS; j++){
        precip2D[i][j] = Double.parseDouble(String.format("%.2f", Math.random() * 10));
      }
    }

    for (int j = 0; j<NUMDAYS ; j++ ) {
      for (int i = 0; i<NUMMONTHS; i++) {
        System.out.print(precip2D[i][j] + "\t");

      }
      System.out.println("");
    }

    double [][][] precip3D = new double [NUMYEARS][NUMMONTHS][NUMDAYS];

    for (int k = 0; k < NUMYEARS; k++) {
      for (int i = 0; i<NUMMONTHS; i++) {
        for(int j = 0; j<NUMDAYS; j++){
          precip3D[k][i][j] = Double.parseDouble(String.format("%.2f",Math.random() * 10));
        }
      }
    }
    //Define BaseYear
    int baseYear = 2000;
    for (int k = 0; k < NUMYEARS; k++) {
      System.out.println("Year is " + (baseYear + k));

        for(int j = 0; j<NUMDAYS; j++){
          for (int i = 0; i<NUMMONTHS; i++) {
          System.out.print(precip3D[k][i][j]+"\t");
        }
        System.out.println("");
      }
    }
  }
}
