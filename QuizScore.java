package oop;

import java.util.Date;
import java.util.Random;

public class QuizScore {
	
	public static void main(String[] args) {
		
		System.out.println("The average science test scores of the following students on " + new Date());
		
		Student student1 = new Student("Tearn");
		student1.test1 = 94.0;
		student1.test2 = 89.3;
		student1.test3 = 99.1;
		
		Student student2 = new Student("Pam");
		student2.test1 = 81.0;
		student2.test2 = 85.3;
		student2.test3 = 94.1;
		
		Random randGen = new Random();
		
		System.out.println(student1.getName() + " with ID# "+ student1.getID() + " got " + student1.getAverage());
		System.out.println(student2.getName() + " with ID# "+ student2.getID() + " got " + student2.getAverage());
		System.out.println(randGen.nextInt(100) + " is the favourite number of this class.");
	} //end of main
	

} //end of QuizScore class
