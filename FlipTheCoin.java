package oop;

/**
 * A program that simulates flipping of a coin 100 times
 * and report how many heads and tails were flipped.
 * */

public class FlipTheCoin {
	
	public static void main(String[] test) {
		
		Counter headCount, tailCount;
		tailCount = new Counter();
		headCount = new Counter();
		for ( int flip = 0;  flip < 100;  flip++ ) {
			
		   if (Math.random() < 0.5)    // There's a 50/50 chance that this is true
			   headCount.increment();   // Count a "head".
		   else
		      tailCount.increment();   // Count a "tail".
		}

		System.out.println("There were " + headCount.getValue() + " heads.");

		System.out.println("There were " + tailCount.getValue() + " tails.");
	} //end of main ()


} //end of FlipTheCoin classs
