/*
* File: MyMoreString.java
* Author: Terrel Blackston
* Date: 4/29/17
* Purpose: This program constructs String,
* StringBuffer and StringBuilder objects
* and uses several methods
*/

public class MyMoreStrings{
  public static void main(String[] args) {
    String firstName = new String ("Lauryn");
    String lastName = new String ("Blackston");
    String city = new String ("Baltimore");

    String fullName = firstName.concat(" ").concat(lastName);
    System.out.println(fullName);

    StringBuffer cityName = new StringBuffer(fullName);
    cityName.append(" lives in ").append(city);

    System.out.println(cityName);

    cityName.reverse();
    System.out.println(cityName);
  }
}
