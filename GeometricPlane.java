package lab3;
import java.util.*;
public class GeometricPlane {
	
	//members
	public static LinkedList<Point> points;
	
	//public functions
	GeometricPlane(LinkedList<Point> l1){
		points.addAll(l1);
	}
	
	GeometricPlane(Hashtable<?, Point> h1){
		
		points.addAll(h1.values());
	}
	
	public static Point GetCenter()
	{
		if (points == null)
			return null;
		if(points.isEmpty())
			return null;
		
		Point p = new Point(0,0);
		for(int i=0;i < points.size(); i++)
		{
			p.setX( points.get(i).getX() + p.getX() );
			p.setY( points.get(i).getY() + p.getY() );
		}
		p.setX( p.getX() / points.size() );
		p.setY( p.getY() / points.size() );
		
		return p;
	}
	
	
	public Point GetCenter(LinkedList<Point> pts){
		if(pts.isEmpty())
			return null;
		Point p = new Point(0,0);;
		
		Iterator<Point> i = pts.iterator();
		while(i.hasNext())
		{
			Point nextpoint  = i.next();
			p.setX( nextpoint.getX() + p.getX() );
			p.setY( nextpoint.getY() + p.getY() );
		}
		
		p.setX( p.getX() / pts.size() );
		p.setY( p.getY() / pts.size() );
		
		return p;
	}
	
	public Point RotatePoint(Point p1, double angle) {
		p1.setX((int)(GetCenter().getX() + (p1.getX() * Math.cos(angle) - p1.getY() * Math.sin(angle))));
		p1.setY((int)(GetCenter().getX() + (p1.getX() * Math.sin(angle) + p1.getY() * Math.cos(angle))));
		return p1;
		
	}
	/*public void RotatePoints(double angle){
		LinkedList<Point> pts = new LinkedList<Point>();
		for(int i = 0; i < points.size(); i++){
			
		}
		points = pts;
	}*/
	public Point Shift(Point p1,int dx, int dy) {
		
		p1.setX(p1.getX() + dx);
		p1.setY(p1.getY() + dy);
		
		return p1;
	}
	//etc
}