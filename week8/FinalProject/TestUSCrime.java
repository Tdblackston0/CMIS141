/*
* File: TestUSCrime.java
* Author: Terrel Blackston
* Date:5/7/17
* Purpose: This is the final project, this program
*  will pull information from Crime.csv file. Also
* will prompt theuser to selection facts they would like answered
*/
import java.util.*;
import java.io.*;

public class TestUSCrime {
	public static void main(String[] args) {

    //Intializing scanner
		Scanner scannerIn = new Scanner(System.in);
    //Setting running to false to end the while loop.
		boolean running = false;
    //Welcome
    System.out.println("\n");
		System.out.println("****Welcome to the US Crime Static Application****");

    //Do While to keep the program running until the user enter q.
		do {

      //Instructions
			System.out.println("Enter the number of the question you want answered. Enter 'Q' to quit the program: ");

      //Menu
      System.out.println("1. What were the percentages in population growth for each consecutive year from 1994 " +'-'+" 2013?");
      System.out.println("2. What year was the Murder rate the highest?");
      System.out.println("3. What year was the Murder rate the lowest?");
      System.out.println("4. What year was the Robbery rate the highest?");
      System.out.println("5. What year was the Robbery rate the lowest?");
      System.out.println("6. What was the total percentage change in Motor Vehicle Theft between 1998 and 2012?");
      System.out.println("7. Would you like  the population for each year?");
      System.out.println("8. Would you like the number of Rape victims for each year?");
      System.out.println("9 What was the highest percentage for Rape victims?");



      System.out.println(" ");
      System.out.print("Enter your Selection: ");
      String answerSC = scannerIn.nextLine();
      System.out.println(" ");



			if (answerSC.equalsIgnoreCase("1")) {

				// Growth percent
				// 1994-1995
				PopGrowth year1 = new PopGrowth(260327021.0, 262803276.0);
				// 1995-1996
				PopGrowth year2 = new PopGrowth(262803276.0, 265228572.0);
				// 1996-1997
				PopGrowth year3 = new PopGrowth(265228572.0, 267783607.0);
				// 1997-1998
				PopGrowth year4 = new PopGrowth(267783607.0, 270248003.0);
				// 1998-1999
				PopGrowth year5 = new PopGrowth(270248003.0, 272690813.0);
				// 1999 - 2000
				PopGrowth year6 = new PopGrowth(272690813.0, 281421906.0);
				// 2000-2001
				PopGrowth year7 = new PopGrowth(281421906.0, 285317559.0);
				// 2001-2002
				PopGrowth year8 = new PopGrowth(285317559.0, 287973924.0);
				// 2002-2003
				PopGrowth year9 = new PopGrowth(287973924.0, 290788976.0);
				// 2003-2004
				PopGrowth year10 = new PopGrowth(290788976.0, 293656842);
				// 2004-2005
				PopGrowth year11 = new PopGrowth(293656842.0, 296507061.0);
				// 2005-2006
				PopGrowth year12 = new PopGrowth(296507061.0, 299398484.0);
				// 2006-2007
				PopGrowth year13 = new PopGrowth(299398484.0, 301621157.0);
				// 2007-2008
				PopGrowth year14 = new PopGrowth(301621157.0, 304059724.0);
				// 2008-2009
				PopGrowth year15 = new PopGrowth(304059724.0, 307006550.0);
				// 2009-2010
				PopGrowth year16 = new PopGrowth(307006550.0, 309330219.0);
				// 2010-2011
				PopGrowth year17 = new PopGrowth(309330219.0, 311587816.0);
				// 2011-2012
				PopGrowth year18 = new PopGrowth(311587816.0, 313873685.0);
				// 2012-2013
				PopGrowth year19 = new PopGrowth(313873685.0, 316128839.0);

				// Print Results
        System.out.println("\n");
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
        System.out.println(" ");


			} else if (answerSC.equalsIgnoreCase("2")) {
        System.out.print("\n");
				MaxMurder maxMurder = new MaxMurder(1994);
				System.out.println("The Murder rate was highest in " + maxMurder.getMaxMurder());
        System.out.println(" ");



			} else if (answerSC.equalsIgnoreCase("3")) {
				MinMurder minMurder = new MinMurder(2013);
				System.out.println("The Murder rate was lowest in " + minMurder.getMinMurder());
        System.out.println("\n");

        //Quesiton 4 Robbery rate high.
			} else if (answerSC.equalsIgnoreCase("4")) {
				MaxRobbery maxRobbery = new MaxRobbery(1994);
				System.out.println("The Robbery rate Highest percentage year is " + maxRobbery.getMaxRobbery());
        System.out.println(" ");

        //Question 5 Robbery rate low.
			} else if (answerSC.equalsIgnoreCase("5")) {
				MinRobbery minRobbery = new MinRobbery(2013);
				System.out.println("The Robbery rate lowest percentage year is " + minRobbery.getMinRobbery());
        System.out.println(" ");

        //Question 6 CarTheft difference between 1998 and 2012.
			} else if (answerSC.equalsIgnoreCase("6")) {
        CarTheft carTheftD = new CarTheft(459.9,230.4);
        System.out.println("The percent change for Motor Vehicle theft is: " + carTheftD.getCarTheft());
        System.out.println(" ");
        //Questions 7 list each year population
			}else if (answerSC.equalsIgnoreCase("7")) {
        
			  ListPopulation listPop = new ListPopulation();
        listPop.getListPopulation();
        System.out.println(" ");

        //List rape case for each year
			}else if (answerSC.equalsIgnoreCase("8")) {
        ListRape listRape = new ListRape();
        listRape.getListRape();
        System.out.println(" ");

        //Rape highest percentage
			}else if (answerSC.equalsIgnoreCase("9")) {
			  MaxRape maxRape = new MaxRape(39.3);
        System.out.println("The heightest Rape Persentage ever is " + maxRape.getMaxRape());
			}else if (answerSC.equalsIgnoreCase("Q")) {
				System.out.println("Thank you so much for visiting Please return soon!");
				running = true;

			}

		} while (!running);

	}
}
