package genericprogramming;

import java.util.ArrayList;

public class Stack <T> {
	
	ArrayList<T> stack = new ArrayList<T>();
	
	   public void push( T newItem ) {
	      stack.add(newItem);
	   }  
	   public T pop() {
	      int top = stack.size() - 1;  // location of top item
	      return stack.remove(top);    // remove and return top item
	   }
	   public boolean isEmpty() {
	      return stack.size() == 0;
	   }

} //end class Stack
