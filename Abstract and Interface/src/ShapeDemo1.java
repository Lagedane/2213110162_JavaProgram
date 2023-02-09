import java.util.*;

public class ShapeDemo1 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input Radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input Height : ");
		double height = scan.nextDouble();
		
		System.out.println();
		
		Circle circle = new Circle(radius, null);
		System.out.println("Circle [radius = " + circle.getRadius() + "]"
							+ "\nCircle [area = " + circle.getArea());
		
		System.out.println();
		
		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println("Cylinder [height  = " + cylinder.getHeight() + "]" +
						   "\nCylinder [area    = " + cylinder.getArea()  + "]" +
						   "\nCylinder [volume  = " + cylinder.getVolume() + "]");
	} // end of main()
} // end of class
