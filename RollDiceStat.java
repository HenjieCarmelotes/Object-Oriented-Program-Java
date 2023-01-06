package oop;

import java.util.Scanner;

public class RollDiceStat {
	
	static final int NUMBER_OF_EXPERIMENTS = 10000;
	   
	   private static PairOfDice dice = new PairOfDice();
	            // A single pair of dice, which will be used for all
	            // the experiments.
	   			//not declaring it static will produce more dice objects and it will not be fit to static rollFor() function.

	   
	   public static void main(String[] args) {
		   
		   System.out.println("This program simulates the statistics of rolling a pair of dice. " );
		   System.out.println("Given a minimum total value of 2 and more rolled 10,000 times. " );
		   System.out.println("This program provides the statistics of 4 possible logical sums 2-5." );
		   System.out.println("Input a number to find out the stats of other values" );
		   System.out.println();
	   
	       System.out.println("Dice Total   Avg # of Rolls   Stand. Deviation   Max # of Rolls");
	       System.out.println("----------   --------------   ----------------   --------------");

	       for ( int total = 2;  total <= 5;  total++ ) {
	          MinMaxCalculator stats;  // An object that will compute the statistics.
	          stats = new MinMaxCalculator();
	          for ( int i = 0; i < NUMBER_OF_EXPERIMENTS; i++ ) {
	                // Do the experiment of counting the number of rolls
	                // required to roll the desired total, and enter the
	                // number of rolls into stats' dataset.
	             stats.enter( rollFor(total) );
	          }
	          System.out.printf("%6d", total);
	          System.out.printf("%18.3f", stats.getMean());
	          System.out.printf("%19.3f", stats.getStandardDeviation());
	          System.out.printf("%14.3f", stats.getMax());
	          System.out.println();
	       }
	       
	       System.out.println("Enter your number.");
	       System.out.println();
	       int number;
	       MinMaxCalculator stats2 =  new MinMaxCalculator();
	       
	       while (true) {
	    	   Scanner stdin = new Scanner(System.in);
	    	   System.out.print(">>> ");
	    	   number = stdin.nextInt();
	    	   if (number < 2 || number > 12)
		        	System.out.println("Illogically not possible for a pair of dice! Try Again!");
		       else
		    	   break;
	       }
	       
	       
	       System.out.println("Dice Total   Avg # of Rolls   Stand. Deviation   Max # of Rolls");
	       System.out.println("----------   --------------   ----------------   --------------");
	       
	       for ( int i = 0; i < NUMBER_OF_EXPERIMENTS; i++ ) {
               // Do the experiment of counting the number of rolls
               // required to roll the desired total, and enter the
               // number of rolls into stats' dataset.
	    	   stats2.enter( rollFor(number) );
         }
	       
	       System.out.printf("%6d", number);
	       System.out.printf("%18.3f", stats2.getMean());
	       System.out.printf("%19.3f", stats2.getStandardDeviation());
	       System.out.printf("%14.3f", stats2.getMax());
	       System.out.println();
	       
	       
	   } // end main
	   
	   /**
	    * Roll the dice repeatedly until the total on the
	    * two dice comes up to be N.  N MUST be one of the numbers
	    * 2, 3, ..., 12.  (If not, this routine will go into an
	    * infinite loop!).  The number of rolls is returned.
	    */
	   static int rollFor( int N ) {
	       int rollCt = 0;  // Number of rolls made.
	       do {
	          dice.roll(); //roll the same dice object
	          rollCt++;
	       } while ( dice.getTotal() != N );
	       return rollCt;
	   }

	
	

} //end of class RollDiceWithStatistics
