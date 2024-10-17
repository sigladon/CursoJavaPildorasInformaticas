package graphics;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowEvents {

	public static void main(String[] args) {
		
		WindowFrame myFrame = new WindowFrame("Main Window",0);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WindowFrame myFrame2 = new WindowFrame("Secondary Window", 1);
		myFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class WindowFrame extends JFrame {
	
	public WindowFrame(String name, int x) {
		
		setTitle(name);
		setBounds(300+(100*x),300+(100*x),500,350);
		setVisible(true);
		
		M_Windows windowListener = new M_Windows();
		
		addWindowListener(windowListener);
		
	}
	
}

class M_Windows implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing Window");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Minimized");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window Maximized");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window deactivated");
	}
	
	
	
}