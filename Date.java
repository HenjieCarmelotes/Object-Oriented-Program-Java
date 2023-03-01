package genericprogramming;

public class Date implements Comparable<Date> {
	
	int month;  // Month number in range 1 to 12.
	   int day;    // Day number in range 1 to 31.
	   int year;   // Year number.
	   Date(int m, int d, int y) {
	      month = m;
	      day = d;
	      year = y;
	   }
	   
	   //In comparing date, start with the year, if equal, go to the month, if equal, go to the days.
	   public int compareTo( Date otherDate ) {
	           // Returns 1, 0, or -1 if this date is greater than, equal to,
	           // or less than otherDate, respectively.
	      if (year < otherDate.year)
	         return -1;
	      else if (year > otherDate.year)
	         return 1;
	      else { // Years are equal; compare months.
	         if (month < otherDate.month)
	            return -1;
	         else if (month > otherDate.month)
	            return 1;
	         else { // Years and months are equal; compare days.
	            if (day < otherDate.day)
	               return -1;
	            else if (day > otherDate.day)
	               return 1;
	            else 
	               return 0;
	         }
	      }
	   }
	
	

} //end class Date
