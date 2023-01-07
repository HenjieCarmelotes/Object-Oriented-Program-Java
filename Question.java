package oop;

public class Question {
	
	private int a, b; // The numbers in the problem.

	
	public Question() { // constructor
		a = (int)(Math.random() * 50 + 1);
		b = (int)(Math.random() * 50);
	}
	
	/*For the Addition Questions. */
	public String askTheSum() {
		return "What is " + a + " + " + b + " ?";
	}
	
	
	public int getSum() {
		return a + b;
	}
	
	
	/*For the Subtraction Questions. This accepts negative answer */
	public String askTheDiff() {
		return "What is " + a + " - " + b + " ?";
	}
	
	/*Accepts negative answer. */
	public int getDifference() {
		return a - b;
	}
	
	
	/*For the Multiplication Questions. */
	public String askTheProd() {
		return "What is " + a + " * " + b + " ?";
	}
	
	public int getProduct() {
		return a * b;
	}

	
	

} //end of Question class
