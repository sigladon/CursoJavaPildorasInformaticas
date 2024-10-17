package graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyboardEvents {

	public static void main(String[] args) {

		KeyboardFrame myFrame = new KeyboardFrame("Main Window",0);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class KeyboardFrame extends JFrame {

	public KeyboardFrame(String name, int x) {

		setTitle(name);
		setBounds(300+(100*x),300+(100*x),500,350);
		setVisible(true);
		KeyboardEvent listener = new KeyboardEvent();
		addKeyListener(listener);

	}
}

class KeyboardEvent implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		char letter = e.getKeyChar();
		System.out.print(letter);
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		int code = e.getKeyCode();
//		System.out.println(code);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}