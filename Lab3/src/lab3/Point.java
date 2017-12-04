package lab3;
import java.util.*;
public class Point implements Comparable<Point>{

	//members 
	//--------------------------------------
	
	@Override
	public boolean equals(Object a) {
		return ( this.getX() == ((Point)a).getX() ) && ( this.getY() == ((Point)a).getY() ); 
	}


	@Override
	public int hashCode() {
		return 701 * x + 997 * y; 
	}

	private int x;
	private int y;
	
	//constructors 
	//-------------------------------------
	public Point(int xx, int yy)
	{
		this.x = xx;
		this.y = yy;
	}
	

	//public functions
	//-------------------------------------
	public int getX() 
	{
		return x;
	}
	public int getY() {return y;}
	
	public void setX(int xx) { x = xx; }
	
	public void setY(int yy) 
	{ 
		y = yy;
	}
	public String toString() {
		return this.x + "," + this.y;
		
	}
	public double GetDistance(Point a, Point center)
	{
		return Math.sqrt(Math.pow((GeometricPlane.GetCenter().getY() - a.getX()), 2) + Math.pow((GeometricPlane.GetCenter().getY() - a.getY()), 2));
	}
	
	public int compareTo(Point a)
	{
		double d1 = GetDistance(this, GeometricPlane.GetCenter());
		double d2 = GetDistance(a, GeometricPlane.GetCenter());
		
		if(d1 > d2) return 1;
		else if(d1 == d2) return 0;
		else if(d1 < d2) return -1;
		
		return 1;
		
	}
	//private functions
	//-------------------------------------

}
