package graphics;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class ChangingState {

	public static void main(String[] args) {
		
		StateFrame myFrame = new StateFrame("Main Window",0);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class StateFrame extends JFrame {
	
	public StateFrame(String name, int x) {
		
		setTitle(name);
		setBounds(300+(100*x),300+(100*x),500,350);
		setVisible(true);
		SetState newState = new SetState();
		addWindowStateListener(newState);
		
	}
	
}

class SetState implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("Window has changed its state");
		
		if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("Windows is Maximized");
		} else if(e.getNewState() == Frame.NORMAL) {
			System.out.println("Windows is Normal");
		} else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("Windows is Minimized");
		}
	}
	
}
