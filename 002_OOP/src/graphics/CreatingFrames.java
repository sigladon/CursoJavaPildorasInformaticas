package graphics;

import java.awt.Frame;

import javax.swing.JFrame;

public class CreatingFrames {

	public static void main(String[] args) {
		
		MyFrame frame1 = new MyFrame() ;
		
		frame1.setVisible(true);
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MyFrame extends JFrame {

	public MyFrame() {
//		setSize(500,300);
//		
//		setLocation(500, 300);
		setBounds(500, 300, 550, 400);
		
		setTitle("Ventana Épica");
		
//		setResizable(false);
//		setExtendedState(Frame.MAXIMIZED_BOTH);
	}
	
}
