
public class Point3D extends Point2D {
	//Instance Variable
	private float z;
	
	//Constructors
	/**default*/
	public Point3D() {
		super(); // x = 0, y = 0
		this.z = 0.0f;
	}
	/**with parameters*/
	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}
	
	//Getters and Setters
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y, float z) {
		//use setter in superclass, set(x) or set(Y)
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	public float[] getXYZ() {
		float[] results = new float[3];
		results[0] = super.getX();
		results[1] = super.getY();
		results[2] = this.z;
		return results;
	}
	
	@Override
	/**Returns String in the form of "(x,y) and z"*/
	public String toString() {
		return super.toString() + " , and " + getZ();
	}
}
