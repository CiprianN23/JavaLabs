package lab3;

import java.util.*;

public class DemoPoints {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread("points1.txt");
		MyThread mt1 = new MyThread("points2.txt");
		Thread t = new Thread(mt);
		Thread t1 = new Thread(mt1);
		t.start();
		t1.start();
		t.join();
		t1.join();

		Hashtable<Point, Integer> map = mt.getMap();
		Hashtable<Point, Integer> map1 = mt1.getMap();
		Hashtable<Point, Integer> map2 = new Hashtable();
		map2.putAll(map);
		map2.putAll(map1);

		Enumeration en = map2.keys();
		
		while (en.hasMoreElements()) {
			Point key = (Point) en.nextElement();
			System.out.println(key + " : " + map2.get(key));
		}
		
	}

}
