package oop;

public class Roll2Pairs {
	
	public static void main(String[] args) {
	
		PairOfDice firstDice; // Refers to the first pair of dice.
		
		firstDice = new PairOfDice();
		
		PairOfDice secondDice; // Refers to the second pair of dice.
		
		secondDice = new PairOfDice();
		
		int countRolls; // Counts how many times the two pairs of
						// dice have been rolled.
		
		int firsDiceTotal;
		
		int secondDiceTotal;
		
		
		countRolls = 0;
		
		do { // Roll the two pairs of dice until totals are the same.
			
			firstDice.roll(); // Roll the first pair of dice.
			firsDiceTotal = firstDice.getTotal(); // Get total.
			firstDice.toString();
			System.out.println("First pair comes up " + firstDice);
			
			secondDice.roll(); // Roll the second pair of dice.
			secondDice.toString();
			secondDiceTotal = secondDice.getTotal(); // Get total.
			System.out.println("Second pair comes up " + secondDice);
			
			
			countRolls++; // Count this roll.
			
			System.out.println(); // Blank line.
			
		} while ( firsDiceTotal != secondDiceTotal);
		
		
			System.out.println("It took " + countRolls
					+ " rolls until the totals of 2 dice were the same.");
	} //end of main


}
