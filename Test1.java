package lasb10;
import java.awt.*;
public class Test1 {
	public static void main(String[] arg){
		Frame f = new Frame("O_Fereasta");
		
		f.setLayout(new FlowLayout());
		
		Button b1 = new Button("OK");
		Button b2 = new Button("Cancel");
		
		f.add(b1);
		f.pack();
		
		f.add(b2);
		f.pack();
		
		f.show();
	}
}
