import java.io.*;

public class ListPopulation{

  FileInputStream in = null;
  BufferedReader inputStream = null;
  String line = "";
  String csvSplit = ",";

  int interation = 0;

    //Getter method that did not need object
    public void getListPopulation(){

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
          System.out.println("Year " + columns[0] + " and Current Population: "+ columns[1]);

      }

    }catch (IOException e) {
      e.printStackTrace();
    }

  }

}
