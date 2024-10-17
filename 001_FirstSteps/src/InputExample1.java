import java.util.Scanner;

public class InputExample1 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your name: ");
			
			String username = input.nextLine();
			
			System.out.println("Enter your age: ");
			
			int age = input.nextInt();
			
			System.out.println("Hi " + username + ". The next year you'll be " + (age+1) + " years old.");
		}

	}

}
