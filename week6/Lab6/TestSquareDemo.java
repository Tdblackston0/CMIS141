/*
*File: TestSquareDemo.java
*Author:Dr. Robertson
*Date: 4/21/17
* Purpose: This program demostrat the
* scope of the class and local variables.
*/

public class TestSquareDemo{
  public static void main(String[] args) {
    SquareDemo squareRight = new SquareDemo();

    System.out.println("Square right sides length are: " + squareRight.getSides());

    System.out.println("Square right Area is: " + squareRight.getArea());

    SquareDemo squareCenter = new SquareDemo(4.0);

    System.out.println("Square cener sides length is: " + squareCenter.getSides());

    System.out.println("Square center areais: "+ squareCenter.getArea());
  }
}
