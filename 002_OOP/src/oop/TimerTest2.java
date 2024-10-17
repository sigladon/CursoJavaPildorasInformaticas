package oop;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest2 {

	public static void main(String[] args) {
		
		Clock myClock = new Clock();
		myClock.start(2,true);
		JOptionPane.showMessageDialog(null, "Press OK to QUIT");
		System.exit(0);

	}

}

class Clock {
	
	public void start(int interval,final boolean sound) {

		class GetTime2 implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				System.out.println("The time every " + interval + " second(s): " + now);
				if (sound)
					Toolkit.getDefaultToolkit().beep();
			}
		}

		ActionListener listener = new GetTime2();
		Timer myTimer = new Timer(interval*1000, listener);
		myTimer.start();
	}
	
}
