import java.io.*;
import java.util.Scanner;

/*
* File: FinalProject.java
* Author: Terrel Blackston
* Date: 5/6/17
* Purpose:
*/

public class FinalProject{
  public static void main(String[] args) {
    //Growth percent
    //1994-1995
    PopGrowth year1 = new PopGrowth(260327021.0,262803276.0);
    //1995-1996
    PopGrowth year2 = new PopGrowth(262803276.0,265228572.0);
    //1996-1997
    PopGrowth year3 = new PopGrowth(265228572.0,267783607.0);
    //1997-1998
    PopGrowth year4 = new PopGrowth(267783607.0, 270248003.0);
    //1998-1999
    PopGrowth year5 = new PopGrowth(270248003.0,272690813.0);
    //1999 - 2000
    PopGrowth year6 = new PopGrowth(272690813.0,281421906.0);
    //2000-2001
    PopGrowth year7 = new PopGrowth(281421906.0,285317559.0);
    //2001-2002
    PopGrowth year8 = new PopGrowth(285317559.0,287973924.0);
    //2002-2003
    PopGrowth year9 = new PopGrowth(287973924.0,290788976.0);
    //2003-2004
    PopGrowth year10 = new PopGrowth(290788976.0,293656842);
    //2004-2005
    PopGrowth year11 = new PopGrowth(293656842.0, 296507061.0);
    //2005-2006
    PopGrowth year12 = new PopGrowth(296507061.0, 299398484.0);
    //2006-2007
    PopGrowth year13 = new PopGrowth(299398484.0, 301621157.0);
    //2007-2008
    PopGrowth year14 = new PopGrowth(301621157.0, 304059724.0);
    //2008-2009
    PopGrowth year15 = new PopGrowth(304059724.0, 307006550.0);
    //2009-2010
    PopGrowth year16 = new PopGrowth(307006550.0, 309330219.0);
    //2010-2011
    PopGrowth year17 = new PopGrowth(309330219.0, 311587816.0);
    //2011-2012
    PopGrowth year18 = new PopGrowth(311587816.0, 313873685.0);
    //2012-2013
    PopGrowth year19 = new PopGrowth(313873685.0, 316128839.0);

    //Print Results
    System.out.println("****Population Growth percent****");
    System.out.println("1994 to 1995: " + year1.getPopGrowth());
    System.out.println("1995 to 1996: " + year2.getPopGrowth());
    System.out.println("1996 to 1997: " + year3.getPopGrowth());
    System.out.println("1997 to 1998: " + year4.getPopGrowth());
    System.out.println("1998 to 1999: " + year5.getPopGrowth());
    System.out.println("1999 to 2000: " + year6.getPopGrowth());
    System.out.println("2000 to 2001: " + year7.getPopGrowth());
    System.out.println("2001 to 2002: " + year8.getPopGrowth());
    System.out.println("2002 to 2003: " + year9.getPopGrowth());
    System.out.println("2003 to 2004: " + year10.getPopGrowth());
    System.out.println("2004 to 2005: " + year11.getPopGrowth());
    System.out.println("2005 to 2006: " + year12.getPopGrowth());
    System.out.println("2006 to 2007: " + year13.getPopGrowth());
    System.out.println("2007 to 2008: " + year14.getPopGrowth());
    System.out.println("2008 to 2009: " + year15.getPopGrowth());
    System.out.println("2009 to 2010: " + year16.getPopGrowth());
    System.out.println("2010 to 2011: " + year17.getPopGrowth());
    System.out.println("2011 to 1912: " + year18.getPopGrowth());
    System.out.println("2012 to 2013: " + year19.getPopGrowth());

    //Max murder rate

    UsCrimeClass crimeClass1 = new UsCrimeClass();

    crimeClass1.loadDataFromFile("Crime1.csv")

    System.out.println(murder1);

  /*  BufferedReader br = null;
    String fileName = "Crime1.csv";
    String line ="";
    String cvsSplitBy = ",";



    try {

      br = new BufferedReader(new FileReader(fileName));
      while ((line = br.readLine()) != null) {
        String[] columns = line.split(cvsSplitBy);
        //System.out.println(country[0]+", " + [6]);
        calculateMinAndMax(columns);
      }
    }catch(IOException ex){
      ex.printStackTrace();
    }

    double[] maxValues;


    for (int i = 0; i < line.length; i++) {
      double currentValue = Double.Double.parseDouble(line[i]);
      if (currentValue > maxValues[i]){
        maxValues[i] = currentValue;
      }
    }*/
  }
}
