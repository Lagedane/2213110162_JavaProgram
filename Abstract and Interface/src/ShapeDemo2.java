import java.util.*;

public class ShapeDemo2 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Cylinder[] cylinders = new Cylinder[5];

		for(int i = 0; i < cylinders.length; i++) {
			System.out.print("Input Radius : ");
			double radius = scan.nextDouble();
			System.out.print("Input Height : ");
			double height = scan.nextDouble();
			cylinders[i] = new Cylinder(radius, height);
			System.out.println();
		} //end of for
		for(int i = 0; i < cylinders.length; i++) {
			System.out.println("Cylinder " + (i+1) + ", volume = " + cylinders[i].getVolume());
		} // end of for
	} // end of main()
} // end class
