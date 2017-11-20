package lab3;
import java.util.*;
public class DemoPoints {

	public static void main(String[] args) {
		
		Vector<Point> p = new Vector<Point>();
		p.add(new Point(1,1));
		p.add(new Point(2,2));
		p.add(new Point(3,3));
		GeometricPlane plane = new GeometricPlane(p);
		ArrayList<Point> aux = new ArrayList<Point>();
		for(Point pp : p)
		{
			aux.add(pp);
		}
		Point a = plane.GetCenter(aux);
		
	}

}
