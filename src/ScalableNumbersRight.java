/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class ScalableNumbersRight {

	public static void main(String[] args) {
		final int TOP_SCALE = 10;
			for( int line = 1; line <= TOP_SCALE; line++ ) {
				for( int spacesIndex = 1; spacesIndex <= TOP_SCALE - line; spacesIndex++ ) {
					System.out.print(" ");
			}
			for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) {
				System.out.print( line );
			}
			System.out.println();
		}

	}

}
