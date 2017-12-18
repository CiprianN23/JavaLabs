package lasb10;
import java.awt.*;
public class Test2 {
	public static void main(String[] args){
		Frame f = new Frame("Panel");
		
		Panel panel = new Panel();
		panel.setLayout(new FlowLayout());
		panel.add(new Label("Text"));
		panel.add(new TextField("", 20));
		panel.add(new Button("Reset"));
		
		f.add(panel, BorderLayout.NORTH);
		f.add(new Button("OK"), BorderLayout.EAST);
		f.add(new Button("Cancel"), BorderLayout.WEST);
		f.pack();
		
		f.show();
		
	}
}
