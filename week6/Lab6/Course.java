/*
*File: Course.java
*Author:Terrel Blackston
*Date: 4/22/17
* Purpose: This program demostrates the use
* of overloaded constructors
*/

public class Course {
  //Define static class variables
  private static int numCourses = 0;
  //define class variables
  private int numStudents = 35;
  private String courseName = new String ("New Course");

  //Constructors
  //Default constructors
  public Course(){
    //this must be called first
    this(35,"New Course");
    }
    //Full paramenterized constructor
    public Course (int numStudents, String courseName){
      this.numStudents = numStudents;
      this.courseName = courseName;
      numCourses++;
    }
    //partial parameterized Constructors
    /*public Course(int numStudents){
      //number of students is defined
      this(numStudents, "New Course");
      this.numStudents = numStudents;
    }

    public Course (String courseName){
      this(35,courseName);
      this.courseName = courseName;
    }
    //getter method
    public String getCourseName(){
      return this.courseName;
    }

    public int getNumStudents(){
      return this.numStudents;
    }

    public static int getNumCourses(){
      return numCourses;
    }*/
}
