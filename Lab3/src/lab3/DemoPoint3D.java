package lab3;

public class DemoPoint3D {
	public static void main(String args[]) {
		GeometricSpace space = new GeometricSpace(null);
		
		Point3D[] mylist = new Point3D[5];
		
		mylist[0] = new Point3D(1, 1, 1);
		mylist[1] = new Point3D(2,2,2);
		mylist[2] = new Point3D(3,3,3);
		mylist[3] = new Point3D(1,3,2);
		mylist[4] = new Point3D(3,1,4);
		
		space.points3d = mylist;
		Point3D center = space.GetCenter();
	}
}
