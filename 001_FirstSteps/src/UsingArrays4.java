
public class UsingArrays4 {

	public static void main(String[] args) {

		double [][] money = new double[5][6];

		for (int i = 0; i < money.length; i++) {
			double interest = 0.10;
			for (int j = 0; j < money[0].length; j++) {
				if (i == 0) {
					money[i][j] = 10000;
				} else {
					money[i][j] = money[i-1][j] + money[i-1][j]*interest;
					interest += 0.01;
				}
			}
		}

		for (double[] row:money) {
			for(double x:row ) {
				System.out.print(" $");
				System.out.printf("%1.2f", x);
				System.out.print(" |");
			}
			System.out.println("");
		}
	}

}
