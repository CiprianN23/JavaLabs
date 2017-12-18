package lasb10;
import java.awt.*;
public class TestButton {
	public static void main(String[] args){
		Frame f = new Frame("Button");
		f.setLayout(new FlowLayout());
		f.setSize(200,200);
		
		Button b1 = new Button("OK");
		b1.setBounds(30,30, 50,70);
		b1.setFont(new Font("Arial", Font.BOLD,14));
		b1.setBackground(java.awt.Color.orange);
		f.add(b1);
		
		Button b2 = new Button("Cancel");
		b2.setBounds(100, 30, 70, 50);
		b2.setForeground(java.awt.Color.blue);
		f.add(b2);
		f.pack();
		f.show();
	}
}
