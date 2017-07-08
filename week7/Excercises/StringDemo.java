import java.util.Date;
import java.time.LocalDate;
public class StringDemo{
  public static void main(String[] args) {
    String pal = "Dot saw I was Tod";

    StringBuilder sb = new StringBuilder(pal);
    sb.reverse();
    System.out.println(pal);
    System.out.println(sb);

    StringBuffer sBuffer = new StringBuffer("Test ");
    sBuffer.append("String Buffer");
    sBuffer.reverse();
    System.out.println(sBuffer);

    //sBuffer.delete(0,12);
    //System.out.println(sBuffer);


    System.out.println(sBuffer.length());

    LocalDate dateOfBirth = LocalDate.of(1989, Month.JUNE, 2);
      System.out.println(dateOfBirth);
    /*int len = pal.length();
    char[] tempCharArray = new char[len];
    char[] charArray = new char [len];

    System.out.println(tempCharArray);
    for (int i = 0; i<len ; i++) {
      tempCharArray[i] = pal.charAt(i);
    }

    for (int j = 0; j<len ; j++){
      tempCharArray[j] = pal.charAt(len - 1 - j);
    }

    String reversePalindrome = new String(tempCharArray);
    System.out.printf("Hello we are ".concat(reversePalindrome));

    System.out.printf("The value of the float " +
                  "variable is %f, while " +
                  "the value of the " +
                  "integer variable is %d, " +
                  "and the string is %s",
                  floatVar, intVar, stringVar);*/
  }
}
