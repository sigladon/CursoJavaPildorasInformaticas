
public class UsingArrays2 {

	public static void main(String[] args) {
		
		int [] randomArray = new int[150];
		
		for (int i=0; i<randomArray.length; i++) {
			
			randomArray[i] = (int) Math.round(Math.random()*100);
		}
		
		for(int number:randomArray) {
			System.out.print(number + ", ");
		}
		
	}

}
