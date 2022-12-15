import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		int number[] = new int[5];
		for(int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt
					(JOptionPane.showInputDialog("Input number " + (i+1) + ":"));
		} // end of FOR
		showEven(number);
		showOdd(number);
	}
	
	public static void showEven(int[] nums) {
		String listOfEven = "";
		for (int _nums : nums) {
			if(_nums % 2 == 0) {
				listOfEven += _nums + " ";
			} // end of IF
		} // end of FOR
		JOptionPane.showMessageDialog(null, "List of even number :\n" + listOfEven);
	} // end of showEven
	
	public static void showOdd(int[] nums) {
		String listOfOdd = "";
		for (int _nums : nums) {
			if(_nums % 2 != 0) {
				listOfOdd += _nums + " ";
			} // end of IF
		} // end of FOR
		JOptionPane.showMessageDialog(null, "List of odd number :\n" + listOfOdd);
	} // end of showOdd

}
