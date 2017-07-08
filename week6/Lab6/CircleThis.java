/*
* File: CircleThis.java
* Author: Terrel Blackston
* Date: January 1, 2015
* Purpose: This program demonstrates the
* use of the this reference
*/

public class CircleThis{
  private static  int numCircles = 0;
  private double radius = 1.0;

  //default constructor

  public CircleThis(){
    this(1.0);
  }

  public CircleThis (double r){
    this.radius = r;
    numCircles++;
  }

  //area method
  public double getArea(){
    double area = Math.PI*Math.pow(radius,2);
    return area;
  }

  //etter method
  public double getRadius(){
    return this.radius;
  }
  public static int getNumCircles(){
    return numCircles;
  }
}
