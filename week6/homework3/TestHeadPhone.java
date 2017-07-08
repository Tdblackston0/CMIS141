/*
*File: TestHeadPhone.java
*Date: 4/22/17
*Purpose: The puspose of this program is to
*test the headphone.java class.
*/
//Imported package
import java.awt.Color;
public class TestHeadPhone{
  public static void main(String[] args) {

    //HeadPhone Object 1
    HeadPhone headPhone1 = new HeadPhone();

    //Print results
    System.out.println("Is the user Head Phones plugged in? " + headPhone1.getpluggedIn());
    System.out.println("What is the Volume of the music? " + headPhone1.getVolume());
    System.out.println("What is the brand? " + headPhone1.getManufacturer());
    System.out.println("What is the model? " + headPhone1.getHeadPhoneModel());
    System.out.println("What is the color? " + headPhone1.getHeadPhoneColor());
    System.out.println("\n");

    //HeadPhone object 2
    HeadPhone headPhone2 = new HeadPhone(3,true, "Beats by Dre", "Studio Wireless", Color.pink);

    // Print results
    System.out.println("Is the user HeadPhones plugged in? " + headPhone2.getpluggedIn());
    System.out.println("What is the Volume of the music? " + headPhone2.getVolume());
    System.out.println("What is the brand? " + headPhone2.getManufacturer());
    System.out.println("What is the model? " + headPhone2.getHeadPhoneModel());
    System.out.println("What is the color? " + headPhone2.getHeadPhoneColor());
    System.out.println("\n");

    //HeadPhone object 3
    HeadPhone headPhone3 = new HeadPhone(1,true, "Bose", "QuietComfort 35", Color.cyan);

    //Print results
    // Print results
    System.out.println("Is the user HeadPhones plugged in? " + headPhone3.getpluggedIn());
    System.out.println("What is the Volume of the music? " + headPhone3.getVolume());
    System.out.println("What is the brand? " + headPhone3.getManufacturer());
    System.out.println("What is the model? " + headPhone3.getHeadPhoneModel());
    System.out.println("What is the color? " + headPhone3.getHeadPhoneColor());
    System.out.println("\n");

  }
}
