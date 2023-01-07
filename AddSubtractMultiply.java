package oop;

/**
 * This program performs simple arithmetic (add, subtract, and multiply) 
 * between 2 operands with 10 questions. The class is dependent on Question class. 
 * Every time the user inputs the answer, the computer will check and tell
 * the player whether the answer is correct or not. At the end of the 
 * game the computer will display the score that the user received.
 * */

import java.util.Scanner;

public class AddSubtractMultiply {
	
	static Scanner stdin = new Scanner(System.in);
	
	private static double random; //use to randomized the type of questions.
	
    private static Question[] questions;  // The questions for the quiz

    private static int[] userAnswers;   // The user's answers to the ten questions.
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to this basic arithmetic quiz! Each question is worth 10 points. ");
        System.out.println();
        createQuiz(); //Create the quiz first
        administerAndGradeQuiz(); //administer and grade the quiz
        
    }//end of main()
    
    
    /**
     * Creates the array of objects that holds 10 pairs of numbers.
     */
    private static void createQuiz() {
        questions = new Question[10];
        for ( int i = 0; i < questions.length; i++ ) {
            questions[i] = new Question();
        }
    } //end of createQuiz()
    
    /**
     * Asks the user each of the ten quiz questions and gets the user's answers.
     * The answers are stored in an array, which is created in this subroutine.
     */
    private static void administerAndGradeQuiz() {
        userAnswers = new int[10];
        int numberCorrect = 0;
        for (int i = 0; i < userAnswers.length; i++) {
            int questionNum = i + 1;
            random = Math.random();
            if (random <= 0.2) {
            	 System.out.printf("Question %2d:  %s ",
                         questionNum, questions[i].askTheSum());
            	 
            	}
            else if (random <= 0.5) {
            	System.out.printf("Question %2d:  %s ",
                        questionNum, questions[i].askTheDiff());
            	
            }
            else
            	System.out.printf("Question %2d:  %s ",
                        questionNum, questions[i].askTheProd());
            

            userAnswers[i] = stdin.nextInt();
            
            
            /* Check and give the answer */
            
           if (random <= 0.2) {
        	   if ( userAnswers[i] == questions[i].getSum() ) {
                   System.out.println("You are CORRECT.");
                   System.out.println();
                   numberCorrect++;
               }
               else {
                   System.out.println("You said " + userAnswers[i] + ", which is INCORRECT.");
                   System.out.println();
               }
           	}
           else if (random <= 0.5) {
        	   if ( userAnswers[i] == questions[i].getDifference() ) {
                   System.out.println("You are CORRECT.");
                   System.out.println();
                   numberCorrect++;
               }
               else {
                   System.out.println("You said " + userAnswers[i] + ", which is INCORRECT.");
                   System.out.println();
               }
           }
           else
           	   if ( userAnswers[i] == questions[i].getProduct() ) {
                   System.out.println("You are CORRECT.");
                   System.out.println();
                   numberCorrect++;
               }
               else {
                   System.out.println("You said " + userAnswers[i] + ", which is INCORRECT.");
                   System.out.println();
               }
        }
        
        int grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        if (grade <= 50 )
        	System.out.println("Your math skills is terrible! Practice more! ");
        else if (grade > 50 && grade < 80)
        	System.out.println("Your math skill is great! ");
        else
        	System.out.println("You are genius! Keep up this excellent work! ");
        System.out.println();
        
    } //end of administerQuiz()
    
    

} //end of class AddSubtractMultiply
