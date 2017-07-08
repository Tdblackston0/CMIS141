/*
* File: StateBird.java
* Author: Terrel Blackston
* Date: 4/30/17
* Purpose: This program is to build the class and constructos
* for the state bird and flower.
*/

import java.util.Scanner;

public class StateBird{
  private String bird = new String("No Bird");
  private String flower = new String ("No Flower");

  public StateBird(){
    this("No Bird","No Flower");
  }
  public StateBird(String bird, String flower) {
    this.bird = bird;
    this.flower = flower;
  }

  public String getBird(){
    return this.bird;
  }

  public String getFlower(){
    return this.flower;
  }



}
