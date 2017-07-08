
//Imports
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;

/*
* File: DateTime.java
* Author: Terrel Blackston
* Date: 4/29/17
* Purpose: This program demonstrates the use of the
*classes in the java.time package
*/

public class DateTime{
  public static void main(String[] args) {
    //use LocaleDate class
    //now() uses current local Date
    LocalDate date = LocalDate.now();

    //get year, Terrel day of year
    //and day of month
    int year = date.getYear();
    int yearDay = date.getDayOfYear();
    int monthDay = date.getDayOfMonth();

    // Results print

    System.out.println("Year is " + year);
    System.out.println("Terrel Day is " + yearDay);
    System.out.println("Day of month is " + monthDay);

    //use plus methods
    System.out.printf("%s%n", DayOfWeek.MONDAY.plus(5));

    //Use of method and loop
    //to determine leap years
    for (int i = 1988; i<2025; i++ ) {
      boolean isLeap = Year.of(i).isLeap();
      if(isLeap){
        System.out.println(i + " is a Leap year");
      }
    }

    //Experiment with LocalTime

    LocalTime thisSec;
    //initialize to now
    thisSec = LocalTime.now();
    //Display the hour and LocalTime
    System.out.println("time is " + thisSec);

    //Date and time
    //This uses both Date and time
    LocalDateTime thisDate;
    //now method is useful for all
    thisDate = LocalDateTime.now();
    //get methods are available
    System.out.println("Time Date: " + thisDate.getHour() + ":" + thisDate.getMinute() + ":" + thisDate.getSecond());

    //plus methods are available for checking dates in future
    System.out.printf("now: %s%n", LocalDateTime.now() + ","
+ LocalDateTime.now().plusMonths(24).plusDays(5));
  }
}
