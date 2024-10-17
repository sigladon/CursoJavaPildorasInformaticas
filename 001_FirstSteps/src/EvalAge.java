import java.util.Scanner;

public class EvalAge {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Enter your age: ");
			int age = input.nextInt();
			
			/*
			if (age >= 18) {
				System.out.println("You're an adult");
			} else {
				System.out.println("You're underage");
			}
			*/
			
			if (age < 18) {
				System.out.println("You're teenager");
			} else if (age < 40) {
				System.out.println("You're an adult");
			} else if (age < 65) {
				System.out.println("You're senior");
			} else {
				System.out.println("You're elder");
			}
		}
	}
}
