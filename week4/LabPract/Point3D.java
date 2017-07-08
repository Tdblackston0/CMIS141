/*
* File: Point3D3D.java
* Author: Terrel Blackston
* Date: 4/8/17
* Purpose: This program constructs instances
* of the Point3D class and uses
* its methods
*/

public class Point3D {
  private double x;
  private  double y;
  private  double z;

  //constructor
  public Point3D (double px, double py, double pz) {
    x = px;
    y = py;
    z = pz;
  }

  //Default constructor
  public Point3D (){
    x = 0.0;
    y = 0.0;
    z = 0.0;
  }

  //Setter methodes setX
  public void setX (double px){
    x = px;
  }

  //SetY()
  public void setY(double py){
    y = py;
  }

  //SetZ()
  public void setZ(double pz){
    z = pz;
  }

  //Getter methods getX
  public double getX(){
    return x;
  }
  //getY

  public double getY(){
    return y;
  }

  public double getZ(){
    return z;
  }
  //Use MAth methodew to get the distance between 2 Point3Ds
  public double getDistance(Point3D p1, Point3D p2){
    //delta x
    double deltaX = Math.abs(p1.getX() - p2.getX());
    double deltaY = Math.abs(p1.getY() - p2.getY());
    double deltaZ = Math.abs(p1.getZ() - p2.getZ());

    //Distance formula
    double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY + deltaZ*deltaZ);
    return distance;
  }

  //toString method
  public String toString() {
    String str = "(" + x + ", " + y + ", " + z +")";
    return str;
  }
}
