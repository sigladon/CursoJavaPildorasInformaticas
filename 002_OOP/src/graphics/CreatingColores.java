package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreatingColores {

	public static void main(String[] args) {

		PaintingFrame myFrame = new PaintingFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class PaintingFrame extends JFrame {
	
	public PaintingFrame() {
		
		setTitle("Testing with Draws");
		setSize(400,400);
		PaintBoard myBoard = new PaintBoard();
		myBoard.setBackground(SystemColor.window);
		add(myBoard);
	}
	
}

class PaintBoard extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangle = new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.GREEN);
		g2.draw(rectangle);
		g2.setPaint(Color.ORANGE);
		g2.fill(rectangle);
//		g2.draw(rectangle);
//		
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rectangle);
		Color myColor = new Color(122,94,94);
		g2.setPaint(myColor);
		g2.fill(ellipse);
		
		
		
	}
	
}