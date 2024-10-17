package graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingTest {

	public static void main(String[] args) {
		
		DrawingFrame myFrame = new DrawingFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class DrawingFrame extends JFrame {
	
	public DrawingFrame() {
		
		setTitle("Testing with Draws");
		setSize(400,400);
		FiguresBoard myBoard = new FiguresBoard();
		add(myBoard);
	}
	
}

class FiguresBoard extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
//		g.drawRect(50, 50, 200, 200);
//		g.drawLine(50, 50, 200, 200);
//		g.drawArc(50, 50, 200, 200, 400, 200);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangle = new Rectangle2D.Double(100,100,200,150);
		g2.draw(rectangle);
		
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rectangle);
		g2.draw(ellipse);
		
		g2.draw(new Line2D.Double(100, 100+150/2,300,100+150/2));
		
		double centerX = rectangle.getCenterX();
		double centerY = rectangle.getCenterY();
		
		double radius = 150;
		
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX+200, centerY+150/2);
		
		g2.draw(circle);
		
		
	}
	
}
