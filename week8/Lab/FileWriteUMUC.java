import java.io.*;
import java.util.*;

public class FileWriteUMUC{
  public static void main(String[] args) throws IOException{
    int milesDriven = 0;
    double gallonsUsed = 0.0;
    File myFile = new File("input.dat");
    Scanner fileIn = new Scanner(myFile);
    File myOutFile = new File("output.txt");

    while (fileIn.hasNext()) {
      milesDriven += fileIn.nextInt();
      gallonsUsed += fileIn.nextDouble();
    }
    if (myOutFile.exists()) {
      System.out.println("File exists, delete it!");
      System.exit(0);
    }
    PrintWriter fileOut = new PrintWriter(myOutFile);
    fileOut.print("Average mpg = " + (milesDriven/gallonsUsed));
    fileIn.close();
    fileOut.close();
  }
}
