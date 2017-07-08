/*
*File: TestCircleScopeDemo.java
*Author:Dr. Robertson
*Date: 4/21/17
* Purpose: This program test the CircleScopeDemo class
*/

public class TestCircleThis{
  public static void main(String[] args) {

    CircleThis circleLeft = new CircleThis();

    //call the get value

    System.out.println("Circle left is: " + circleLeft.getRadius());

    System.out.println("Circle Left Area is: " + String.format("%.2f",circleLeft.getArea()));

    //construct new circle

    CircleThis circleRight = new CircleThis(2.0);

    System.out.println("Circle right is:" + circleRight.getRadius());

    System.out.println("Circle right area is: " + String.format("%.2f", circleRight.getArea()));

    //construct another circle center
    CircleThis circleCenter = new CircleThis(3.0);

    System.out.println("Circle ceter is: " + circleCenter.getRadius());
    System.out.println("Circle center Area is: " + String.format ("%.2f",circleCenter.getArea()));
  }
}
