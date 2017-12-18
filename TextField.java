package lasb10;
import java.awt.*;
public class TestTextField {
	public static void main(String[] args){
		Frame f = new Frame("Text");
		f.setLayout(new GridLayout(3,1));
		f.setSize(200,200);
		f.setBackground(Color.LIGHT_GRAY);
		
		TextField nume = new TextField("", 30);
		TextField parola = new TextField("", 10);
		parola.setEchoChar('*');
		
	}
}
