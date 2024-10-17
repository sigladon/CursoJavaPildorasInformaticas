package graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WritingInPanel {

	public static void main(String[] args) {
		
		TextFrame myFrame = new TextFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class TextFrame extends JFrame {
	public TextFrame() {
		
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("First Text");
		Board myBoard = new Board();
		add(myBoard);
		
		
	}
}

class Board extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Learning Swing" , 100, 100);
	}
	
}