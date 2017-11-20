package lab3;

public class Point {

	//members 
	//--------------------------------------
	
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
	//private functions
	//-------------------------------------
}
