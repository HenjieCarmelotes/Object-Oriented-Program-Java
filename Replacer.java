package genericprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Replacer {
	
	//Note: replaceAll method is already defined as a static method in class Collections
	
	public static <T> void replaceAll(ArrayList<T> list, T oldItem, T newItem) {
		   if (oldItem == null) {
		      for (int i = 0; i < list.size(); i++) {
		         if ( null == list.get(i) )
		            list.set( i, newItem );
		      }
		   }
		   else {
		      for (int i = 0; i < list.size(); i++) {
		         if ( oldItem.equals(list.get(i)) )
		            list.set( i, newItem );
		      }
		   }
		}


		public static <T> void replaceAll(List<T> list, T oldItem, T newItem) {
		   ListIterator<T> iter = list.listIterator();
		   while (iter.hasNext()) {
		      T listItem = iter.next();
		      if ( oldItem == null ) {
		         if ( listItem == null )
		            iter.set(newItem);
		      }
		      else {
		         if ( oldItem.equals(listItem) )
		            iter.set(newItem);
		      }
		   }
		}


}
