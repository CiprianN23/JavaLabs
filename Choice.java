package lasb10;
import java.awt.*;
public class Choice {
	public static void main(String[] args){
		Frame f = new Frame("Choice");
		f.setLayout(new GridLayout(4,1));
		f.setSize(200,200);
		
		Label label = new Label("Alegeti_Culoarea");
		label.setBackground(Color.red);
		
		Choice culori = new Choice();
		culori.add("Rosu");
		culori.add("Verde");
		culori.add("Albastru");
		culori.select("Rosu");
		
		f.add(label);
		f.add(culori);
		
		f.pack();
		f.show();
	}
}
