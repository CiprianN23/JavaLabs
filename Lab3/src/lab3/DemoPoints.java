package lab3;
import java.util.*;
public class DemoPoints {

	public static void main(String[] args) {
		
		LinkedList<Point> p = new LinkedList<Point>();
		p.add(new Point(1,1));
		p.add(new Point(2,2));
		p.add(new Point(3,3));
		GeometricPlane plane = new GeometricPlane(p);
		LinkedList<Point> aux = new LinkedList<Point>();
		for(Point pp : p)
		{
			aux.add(pp);
		}
		Point a = plane.GetCenter(aux);
		
		System.out.println(p.get(1).compareTo(p.get(0)));
		
	}
	//TODO: TreeSet
}