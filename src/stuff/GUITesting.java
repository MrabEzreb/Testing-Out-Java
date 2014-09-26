package stuff;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class GUITesting {

	public static void main(String[] args) {
		Frame windo2 = new Frame("Mrab's Program");
		windo2.setResizable(false);
		windo2.setSize(800, 450);
		windo2.setVisible(true);
		Label lblOne = new Label("This is a label");
	    Button btn1 = new Button("This is a button");
	    TextField tf1 = new TextField();
	    tf1.setText("This is a textbox");
	    windo2.add(lblOne);
	    windo2.add(btn1);
	    windo2.add(tf1);
	    windo2.setLayout(new FlowLayout(FlowLayout.CENTER));

	}

}
