
public class StringManipulation {

	public static void main(String[] args) {
		
		String myName = "Sigladon";
		
		System.out.println("My name is: " + myName);

		System.out.println("My name has  " + myName.length() + " letters.");
		
		System.out.println("The first letter of " + myName + " is " + myName.charAt(0));
		
		int lastLetter = myName.length();
		System.out.println("The last letter of " + myName + " is " + myName.charAt(lastLetter-1));
		

	}

}
