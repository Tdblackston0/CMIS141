/*
* File: Lab4Part1.java
* Author: Terrel Blackston
* Date: 4/8/17
* Purpose: This program constructs instances
* of the Point class and uses
* its methods
*/

public class Point {
  private double x;
  private double y;

  //constructor
  public Point (double px, double py) {
    x = px;
    x = py;
  }

  //Default constructor
  public Point (){
    x = 0.0;
    y = 0.0;
  }

  //Setter methodes setX
  public void setX (double px){
    x = px;
  }

  //SetY()
  public void setY(double py){
    y = py;
  }

  //Getter methods getX
  public double getX(){
    return x;
  }
  //getY

  public double getY(){
    return y;
  }

  //Use MAth methodew to get the distance between 2 points
  public double getDistance(Point p1, Point p2){
    //delta x
    double deltaX = Math.abs(p1.getX() - p2.getX());
    double deltaY = Math.abs(p1.getY() = p2.getY());

    //Distance formula
    double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    return distance;
  }
}
