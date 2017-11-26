/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 2. Your pseudocode algorithm here
 *  for (each of ten integers, starting with ten and descending to 1)
 *  multiply integer times itself
 *  write final results and add a space between each result
*/

public class DescendingSquares {

	public static void main(String[] args) {
		printSumOfSquares();
		}
		
		public static void printSumOfSquares() {
			
			for( int i = 10; i >= 1; i-- ) { // number of integers 
				int finalResult = i * i;
			    System.out.print(finalResult + " ");
			
		}
	}
}
	

