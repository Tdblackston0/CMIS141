
/*
*File: MyMathDemo.java
*Author: Terrel Blacksotn
*Date: April 3, 2017
*Purpose: Math practice.

*/
//Imported statement
import java.util.Scanner;

public class MyMathDemo {
	public static void main(String[] args) {


Scanner scannerIn = new Scanner(System.in);
double side1 = 0;
double side2 = 0;

System.out.print("Enter first Triangle length: ");
side1 = scannerIn.nextDouble();
System.out.print("Enter Second Trianagle length: ");
side2 = scannerIn.nextDouble();

double side3 = Math.hypot(side1, side2);
System.out.println("hypot() is " + side3);
int power = 0;
System.out.println("Enter power: ");
power = scannerIn.nextInt();

System.out.println("pow() of 10 is " + Math.pow(10, power));

int pick1 = (int)(Math.random() * 35) + 36;
System.out.println("Pick 1: " + pick1);
int pick2 = (int)(Math.random() * 35) + 1;
System.out.println("Pick 2: " + pick2);
int pick3 = (int)(Math.random() * 35) + 1;
System.out.println("Pick 3: " + pick3);
int pick4 = (int)(Math.random() * 35) + 1;
System.out.println("Pick 4: " + pick4);
int pick5 = (int)(Math.random() * 35) + 1;
System.out.println("Pick 5: " + pick5);

System.out.println("Your Saturday night lottery picks are: " +pick1 + " " + pick2 + " " + pick3 + " " + pick4 + " " + pick5);

}
}
