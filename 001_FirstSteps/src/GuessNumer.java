import java.util.Scanner;

public class GuessNumer {

	public static void main(String[] args) {
		
		int random = (int) (Math.random() * 100);

		try (Scanner input = new Scanner(System.in)) {
			int userNumber = 0;
			
			int tries = 0;
			
			while (userNumber != random) {
				
				System.out.println("Enter a number: ");
				
				userNumber = input.nextInt();
				
				if (random < userNumber) {
					System.out.println("Lower");
				} else if (random > userNumber) {
					System.out.println("Higher");
				} else {
					System.out.println("WIN");
				}
				
				tries++;
				
			}

			System.out.println("You guessed in " + tries + " tries");
		}

	}

}
