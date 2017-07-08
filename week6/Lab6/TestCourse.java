public class TestCourse{
  public static void main(String[] args) {
    //Construct a default Course
    Course course001 = new Course();

    //Call the get values
    System.out.println("course 001 name is: " + course001.getCourseName());

    System.out.println("course 001 num students is: " + course001.getNumStudents());

    //construct a specific values
    Course course002 = new Course(28,"MATH 108");

    System.out.println("course 002 num of students is: " + course002.getNumStudents());

    System.out.println("course 002 name is: " + course002.getCourseName());

    Course course003 = new Course(45);

    System.out.println("Course Name: " + course003.getCourseName());

    System.out.println("Number of students: " + course003.getNumStudents());

    Course course004 = new Course();

    System.out.println("Studnet is in " + course003.getNumCourses() + " courses");

  }
}
