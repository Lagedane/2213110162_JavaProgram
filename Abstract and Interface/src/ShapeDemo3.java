import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder[] cylinders = new Cylinder[5];
		String cyl = "";

		for(int i = 0; i < cylinders.length; i++) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Radius"));
			double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Height"));
			cylinders[i] = new Cylinder(radius, height);
		} //end of for
		for(int i = 0; i < cylinders.length; i++) {
			cyl += "Cylinder " + (i+1) + ", volume = " + cylinders[i].getVolume() + "\n";
		} // end of for
		JOptionPane.showMessageDialog(null, cyl);
	} // end of main()
} // end class
