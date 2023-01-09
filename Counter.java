package oop;

/**
 * An object of this class represents a counter that counts up from zero.
 */

public class Counter {
	
	private int value = 0;  // Current value of the counter.

	   /**
	    * Add one to the value of the counter.
	    */
	public void increment() {  
	    value++;
	   }

	   /**
	    * Returns the current value of the counter.
	    */
	public int getValue() {    
	    return value;
	   }

} //end of class Counter
