/*
*File: SquareDemo.java
*Author:Dr. Robertson
*Date: 4/21/17
* Purpose: This program demostrat the
* scope of the class and local variables.
*/

public class SquareDemo{

  //Defaut constructors
  private double sideLength;
  private static int numSides;

  public SquareDemo(){
    this(1.0);
    numSides++;
  }

  public SquareDemo(double sLength){
    this.sideLength = sLength;
    numSides++;
  }

  //getter method
  public double getArea(){
    return Math.PI*Math.pow(sideLength, 4);
  }

  public int getSides(){
    return this.numSides;
  }
}
