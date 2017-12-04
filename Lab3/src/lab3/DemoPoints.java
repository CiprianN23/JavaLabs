package lab3;
import java.io.*;
import java.util.*;
public class DemoPoints {

	static final Integer ONE = new Integer(1);
	public static void main(String[] args) throws IOException {
		
		Hashtable<Point,Integer> map = new Hashtable<Point, Integer>();
		FileReader  fr = new FileReader ("points.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        while ((line = br.readLine()) != null)
        {
            processLine(line, map);
        }
        Enumeration en = map.keys();
        while (en.hasMoreElements())
        {
            Point key = (Point)en.nextElement();
            System.out.println(key + " : " + map.get(key));
        }
     
	
	
	}
    static void processLine(String line, Map map)
    {
             
        String[] sir = line.split(" ");
        Point p = new Point(Integer.parseInt(sir[0]) ,Integer.parseInt(sir[1])  );
        
         addPoint(map, p);
		
     
    }

    static void addPoint(Map map, Point p)
    {
    	Integer obj = (Integer) map.get(p);
	    if (obj == null)
	    {
	        map.put(p, 1);
	    }
	    else
	    {
	        int i = ((Integer)obj).intValue() + 1;
	        map.put(p, new Integer(i));
	    }
	}
}
