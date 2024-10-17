package testsPackage;

import java.util.Scanner;

public class UseSizes {

//	enum Talla {XS, S, M, L, XL};
	
	enum Size {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private String abrev;
		
		private Size(String abrev) {
			this.abrev = abrev;
		}
		
		public String getAbrev() {
			return abrev;
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a size: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String value = input.nextLine().toUpperCase();
		
		Size theSize = Enum.valueOf(Size.class, value);
		
		System.out.println("Size = " + theSize);
		
		System.out.println("Abrev =" + theSize.getAbrev());
		

	}

}
