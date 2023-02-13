package handlingexceptions;

import java.util.Scanner;

/**   
 * This program will compute and print one of the solutions
 * to an equation of the form A*X*X + B*X + C = 0, where
 * A, B, and C are numbers entered by the user.  It depends
 * on the non-standard class TextIO for doing input.
 */

public class RootCalculator {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	      
	      double A, B, C;   // Coefficients in the equation.
	      double solution;  // The solution computed for the equation.
	      String goAgain;  // Set to true if the user wants to
	                        //   solve another equation.
	                        
	      System.out.println("This program will print a solution of an equation");
	      System.out.println("of the form A*X*X + B*X + C = 0, where A, B, and");
	      System.out.println("C are values that you enter.");
	      
	      do {
	         
	         /* Get the coefficients from the user. */

	         System.out.println();
	         System.out.println("Enter values for A, B, and C:");
	         System.out.print("A = ");
	         A = in.nextDouble();
	         System.out.print("B = ");
	         B = in.nextDouble();
	         System.out.print("C = ");
	         C = in.nextDouble();
	         System.out.println();
	         
	         /* Print the solution, or an error message, if
	            there is no solution. */

	         try {
	            solution = root(A,B,C);
	            System.out.println("A solution of the equation is " + solution);  
	         }
	         catch (IllegalArgumentException e) {
	            System.out.println("Sorry, I can't find a solution.");
	            System.out.println(e.getMessage());
	         }
	          
	         /* Find out whether the user wants to go again. */

	         System.out.println();
	         System.out.print("Do you want to solve another equation? ");
	         goAgain = in.next();

	      } while (goAgain != "no" || goAgain !="n" );
	   
	   } // end main
	   
	 
	   /**
	    * Returns the larger of the two roots of the quadratic equation
	    * A*x*x + B*x + C = 0, provided it has any roots.  If A == 0 or
	    * if the discriminant, B*B - 4*A*C, is negative, then an exception
	    * of type IllegalArgumentException is thrown.
	    */
	   static public double root( double A, double B, double C ) 
	                                 throws IllegalArgumentException {
	       if (A == 0) {
	         throw new IllegalArgumentException("A can't be zero.");
	       }
	       else {
	          double disc = B*B - 4*A*C;
	          if (disc < 0)
	             throw new IllegalArgumentException("Discriminant < zero.");
	          return  (-B + Math.sqrt(disc)) / (2*A);
	       }
	   }   

	

} //end class RootCalculator
