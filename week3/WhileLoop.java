
//import library
import javax.swing.JOptionPane;

public class WhileLoop {
	public static void main(String[] args) {
		int milesDriven = 0;
		double gallonsUsed = 0.0;
		int input = 0;

		String moreInputString = JOptionPane.showInputDialog("Enter 1 to add more data or 0 to quit:");
		input = Integer.parseInt(moreInputString);

		/*
		 * while (input == 1){
		 * 
		 * String numberMilesDrivenString =
		 * JOptionPane.showInputDialog("Enter the number of miles driven:");
		 * 
		 * milesDriven += Integer.parseInt(numberMilesDrivenString);
		 * 
		 * String numberGallonsUsedString =
		 * JOptionPane.showInputDialog("Enter the number of gallons used:");
		 * 
		 * gallonsUsed += Double.parseDouble (numberGallonsUsedString);
		 * 
		 * moreInputString =
		 * JOptionPane.showInputDialog("Enter 1 to add more data, 0 to quit:");
		 * 
		 * input = Integer.parseInt(moreInputString);
		 * 
		 * }
		 */

		do {
			String numberMilesDrivenString = JOptionPane.showInputDialog("Enter the number of miles driven:");

			milesDriven += Integer.parseInt(numberMilesDrivenString);
			String numberGallonsUsedString = JOptionPane.showInputDialog("Enter the number of gallons used");
			gallonsUsed += Double.parseDouble(numberGallonsUsedString);
			moreInputString = JOptionPane.showInputDialog("Enter  1 to add more data or 0 to quit:");

			input = Integer.parseInt(moreInputString);
		} while (input == 1);

		if (gallonsUsed != 0) {
			JOptionPane.showMessageDialog(null, "Average MPG = " + (milesDriven / gallonsUsed));
		} else {
			JOptionPane.showMessageDialog(null, "Invalid number of gallons");
		}

	}
}
