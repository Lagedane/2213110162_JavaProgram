
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius, null);
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		return super.getArea() * getHeight();
	}
	
	@Override
	public double getArea() {
		return (2 * Math.PI * super.getRadius() * getHeight()) + (2 * super.getArea());
	}
	
	@Override
	public String toString() {
		return "height = " + getHeight() + super.toString();
	}
} // end of class
