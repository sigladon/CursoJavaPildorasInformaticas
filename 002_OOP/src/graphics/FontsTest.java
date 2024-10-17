package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FontsTest {

	public static void main(String[] args) {

		WritingFrame myFrame = new WritingFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class WritingFrame extends JFrame {
	
	public WritingFrame() {
		
		setTitle("Testing with Draws");
		setSize(400,400);
		WriteBoard myBoard = new WriteBoard();
		add(myBoard);
		
		myBoard.setForeground(Color.CYAN);
	}
	
}

class WriteBoard extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font myFont = new Font("Meslo", Font.BOLD, 30);
		g2.setFont(myFont);
//		g2.setColor(Color.ORANGE);
		g2.drawString("Sigladon", 100, 100);
		g2.setFont(new Font("Courier", Font.ITALIC, 35));
//		g2.setColor(new Color(25,64,23));
		g2.drawString("Fnatic", 150, 254);
		

		
		
	}
	
}
