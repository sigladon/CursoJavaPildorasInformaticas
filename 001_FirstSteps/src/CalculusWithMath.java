
public class CalculusWithMath {

	public static void main(String[] args) {
		
		//double root = Math.sqrt(9);
		
		double num1 = 5.85f;
		double base = 5;
		
		double exponente = 3;
		
		int ans = (int) Math.round(num1);
		int ans1 = (int) Math.pow(base, exponente);
		
		System.out.println(ans);
		System.out.println("The answer of " + base + " power " + exponente + " is " + ans1);

	}

}

