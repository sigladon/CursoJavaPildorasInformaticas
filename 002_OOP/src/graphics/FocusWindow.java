package graphics;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocusWindow extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		FocusWindow myWindow = new FocusWindow();
		myWindow.start();
	}
	
	public void start() {
		frame1 = new FocusWindow();
		frame2 = new FocusWindow();
		frame1.setVisible(true);
		frame2.setVisible(true);
		frame1.setBounds(100,100,600,360);
		frame2.setBounds(800,100,600,360);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.addWindowFocusListener(this);
		frame2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		if (e.getSource() == frame1) {
			frame1.setTitle("I'm focused");
		} else {
			frame2.setTitle("I'm focused");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if (e.getSource() == frame1) {
			frame1.setTitle("");
		} else {
			frame2.setTitle("");
		}
	}
	
	FocusWindow frame1;
	FocusWindow frame2;
	
}
