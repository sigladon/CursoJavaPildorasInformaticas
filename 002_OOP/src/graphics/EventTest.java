package graphics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventTest {

	public static void main(String[] args) {

		EventFrame myFrame = new EventFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class EventFrame extends JFrame {
	
	public EventFrame() {
		
		setTitle("Testing with Events");
		setBounds(150,50,900,500);
		ButtonBoard myBoard = new ButtonBoard();
		add(myBoard);
		
	}
	
}

class ButtonBoard extends JPanel{
	
	JButton yellowButton = new JButton("Yellow");
	JButton redButton = new JButton("Red");
	JButton greenButton = new JButton("Green");
	
	public ButtonBoard() {
		add(yellowButton);
		add(redButton);
		add(greenButton);
		
		BGColor yellow = new BGColor(Color.YELLOW);
		BGColor red = new BGColor(Color.RED);
		BGColor green = new BGColor(Color.GREEN);

		yellowButton.addActionListener(yellow);
		redButton.addActionListener(red);
		greenButton.addActionListener(green);
	}
	

	private class BGColor implements ActionListener {
		public BGColor(Color c) {
			backgroundColor = c;
		}

		public void actionPerformed(ActionEvent e) {
			setBackground(backgroundColor);
		}
		
		private Color backgroundColor;
	}
	
}

