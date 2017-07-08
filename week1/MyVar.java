public class MyVar{
public static void main(String[] args) {

  boolean myBoolean1 = true;
  boolean myBoolean2 = false;
  double myDouble1 = 45.54;
  double myDouble2 = 32.932;
  int myInt1 = 35000;
  int myInt2 = 20000;
  char myChar1 = 'D';
  char myChar2 = 'C';

  int newInt1 = 0x0022;
  int newInt2 = 0b1100;
  int newInt3 = 2_000_000_000;


  System.out.println("myBoolean1: " + myBoolean1);
  System.out.println("myBoolean2: " + myBoolean2);

  System.out.println("myDouble1: " + myDouble1);
  System.out.println("myDouble2: " + myDouble2);

  System.out.println("myInt1: " + myInt1);
  System.out.println("myInt2: " + myInt2);
  System.out.println("myChar1: " + myChar1); System.out.println("myChar2: " + myChar2);

  System.out.println("newInt1: " + newInt1);
  System.out.println("newInt2: " + newInt2);
  System.out.println("newInt3: " + newInt3);

  System.out.println(myChar1   +   myChar2);

System.out.println("\n");


int testscore = 86;
   char grade;

   if (testscore >= 90) {
       grade = 'A';
   } else if (testscore >= 80) {
       grade = 'B';
   } else if (testscore >= 70) {
       grade = 'C';
   } else if (testscore >= 60) {
       grade = 'D';
   } else {
       grade = 'F';
   }
   System.out.println("Score = "+testscore +"%" +" Grade = " + grade);

}

}
