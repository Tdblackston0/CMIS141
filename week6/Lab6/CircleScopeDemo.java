/*
*File: CircleScopeDemo.java
*Author:Dr. Robertson
*Date: 4/21/17
* Purpose: This program demostrat the
* scope of the class and local variables.
*/

public class CircleScopeDemo{
  //Define a static class var that
  //hold number of objects

  private static int numCircles = 0;
  //Define class variable
  private double radius = 1.0;

  // Constructors **********
  // Default constructors
  public CircleScopeDemo(){
    this.radius = 1.0;
    numCircles++;
  }

  public CircleScopeDemo (double r){
    radius = r;
    numCircles++;
  }

  //Area method
  public double getArea(){
    return Math.PI*Math.pow(radius, 2);
  }

  //geter method
  public double getRadius(){
    return numCircles;
  }
  

}
