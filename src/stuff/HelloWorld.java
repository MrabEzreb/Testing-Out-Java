package stuff;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello, World!");
		Canvas variab = new Canvas();
		variab.setSize(120, 120);
		variab.setBackground(Color.white);
		Frame windo = new Frame();
		windo.setLocation(10, 10);
		windo.add(variab);
		windo.setSize(400, 300);
		windo.setVisible(true);
		Thread.sleep(1000);
		windo.setVisible(false);
		Thread.sleep(1000);
		windo.setVisible(true);
		Thread.sleep(1000);
		windo.setVisible(false);
		Thread.sleep(1000);
		windo.setVisible(true);
		Thread.sleep(1000);
		windo.setVisible(false);
		Thread.sleep(1000);
		windo.setVisible(true);
		Thread.sleep(1000);
		windo.setVisible(false);
		Thread.sleep(1000);
		windo.setVisible(true);
		Thread.sleep(1000);
		windo.setVisible(false);
		Thread.sleep(1000);
	}

}
