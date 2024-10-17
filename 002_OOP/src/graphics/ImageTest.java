package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTest {

	public static void main(String[] args) {

		ImageFrame myFrame = new ImageFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class ImageFrame extends JFrame {
	
	public ImageFrame() {
		
		setTitle("Testing with Draws");
		setBounds(150,50,900,500);
		ImageBoard myBoard = new ImageBoard();
		add(myBoard);
		
		myBoard.setForeground(Color.CYAN);
	}
	
}

class ImageBoard extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		File myImage = new File("icon.png");
		
		try {
			image = ImageIO.read(myImage);
		} catch (IOException e) {
			System.out.println("Image not found");
		}
		
		int imageWidth = image.getWidth(this);
		int imageHeight = image.getHeight(this);
		g.drawImage(image, 0, 0,null);
		
		for (int i=0; i<900;i+=imageWidth) {
			for (int j=0; j<500; j+=imageHeight) {
				if (i+j>0)
					g.copyArea(0, 0, imageWidth, imageHeight, i, j);
			}
		}
		
		
		
	}
	
	private Image image;
	
}
