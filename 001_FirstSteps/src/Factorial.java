import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		int result = 1;
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		
		for (int i=number; i>0; i--) {
			result = result*i;
		}
		
		System.out.println("The factorial of " + number + " is " + result);

	}

}
