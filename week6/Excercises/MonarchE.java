/* File:    MonarchE.java
 * Author:  Terrel Blackston
 * Date:    4/20/17
 * Purpose: Implement a simple Employee class
 */
 //imports
 import java.util.Random;

 public class MonarchE {
   public static void main(String[] args) {
     Employee jack = new Employee ();
     Employee jane = new Employee ();
     jack.setPayRate(50.54);
     jack.setHoursWorked (80);

     double payCheck = jack.weekPay();
     double payMonth = jack.monthPay();
     double payYear = jack.yearPay();

     System.out.println("Jack paycheck every two weeks is " + payCheck + " month pay is " + payMonth + " and annual Salary is " + payYear);

     //Random num = new Random(3);
     for (int i=0; i<1; i++) {


     System.out.println((long)(Math.random()*10000000));
   }
 }
 }
