package genericprogramming;

import java.util.Collection;
import java.util.LinkedList;

/**
 * This generic class can do the queue efficiently for any type of object.
 * */

public class Queue <T> {
	
	private LinkedList<T> items = new LinkedList<>();
	
	public void enqueue(T item) {
		items.addLast(item);
	}
	
	public T dequeue() {
		return items.removeFirst();
	}
	
	public boolean isEmpty() {
		return (items.size() == 0);
	}
	
	//We are combining wildcard types with generic classes.
	//The restriction on the wildcard type makes everything work nicely.
	
	public void addAll(Collection<? extends T> collection) {
		// Add all the items from the collection to the end of the queue
		for ( T item : collection )
		enqueue(item);
	}
	
	
	//This wildcard means, roughly, “either T itself or any class that is a superclass of T.”
	//Collection<? super Rect> would match the types Collection<Shape>, ArrayList<Object>,
	//and Set<Rect>
	
	public void addAllTo(Collection<? super T> collection) {
		// Remove all items currently on the queue and add them to collection
		while ( ! isEmpty() ) {
			T item = dequeue(); // Remove an item from the queue.
			collection.add( item ); // Add it to the collection.
		}
	}
	

}//end class GenericQueue