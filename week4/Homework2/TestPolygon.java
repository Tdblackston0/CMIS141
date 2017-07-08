/*
* File: TestPolygon.java
* Author: Terrel Blackston
* Date: 4/9/17
* Purpose: This program test the instances created in
* the Polygon class and uses its methods
*/


//imported files

import java.util.Scanner;


public class TestPolygon{
  public static void main(String[] args) {
    Scanner scannerIn = new Scanner(System.in);

    // allowing user to enter in the number of sides
    System.out.println("Welcome to my Polygon! \n");

    //Construct with no argumen (default point)
    Polygon a1 = new Polygon();

    //Constructs with arguments
    Polygon b1 = new Polygon (78, 78.4, 92.96, 87.32, 71.8, 93.21);


    //numSides calling getter method
    int num1X = a1.getNumSides();


    //call getter methods for constructs with arguments
    int nsX = b1.getNumSides();
    double lgX = b1.getSideLength();
    double xcX = b1.getXCoord();
    double ycX = b1.getYCoord();
    double apoX = b1.getApothem();
    double permX = b1.getPerimeter();
    double area1 = b1.getArea(b1,b1);





    // Displaying toString
    System.out.println("toString(): " +b1.toString());


    //Printing result
    System.out.println("getNumSides(): " + nsX);
    System.out.println("getSideLength(): " + lgX);
    System.out.println("getXCoord(): " + xcX);
    System.out.println("getYCoord(): " + ycX);
    System.out.println("getApothem(): " + apoX);
    System.out.println("getPerimeter(): " + permX);
    System.out.println("getArea: "+ area1);



  }
}
