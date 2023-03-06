package genericprogramming;

import java.util.Collection;

/**
 * This program shows generic methods to find occurrence of an item in a given array or any collection.
 * */

public class GenericMethod {
	
	/**
	* Returns the number of times that itemToCount occurs in list. Items in the
	* list are tested for equality using itemToCount.equals(), except in the
	* special case where itemToCount is null.
	*/
	public static <T> int countOccurrences(T[] list, T itemToCount) {
		int count = 0;
		if (itemToCount == null) {
			for ( T listItem : list )
				if (listItem == null)
					count++;
			}
		else {
			for ( T listItem : list )
				if (itemToCount.equals(listItem))
					count++;
			}
		
		return count;
		}
	
	/*Since Collection<T> is itself a generic type, 
	 * this method is very general. It can operate on
	 * an ArrayList of Integers, a TreeSet of Strings, a LinkedList of Buttons 
	 * */
	
	public static <T> int countOccurrences(Collection<T> collection, T itemToCount) {
		int count = 0;
		if (itemToCount == null) {
			for ( T item : collection )
				if (item == null)
					count++;
			}
		else {
			for ( T item : collection )
				if (itemToCount.equals(item))
					count++;
			}
		return count;
		}
	
	

} //end class GenericMethod demo
