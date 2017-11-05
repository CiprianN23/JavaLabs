package lab3;

public class Point3D extends Point{
	//variabiles
	int z;
	
	//constructors
	public Point3D(int xx, int yy) {
		super(xx, yy);
		this.z = 0;

	}
	
	public Point3D(int xx, int yy, int zz) {
		super(xx, yy);
		this.z = zz;

	}
	
	//public functions
	public int getZ(){
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

}
