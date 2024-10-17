import javax.swing.JOptionPane;

import java.awt.HeadlessException;
import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Choose an option: \n"
					+ "1. Square\n"
					+ "2. Rectangle\n"
					+ "3. Triangle\n"
					+ "4. Circle");
			
			int figure = input.nextInt();
			
			switch (figure) {
			
			case 1:
				
				int side = Integer.parseInt(JOptionPane.showInputDialog("Enter the side length: "));
				
				System.out.println("The area of the square is " + Math.pow(side, 2));
				
				break;
				
			case 2:
				
				int base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base length: "));
				int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height length: "));

				System.out.println("The area of the rectangle is " + (base*height));
				
				break;
			
			case 3: 
				
				base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base length: "));
				height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height length: "));

				System.out.println("The area of the triangle is " + (base*height/2));
				
				break;
				
			case 4:
				
				int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter the radius length: "));

				System.out.print("The area of the circle is ");
				System.out.printf("%1.2f", Math.PI * Math.pow(radius, 2));
				
				break;
				
			default:
				
				System.out.print("The option is incorrect");

			}
		} catch (NumberFormatException | HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
