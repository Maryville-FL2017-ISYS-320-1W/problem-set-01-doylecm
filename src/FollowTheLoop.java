/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*

1. Fill out the table for the loop below

| ITERATION 		 | VARIABLE NAME | VARIABLE NAME |  VARIABLE NAME |
| initialization	 |	   MAX		 |     number    |      count     | 
|				     |   product	 |	   number    |			      |
| int count = MAX, which is 5 and is greater than or equal to 1, making the 
| statement true. The product is equal to the count (5) times 2 minus 1, which equals 9.
|The number is equal to int number + the product (9), which is 9. We then repeat this 
|same pattern descending from 5 until we reach 0, which would result in a false statement,
|completing the loop. This results in the final number being (9 + 7 + 5 + 3 + 1 = 25).
|Then we print "The result is:" + the number on the output line
|and we get:
|The result is: 25


*/

public class FollowTheLoop {

	   public static final int MAX = 5;
	   public static void loopDeDoop() {
	      int number = 0;
	      for( int count = MAX; count >= 1; count-- ) {
	         int product = count * 2 - 1;
	         number = number + product;
	      }
	      System.out.println("The result is: " + number);
	   }

	   public static void main( String[] args ) {
		   loopDeDoop();
	   }

}
