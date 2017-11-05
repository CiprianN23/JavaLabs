package lab3;

public class DemoPoints {

	public static void main(String[] args) {
		
		GeometricPlane plane = new GeometricPlane();
		
		Point[] mylist = new Point[5];
		mylist[0] = new Point(1, 1);
		mylist[1] = new Point(2,2);
		mylist[2] = new Point(3,3);
		mylist[3] = new Point(1,3);
		mylist[4] = new Point(3,1);
		
		plane.points = mylist;
		
		Point center = plane.GetCenter();
		
	}

}
