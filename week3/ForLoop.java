//import library
import javax.swing.JOptionPane;

public class ForLoop {
  public static void main(String[] args) {

    int[][] arrayOfInts = {
      {32, 87, 3, 589},
      {12, 1076, 2000, 8},
      {622, 127, 77, 955}
    };
      int searchfor = 955;
      int i;
      int j = 0;
      boolean foundIt = false;

      /*for (i = 0; i <arrayOfInts.length; i++) {
        if (arrayOfInts[i] == searchfor) {
          foundIt = true;

          break;


        }
      }*/

      search:
    for (i = 0; i < arrayOfInts.length; i++) {
        for (j = 0; j < arrayOfInts[i].length;
             j++) {
            if (arrayOfInts[i][j] == searchfor) {
                foundIt = true;
                break search;
            }
        }
    }


      if (foundIt) {
        System.out.println("Found "+ searchfor + " at index " + i+", "+ j);

      }else {
        System.out.println(searchfor + " not in the array");

    }

    System.out.println("\n");




    String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean fIt = false;

        int max = searchMe.length() -
                  substring.length();

    test:
        for (int t = 0; t <= max; t++) {
            int n = substring.length();
            int m = t;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(m++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            fIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
  }
}
