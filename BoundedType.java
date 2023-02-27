package genericprogramming;

import java.util.ArrayList;

import javafx.scene.control.Control;

/*
 * The restriction “extends Control” on T makes it illegal to create the parameterized types
BoundedType<String> and BoundedType<Integer>, since the actual type parameter that replaces
“T” is required to be either Control itself or a subclass of Control.
 * */

public class BoundedType <T extends Control> {
	
	private ArrayList<T> components; // For storing the components in this group.
	
	public void disableAll( ) {
		for ( Control c : components )
			if (c != null)
				c.setDisable(true);
	}
	
	public void enableAll( ) {
		for ( Control c : components )
			if (c != null)
				c.setDisable(false);
	}
	
	public void add( T c ) { // Add a value c, of type T, to the group.
		components.add(c);
	} 
	
	
	
}
