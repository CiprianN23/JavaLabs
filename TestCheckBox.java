package lasb10;
import java.awt.*;
public class TestCheckBox {
	public static void main(String[] args){
		Frame f = new Frame("CheckBox");
		f.setLayout(new GridLayout(5,1));
		f.setSize(200, 200);
		
		Label label1 = new Label("Ingrediente_Pizza", Label.CENTER);
		label1.setBackground(Color.ORANGE);
		Label label2 = new Label("");
		label2.setBackground(Color.LIGHT_GRAY);
		
		Checkbox cbx1 = new Checkbox("Cascaval");
		Checkbox cbx2 = new Checkbox("Sunca");
		Checkbox cbx3 = new Checkbox("Ardei");
		
		f.add(label1);
		f.add(label2);
		f.add(cbx1);
		f.add(cbx2);
		f.add(cbx3);
		
		f.pack();
		f.show();
	}
}
