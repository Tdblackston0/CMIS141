/*
*File: TestCircleScopeDemo.java
*Author:Dr. Robertson
*Date: 4/21/17
* Purpose: This program test the CircleScopeDemo class
*/

public class TestCircleScopeDemo{
  public static void main(String[] args) {

    CircleScopeDemo circleLeft = new CircleScopeDemo();

    //call the get value

    System.out.println("Circle left is: " + circleLeft.getRadius());

    System.out.println("Circle Left Area is: " + String.format("%.2f",circleLeft.getArea()));

    //construct new circle

    CircleScopeDemo circleRight = new CircleScopeDemo(2.0);

    System.out.println("Circle right is:" + circleRight.getRadius());

    System.out.println("Circle right area is: " + String.format("%.2f", circleRight.getArea()));

    //construct another circle center
    CircleScopeDemo circleCenter = new CircleScopeDemo(3.0);

    System.out.println("Circle ceter is: " + circleCenter.getRadius());
    System.out.println("Circle center Area is: " + String.format ("%.2f",circleCenter.getArea()));
  }
}
