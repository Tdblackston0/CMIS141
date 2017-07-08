import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;


public class ifElse {
   public static void main(String[] args) throws IOException{
     int favInt = 0;
     InputStreamReader isReader = new InputStreamReader(System.in);

  BufferedReader stdin = new BufferedReader(isReader);


     System.out.println("Enter Number: ");

    favInt = Integer.parseInt(stdin.readLine());

     System.out.println("The Number is: " + favInt);

   } // end main
} // end class
