import javax.swing.*;

public class RectangleDemo1 {

	public static void main(String[] args) {
		double width  = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input Width"));
		double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input Length"));
		String color  = JOptionPane.showInputDialog(null, "Please input Color");
		
		Rectangle rec = new Rectangle(width, length, color);
		JOptionPane.showMessageDialog(null, rec + "\nArea of Rectangle is " + rec.getArea());
	}
} // end of class
