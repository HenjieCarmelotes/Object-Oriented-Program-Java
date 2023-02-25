package recursionandlinkeddata;

public class RecursionDemo {
	
	public static void main(String[] args) {
		
		printStuff(2);
	
	
		
	}
	
	static void printStuff(int level) {
	    if (level == 0) {
	       System.out.print("*");
	    }
	    else {
	       System.out.print("[");
	       printStuff(level - 1);
	       System.out.print(",");
	       
	       printStuff(level - 1);
	       System.out.print("]");
	       
	      /* Explanation For a printStuff of 2
	       * 1. Since 2 is not 0, print [
	       * 2. Since 1 is not 0, print [
	       * 3. Since 0 is 0, print * .So in the first recursive call the output is [[*
	       * 4. Then the method executes the remaining statement below and print ,
	       * 5. Then the method encounters another recursive call. 
	       * 6. The last actual value of level is 1 (the zero was the result after subtraction), print *
	       * 7. Print the last statement ]
	       * 8. So, the result is [[*,*]
	       * 9. Since the printStuff calls another printStuff which already ended so print ,
	       * 10. The last value of level is 1 so print [
	       * 10. Then the next value is 0 so print * 
	       * 11. The first printStuff ends and print ,
	       * 12. The last value of level is 1, execute the second printStuff and print *
	       * 13. Then end the statement with ]
	       * 14. Since the last statement is part of the call to the subroutine, print it once more. ]
	       * 15. This result to this output: [[*,*],[*,*]]
	       * 
	       * */
	    }
	} //end printStuff()


} //end class RecursionDemo
