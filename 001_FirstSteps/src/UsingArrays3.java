
public class UsingArrays3 {

	public static void main(String[] args) {

		int [][] matrix = new int[4][5];

		for (int i=0; i<matrix.length; i++) {
			for (int j = 0; j<matrix[i].length; j++) {
				matrix[i][j] = (int) Math.round(Math.random()*100);
			}
		}


		for (int[] row:matrix) {
			for(int x:row ) {
				System.out.print(x + " ");
			}
			System.out.println("");
		}

	}

}
