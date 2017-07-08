/*
* File: MyStandardIO.java
* Author: Terrel Blackston
* Date: 3/24/17
* Practice but over is asking for information using Scanner import class.
* Scanner classes is a lot better then BufferedReader classes.
*/



//Importing java classes
import java.util.Scanner;
/*
MyStandardIO
*/
public class MyStandardIO {
	public static void main(String[] args) {

    byte age = 0;
    double lati = 0.0;
    double longi = 0.0;
    boolean staying;
    long stars = 0;

/* This is needed when ever you are using scanner
basically defining Scanner as
scannerIn and linking it to the system. */
    Scanner scannerIn = new Scanner(System.in);

    System.out.println("Enter Age: ");
    age = scannerIn.nextByte();

    System.out.println("Enter Lat: ");
    lati = scannerIn.nextDouble();
    System.out.println("Enter Long: ");
    longi = scannerIn.nextDouble();

    System.out.println("Number of Stars: ");
    stars = scannerIn.nextLong();

    System.out.println("True or False, Do you want to stay?: ");

    staying = scannerIn.nextBoolean();

    System.out.println("\n");

    System.out.println("You Are: "+age);
    System.out.println("Latitude: "+lati);
    System.out.println("Longitude: "+longi);
    System.out.println("Stars: "+stars);
    System.out.println("Staying: " + staying);


  }
}
