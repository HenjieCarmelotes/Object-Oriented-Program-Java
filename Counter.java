package genericprogramming;

import java.util.Collection;
import java.util.function.Predicate;

public class Counter {
	
	//implements countif in 2 implementation: For loop and Stream API
	
	//*** For Loop implementation for countIF.
	public static <T> int countIf( Collection<T> items, Predicate<T> pred )  {
	    int count = 0;
	    for ( T x : items ) {
	        if ( pred.test(x) )
	            count++;
	    }
	    return count;
	}
	
	//*** Stream API Implementation of countIf
	
	
	public static <T> int countIfs( Collection<T> items, Predicate<T> pred ) {
	    long ct = items.parallelStream()
	                   .filter(pred)
	                   .count();
	         // .count() returns a long, but I want countIf to return an int
	    return (int)ct; 
	}
	
	
	
	
	

} //end class Counter
