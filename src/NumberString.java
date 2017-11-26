/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 6. Your pseudocode algorithm here:
 *  for (each of 3 lines)
 *  	for (numbers from 0 to 9)
 *  		write three instances
 *  		move to next output line
	
*/

public class NumberString {

	public static void main(String[] args) {
		numberString();
	}
	public static void numberString() { // write method
		for (int i = 1; i <= 3; i++) { // number of times to repeat
			for (int j = 0; j <= 9; j++) { // number of integers to repeat
				System.out.print(j); // write first instance
				System.out.print(j); // write second instance
				System.out.print(j); // write third instance
			}
				System.out.println();// write blank space and move to next output line
		}
	}

}
