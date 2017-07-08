/*
* File: TestPoint3D.java
* Author: Terrel Blackston
* Date: 4/8/17
* Purpose: This program constructs instances of the
* Point class and uses its methods
*/

public class TestPoint3D{
  public static void main(String[] args) {
    Point3D p1 = new Point3D(1.0,-1.54,1.34);
    Point3D p2 = new Point3D(22.3, 4.3, 5.4);

    
    double p1X = p1.getX();
    double p1Y = p1.getY();
    double p1Z = p1.getZ();

    System.out.println("p1 values from getX() getY() getZ(): " + p1X + ", "+p1Y + ", " + p1Z);


    double p2X = p2.getX();
    double p2Y = p2.getY();
    double p2Z = p2.getZ();

    System.out.println("p1 values from getX() getY() getZ(): " + p2X + ", "+p2Y + ", " + p2Z);

    double distance = p1.getDistance(p1,p2);
    System.out.println("Distance between p1,p2 and p3 is: " + distance);

    System.out.println(p1.toString());
    System.out.println(p2.toString());
  }
}
