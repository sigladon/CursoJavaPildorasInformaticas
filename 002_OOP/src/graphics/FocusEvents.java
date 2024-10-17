package graphics;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocusEvents {

	public static void main(String[] args) {

		FocusFrame myFrame = new FocusFrame("Main Window",0);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class FocusFrame extends JFrame {

	public FocusFrame(String name, int x) {

		setTitle(name);
		setBounds(300+(100*x),300+(100*x),500,350);
		setVisible(true);
		add(new FocusPanel());

	}
}

class FocusPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		box1 = new JTextField();
		box2 = new JTextField();
		box1.setBounds(120, 10, 150, 20);
		box2.setBounds(120, 60, 150, 20);
		add(box1);
		add(box2);
		BoxFocus foc1 = new BoxFocus();
		box1.addFocusListener(foc1);

	}

	JTextField box1;
	JTextField box2;

	private class BoxFocus implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			System.out.println("Focus gained");
		}

		@Override
		public void focusLost(FocusEvent e) {
			String email = box1.getText();
			boolean checked = false;
			for (int i=0; i<email.length(); i++) {
				if(email.charAt(i) == '@')
					checked = true;
				
			}
			System.out.println(checked ? "Valid Email" : "Invalid Email");
		}

	}
}
