import java.io.*;
import java.util.*;
import java.io.IOException;

public class FileReadUMUC{
  public static void main(String[] args) throws IOException{
    int milesDriven = 0;
    double gallonsUsed = 0.0;
    File myFile = new File("input.dat");
    Scanner fileIn = new Scanner(myFile);

    //Read the file until no more data is found
    while (fileIn.hasNext()) {
      milesDriven += fileIn.nextInt();
      gallonsUsed += fileIn.nextDouble();
    }
    System.out.println("Average mpg = " + (milesDriven/gallonsUsed));
    fileIn.close(); // close the file
  }
}
