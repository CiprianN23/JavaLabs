package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

class MyThread implements Runnable {
	private int count;
	private String fileName;
	private Hashtable<Point, Integer> map;

	public Hashtable<Point, Integer> getMap() {
		return map;
	}

	MyThread(String name) {
		count = 0;
		fileName = name;
	}

	// Entry point al firului
	public void run() {
		System.out.println(fileName + " starting.");

		map = new Hashtable<Point, Integer>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {
				processLine(line, map);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

		System.out.println(fileName + " has been read.");
	}

	static void processLine(String line, Map map) {

		String[] sir = line.split(" ");
		Point p = new Point(Integer.parseInt(sir[0]), Integer.parseInt(sir[1]));

		addPoint(map, p);

	}

	static void addPoint(Map map, Point p) {
		Integer obj = (Integer) map.get(p);
		if (obj == null) {
			map.put(p, 1);
		} else {
			int i = ((Integer) obj).intValue() + 1;
			map.put(p, new Integer(i));
		}
	}
}