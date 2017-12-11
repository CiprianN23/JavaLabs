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

		Enumeration en = map.keys();
		while (en.hasMoreElements()) {
			Point key = (Point) en.nextElement();
			System.out.println(key + " : " + map.get(key));
		}

		map = mt1.getMap();

		en = map.keys();
		while (en.hasMoreElements()) {
			Point key = (Point) en.nextElement();
			System.out.println(key + " : " + map.get(key));
		}

	}

}
