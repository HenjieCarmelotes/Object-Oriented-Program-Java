package arraysGUI;

import java.util.Scanner;

public class InsertSortAlgorithm {
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int [] numbers = new int [100]; //an array for storing the input values for 100 ints.
		int count = 0; //no numbers have been saved yet.
		int num; //one of the inputs from the users.
		
		System.out.println("Enter up to 100 positive integers; enter 0 to end. ");
		
		while (true) { //get the numbers and put them in the array.
			System.out.print("? ");
			num = stdin.nextInt();
			if (num <=0 ) {
				//zero or less marks the end of the input; we have all the numbers so break out.
				break;
			}
			numbers[count] = num; // Put num in position count.
			count++; //count the number.
			
		} //end of while
				
			
				
			System.out.println("\n Your numbers in order are: \n");
				
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] !=0 )
					System.out.printf("%10d%n", numbers[i]);
			} //end of for loop.
				
			System.out.println("What integer do you want to add? ");
			System.out.println();
			
			int num2 = stdin.nextInt();
			
			System.out.println("Result in insert method:");
			
			
			

			insert(numbers,5, num2);
			
			System.out.println("Result in insertionSort:");
			

			insertionSort(numbers);
				
			} //end of main
	
	/*
	* Precondition: itemsInArray is the number of items that are
	* stored in A. These items must be in increasing order
	* (A[0] <= A[1] <= ... <= A[itemsInArray-1]).
	* The array size is at least one greater than itemsInArray.
	* Postcondition: The number of items has increased by one,
	* newItem has been added to the array, and all the items
	* in the array are still in increasing order.
	* Note: To complete the process of inserting an item in the
	* array, the variable that counts the number of items
	* in the array must be incremented, after calling this
	* subroutine.
	*/
	static void insert(int[] A, int itemsInArray, int newItem) {
		int loc = itemsInArray - 1; // Start at the end of the array.
		/* Move items bigger than newItem up one space;
		Stop when a smaller item is encountered or when the
		beginning of the array (loc == 0) is reached. */
		while (loc >= 0 && A[loc] > newItem) {
			A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
			loc = loc - 1; // Go on to next location.
		}
		
		A[loc + 1] = newItem; // Put newItem in last vacated space.
	} //end of insert()
	
	
	
	
	static void insertionSort(int[] A) {
		// Sort the array A into increasing order.
		int itemsSorted; // Number of items that have been sorted so far.
		for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
			// Assume that items A[0], A[1], ... A[itemsSorted-1]
			// have already been sorted. Insert A[itemsSorted]
			// into the sorted part of the list.
			int temp = A[itemsSorted]; // The item to be inserted.
			int loc = itemsSorted - 1; // Start at end of list.
			while (loc >= 0 && A[loc] > temp) {
				A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
				loc = loc - 1; // Go on to next location.
			}
			
			A[loc + 1] = temp; // Put temp in last vacated space.
			}
		} //end of insertionSort

} //end of class InserSortAlgorithm
