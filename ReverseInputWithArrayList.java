package arraysGUI;

import java.util.ArrayList;
import java.util.Scanner;
/**
* Reads a list of non-zero numbers from the user, then prints
* out the input numbers in the reverse of the order in which
* the were entered. There is no limit on the number of inputs.
*/

public class ReverseInputWithArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list;
		list = new ArrayList<Integer>();
			
		Scanner stdin = new Scanner(System.in);
			
			
		System.out.println("Enter some non-zero integers; enter 0 to end. ");
			
		while (true) { //get the numbers and put them in the array.
			System.out.print("? ");
			int num = stdin.nextInt();
			if (num <=0 ) {
				//zero or less marks the end of the input; we have all the numbers so break out.
				break;
			}
			
			list.add(num);
				
			} //end of while
			
		stdin.close();
			
		System.out.println("\n Your numbers in reverse order are: \n");
			
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.printf("%10d%n", list.get(i));
		} //end of for loop.
			
			
		} //end of main
	
	
	

}
