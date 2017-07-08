import java.io.*;

public class ListRape{

  FileInputStream in = null;
  BufferedReader inputStream = null;
  String line = "";
  String csvSplit = ",";

  int interation = 0;

    //Getter method that did not need object
    public void getListRape(){

    try {
      inputStream = new BufferedReader(new FileReader("Crime.csv"));

      //while loops that reads each line of the csv.
      while ((line = inputStream.readLine())!=null) {
        //If statement to used to skip the title
        if(interation == 0){
          interation++;
          continue;
        }
        //String Array
        String[] columns = line.split(csvSplit);
          //Print results
          System.out.println("Year " + columns[0] + " and Rape Victims each year: "+ columns[6]);

      }
      //Catch exception for readLine
    }catch (IOException e) {
      e.printStackTrace();
    }

  }

}
