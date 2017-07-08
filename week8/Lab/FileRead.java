import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
* File: FileRead.java
* Author: Terrel Black
* Date:5/6/17
* Purpose: This program demonstrates reading
* reading data from Files
*/

public class FileRead{
  public static void main(String[] args) {
    Scanner scannerIn = null;
    FileInputStream in = null;
    BufferedReader inputStream = null;

    // int equivalent of the char
    int fileChar;
    String fileLine;
    try{
      in = new FileInputStream("ReadIt.txt");

      System.out.println("ReadItFile Contents");
      //Read one char at a time
      while ((fileChar = in.read()) != - 1){
        System.out.print((char) fileChar);
      }
      //Seperate the file output
      System.out.println("");
      System.out.println("Numbers.txt File Contents");
      //Use of Scanner and BufferedReader
      inputStream = new BufferedReader(new FileReader("Numbers.txt"));
      scannerIn = new Scanner(inputStream);
      while (scannerIn.hasNext()) {
        if (scannerIn.hasNextInt()) {
          System.out.println(scannerIn.nextInt());
        }
        if (scannerIn.hasNextDouble()) {
          System.out.println(scannerIn.nextDouble());
        }else{
          scannerIn.next();
        }
      }
      //Seperate the file output
      System.out.println("");
      //use of
      inputStream = new BufferedReader(new FileReader("Strings.txt"));
      System.out.println("Strings.txt Contents");
      //Read one Line using BufferedReader
      while ((fileLine = inputStream.readLine()) != null) {
        System.out.println(fileLine);
      }
    } catch (IOException io){
      System.out.println("File IO exception" + io.getMessage());
    }finally{
      //need another catch for closing
      //the streams
      try {
        //close the streams
        if(in != null){
          in.close();
        }
        if (inputStream != null){
          inputStream.close();
        }
      }catch (IOException io){
        System.out.println("Issue closing the Files" + io.getMessage());
      }
    }
  }
}
