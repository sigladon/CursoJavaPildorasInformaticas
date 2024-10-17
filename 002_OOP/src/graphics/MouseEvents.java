package graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseEvents {
	public static void main(String[] args) {

		MouseFrame myFrame = new MouseFrame("Main Window",0);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MouseFrame extends JFrame {

	public MouseFrame(String name, int x) {

		setTitle(name);
		setBounds(300+(100*x),300+(100*x),500,350);
		setVisible(true);
		MouseEventsL listener = new MouseEventsL();
		addMouseMotionListener(listener);

	}
}

class MouseEventsL implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Dragging");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Moving");
		
	}
	
	

//	@Override
//	public void mouseClicked(MouseEvent e) {
////		System.out.println("Click N" + e.getClickCount() +  " X: "+ e.getX() + " Y: " + e.getY());
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
//			System.out.println("Left Click");
//		} else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
//			System.out.println("Middle Click");
//		} else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
//			System.out.println("Right Click");
//		}
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
////		System.out.println("Released");
//		
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
////		System.out.println("Entered");
//		
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
////		System.out.println("Exited");
//	}
	
}
