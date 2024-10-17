import javax.swing.JOptionPane;

public class AplicationAccess {

	public static void main(String[] args) {
		
		String password = "Pass123";
		
		String userTry = "";
		
		while (!password.equals(userTry)) {
			
			userTry = JOptionPane.showInputDialog("Enter the password");
			
			if (!password.equals(userTry)) {
				
				System.out.println("Wrong password!");
			}
			
		}

		System.out.println("Access Aproved");

	}

}
