package arraysGUI;

import java.util.Scanner;

public class BasicSearchingAlgo {
	
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
				
			System.out.println("Which integer do you want to search? ");
			System.out.println();
			
			int num2 = stdin.nextInt();
			
			System.out.println("Result in linear search:");
			
	
			System.out.println(find(numbers, num2));
			
			System.out.println("Result in Binary search:");
			
	
			System.out.print(binarySearch(numbers, num2));
				
			} //end of main


	/**
	 * Searches the array A for the integer N. If N is not in the array,
	 * then -1 is returned. If N is in the array, then the return value is
	 * the first integer i that satisfies A[i] == N.
	 * 
	 * This method is called linear search -> looking at each item.
	 */
	static int find(int[] A, int N) {
		for (int index = 0; index < A.length; index++) {
			if ( A[index] == N )
				return index; // N has been found at this index!
			}
		// If we get this far, then N has not been found
		// anywhere in the array. Return a value of -1.
		return -1;
	} //end of find.


	/**
	* Searches the array A for the integer N.
	* Precondition: A must be sorted into increasing order.
	* Postcondition: If N is in the array, then the return value, i,
	* satisfies A[i] == N. If N is not in the array, then the
	* return value is -1.
	* 
	* Implements Binary search -> Only applicable if the array can be sorted in some way.
	*/
	static int binarySearch(int[] A, int N) {
		int lowestPossibleLoc = 0;
		int highestPossibleLoc = A.length - 1;
		
		while (highestPossibleLoc >= lowestPossibleLoc) {
			
			int middle = (lowestPossibleLoc + highestPossibleLoc) / 2;
			
			if (A[middle] == N) {
				// N has been found at this index!
				return middle;
			}
			else if (A[middle] > N) {
				// eliminate locations >= middle
				highestPossibleLoc = middle - 1;
				
			}
			else {
				// eliminate locations <= middle
				lowestPossibleLoc = middle + 1;
				
			}
		}
			// At this point, highestPossibleLoc < LowestPossibleLoc,
			// which means that N is known to be not in the array. Return
			// a -1 to indicate that N could not be found in the array.
			return -1;
	}

} //end of class BasicSearchingAlgorithm
