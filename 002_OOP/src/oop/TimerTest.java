package oop;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		
		GetHour listener = new GetHour();
		
		Timer myTimer = new Timer(5000, listener);
		
		myTimer.start();
		
		JOptionPane.showMessageDialog(null, "Press to Finish");
		

	}

}

class GetHour implements ActionListener {
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date now = new Date();
		
		System.out.println("The hour every 5 seconds: " + now);
		
		
		Toolkit.getDefaultToolkit().beep();

	}
	
}
