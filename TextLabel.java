package lasb10;
import java.awt.*;
public class TextLabel {
	public static void main(String[] args){
		Frame f = new Frame("TestLabel");
		f.setLayout(new BorderLayout());
		
		Label nord, sud, est, vest, centru;
		nord = new Label("Nord", Label.CENTER);
		sud = new Label("Sud", Label.CENTER);
		est = new Label("Est", Label.RIGHT);
		vest = new Label("Vest", Label.LEFT);
		centru = new Label("Centru", Label.CENTER);
		centru.setBackground(Color.YELLOW);
		centru.setFont(new Font("Arial", Font.BOLD, 14));
		
		f.add(nord, BorderLayout.NORTH);
		f.add(sud, BorderLayout.SOUTH);
		f.add(est, BorderLayout.EAST);
		f.add(vest, BorderLayout.WEST);
		f.add(centru, BorderLayout.CENTER);
		f.pack();
		
		f.show();
	}
}
