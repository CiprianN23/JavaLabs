package lab3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DemoPoints {

	static Point key;
	public static void main(String[] args) throws InterruptedException {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException ex) {
				}

				final JFrame frame = new JFrame("Points Test");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(new BorderLayout());
				frame.setSize(500, 500);
				
				JPanel openpanel = new JPanel();
				openpanel.setLayout(new FlowLayout(FlowLayout.LEADING));
				
				JPanel pointsPanel = new JPanel();
				pointsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
				
				JList pointsList = new JList();
				
				JLabel label = new JLabel();
				label.setLayout(new FlowLayout(FlowLayout.CENTER));
				
				JButton openButton = new JButton("Open");
				openButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						JFileChooser chooser = new JFileChooser();
						if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
							File file = chooser.getSelectedFile();
							MyThread mt = new MyThread(file);
							Thread t = new Thread(mt);
							t.start();
							try {
								t.join();
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							Hashtable<Point, Integer> map = mt.getMap();

							Enumeration en = map.keys();

							while (en.hasMoreElements()) {
								key = (Point) en.nextElement();

								pointsList.setListData(map.keySet().toArray());
							}

						}
					}
				});
				
				openpanel.add(openButton);
				pointsPanel.add(pointsList);
				label.add(openpanel);
				label.add(pointsPanel);
				frame.add(label);
				//frame.pack();
				frame.setLocationByPlatform(true);
				frame.setVisible(true);

			}
		});

	}

}
