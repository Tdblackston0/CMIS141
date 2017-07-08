/*
* File: State.java
* Author: Terrel Blackston
* Date: 4/30/17
* Purpose: This program is to build the class and construct for the states.
*/

public class State{
  //Default value
  private String allState = new String ("No State");
  
  // constructor using this
  public State(){
    this("No State");
  }

  public State(String allState){
    this.allState = allState;
  }

  //get method
  public String getStates(){
    return this.allState;
  }
}
