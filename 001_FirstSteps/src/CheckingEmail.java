import javax.swing.JOptionPane;

public class CheckingEmail {

	public static void main(String[] args) {
		
		int at = 0;
		
		boolean dot = false;
		
		String email = JOptionPane.showInputDialog("Enter your email");
		
		for (int i=0; i<email.length(); i++) {
			
			if ( email.charAt(i)=='@') {
				at++;
			}
			
			if ( email.charAt(i) == '.') {
				dot = true;
			}
				
			
		}
		
		if (at == 1 && dot) {
			System.out.println("Your email is correct");
			
		} else {
			
			System.out.println("Your email is incorrect");
		}

	}

}
