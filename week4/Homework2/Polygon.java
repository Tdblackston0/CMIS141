/*
* File: Polygon.java
* Author: Terrel Blackston
* Date: 4/9/17
* Purpose: This program constructs instances
* of the Polygon class and uses its methods
*/

class Polygon{
  private int numSides;
  private double sideLength;
  private double xCoord;
  private double yCoord;
  private double apothem;
  private double perimeter;


  //Constructor
  public Polygon (int pSides, double pLength, double pApothem, double pxCoord, double pyCoord, double pPerimeter){
    numSides = pSides;
    sideLength = pLength;
    xCoord = pxCoord;
    yCoord = pyCoord;
    apothem = pApothem;
    perimeter = pPerimeter;
  }

  //Default constructors
  public Polygon(){
    numSides = 4;
    sideLength = 5.0;
    xCoord = 0.0;
    yCoord = 0.0;
    apothem = 5.0;
    perimeter = 20.0;
  }

  // setter method for numSides
  public void setNumSides (int pSides){
    numSides = pSides;
  }
  // setter method for sideLength
  public void setSideLength (double pLength){
    sideLength = pLength;
  }
  // setter method for xCoord
  public void setXCoord(double pxCoord){
    xCoord = pxCoord;
  }
  // setter method for yCoord
  public void setYCoord (double pyCoord){
    yCoord = pyCoord;
  }
  // setter method for apothem
  public void setApothem(double pApothem){
    apothem = pApothem;
  }
  // setter method for perimeter
  public void perimeter (double pParimeter){
    perimeter = pParimeter;
  }


  // getter method for numSides
  public int getNumSides(){
    return numSides;
  }
  // getter method for sideLength
  public double getSideLength(){
    return sideLength;
  }
  // getter method for xCoord
  public double getXCoord(){
    return xCoord;
  }
  // getter method for yCoord
  public double getYCoord(){
    return yCoord;
  }
  // getter method for apothem
  public double getApothem(){
    return apothem;
  }
  //getter method for perimeter
  public double getPerimeter(){
    return perimeter;
  }

  //getter method for area of polygon
  public double getArea(Polygon a1, Polygon a2){

    double area1 = a1.getApothem();
    double area2 = a2.getPerimeter();
    double results = 0.5 * (area1 * area2);
    return results;
  }

  //getter method for toString
  public String toString(){
    String str = "(numSides = " + numSides + ", sideLength = " + sideLength + ", xCoord = " + xCoord + ", yCoord = " + yCoord + ", apothem = " + apothem + ")";
    return str;

  }





}
