import javax.swing.JOptionPane;

public class InputExample2 {

	public static void main(String[] args) {
		
		String username = JOptionPane.showInputDialog("Enter your name:");
		
		String age = JOptionPane.showInputDialog("Enter your age: ");
		
		int userAge = Integer.parseInt(age);
		
		userAge++;
		
		System.out.println("Hi " + username + ". You'll be " + userAge + " years old the next year.");

	}

}
