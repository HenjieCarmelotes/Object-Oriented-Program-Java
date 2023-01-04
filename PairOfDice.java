package oop;

public class PairOfDice {
	
	private int die1; // Number showing on the first die.
	private int die2; // Number showing on the second die.
	
	public PairOfDice() {
		// Constructor. Rolls the dice, so that they initially
		// show some random values.
		roll(); // Call the roll() method to roll the dice.
	}
	public PairOfDice(int val1, int val2) {
		// Constructor. Creates a pair of dice that
		// are initially showing the values val1 and val2.
		die1 = val1; // Assign specified values
		die2 = val2; // to the instance variables.
	}
	public void roll() {
		// Roll the dice by setting each of the dice to be
		// a random number between 1 and 6.
		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) + 1;
	}
	
	public int getDie1() {
		return die1;
	}
	
	/**
     	* Set the value of the first die.  Throws an IllegalArgumentException
     	* if the value is not in the range 1 to 6.
     	*/
    	public void setDie1( int value ) {
       		if ( value < 1 || value > 6 )
          		throw new IllegalArgumentException("Illegal dice value " + value);
       	die1 = value;
    	}
    
	
    	public int getDie2() {
		return die2;
		}
	
   	 /**
   	 * Set the value of the second die.  Throws an IllegalArgumentException
    	 * if the value is not in the range 1 to 6.
    	 */
	
    	public void setDie2( int value ) {
       		if ( value < 1 || value > 6 )
          		throw new IllegalArgumentException("Illegal dice value " + value);
       		die2 = value;
    	}
    
    
    	/**
     	* Return the total showing on the two dice.
     	*/ 
    	public int getTotal() {
       		return die1 + die2;
    	}
	
	
	
     	/**
      	* Return a String representation of a pair of dice, where die1
     	* and die2 are instance variables containing the numbers that are
      	* showing on the two dice.
      	*/
	public String toString() {
		if (die1 == die2)
			return "double " + die1;
		else
			return die1 + " and " + die2;
	}

}
