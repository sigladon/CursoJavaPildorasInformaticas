package graphics;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreatingCenterFrame {

	public static void main(String[] args) {
		
		CentredFrame myFrame = new CentredFrame();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);

	}

}

class CentredFrame extends JFrame {
	
	public CentredFrame() {
		
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Dimension screenSize = myScreen.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth/2,screenHeight/2);
		setLocation(screenWidth/4,screenHeight/4);
		setTitle("Fnatic, el más grande");
		Image myIcon = myScreen.getImage("icon.png");
		setIconImage(myIcon);
		
		 
	}
	
}
