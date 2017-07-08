/*
*File: HeadPhone.java
*Date: 4/22/17
*Purpose: The puspose of this program is to represent
*head phone set for each user
*/

import java.awt.Color;

public class HeadPhone{

  //Static Variables also known as constants
  private static int LOW = 1;
  private static int MEDIUM = 2;
  private static int HIGH = 3;

  //Default variables.
  private int volume = MEDIUM;
  private boolean pluggedIn = false;
  private String manufacturer = new String ("No Brand");
  private String headPhoneModel = new String ("No Model");
  private Color headPhoneColor;

  //Default constructor
  public HeadPhone(){

    this(MEDIUM,false,"No Brand", "No Model", Color.blue);
  }

  //Full Pareamenterized construtor
  public HeadPhone (int volume, boolean pluggedIn, String manufacturer, String headPhoneModel, Color
  headPhoneColor){

    this.volume = volume;
    this.pluggedIn = pluggedIn;
    this.manufacturer = manufacturer;
    this.headPhoneModel = headPhoneModel;
    this.headPhoneColor = headPhoneColor;
  }

  public HeadPhone(int volume){
    this(volume,false,"No Brand", "No Model", Color.blue);

    this.volume = volume;

  }

  public HeadPhone(boolean pluggedIn){
    this(MEDIUM,pluggedIn,"No Brand", "No Model", Color.blue);

    this.pluggedIn = pluggedIn;
  }
  public HeadPhone(String manufacturer, String headPhoneModel){
    this(MEDIUM,false, manufacturer, headPhoneModel, Color.blue);

    this.manufacturer = manufacturer;
    this.headPhoneModel = headPhoneModel;
  }


  public HeadPhone(Color headPhoneColor){
    this(MEDIUM,false,"No Brand", "No Model", headPhoneColor);

    this.headPhoneColor = headPhoneColor;
  }

  public int changeVolume (int vol){

    return volume = vol;
  }
  //Getter methods

  public int getVolume(){
    return this.volume;
  }
  public boolean getpluggedIn(){
    return this.pluggedIn;
  }

  public String getManufacturer(){
    return this.manufacturer;
  }

  public String getHeadPhoneModel(){
    return this.headPhoneModel;
  }

  public Color getHeadPhoneColor(){
    return this.headPhoneColor;
  }




}
