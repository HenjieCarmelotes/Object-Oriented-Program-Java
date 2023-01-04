package oop;

/**
 * This program demonstrates snake eyes using OOP.
 * This program crashes when the value set on the dice is not in
 * the legal range.
 * */
public class RollDice {
	
	public static void main(String[] args) {
        
		PairOfDice dice = new PairOfDice();  // Create the PairOfDice object.
        int rollCount;    // Number of times the dice have been rolled.
        rollCount = 0;
        
        /* Roll the dice until they come up snake eyes. */
        
        do {
            dice.roll();
            System.out.println("The dice come up " + dice );
            rollCount++;
        } while (dice.getTotal() != 2);
        
        /* Report the number of rolls. */
        
        System.out.println("\nIt took " + rollCount + " rolls to get a 2.");
        
        /* Now, generate an exception. */
         
        System.out.println();
        System.out.println("This program will now crash with an error");
        System.out.println("when it tries to set the value of a die to 42.");
        System.out.println();
        
        dice.setDie1(10);
        System.out.println(dice);  // This statement will not be executed!
        
     }

}
