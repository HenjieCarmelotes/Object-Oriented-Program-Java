package genericprogramming;

import java.util.Map;
import java.util.TreeMap;

public class TestDate {
	
	static TreeMap<Date,String> syllabus;
	
	public static void main(String[] args) {
		
		
		
		//A solution using a submap (harder, but more efficient):

		      Date startDate = new Date(12,1,2018); // Starting date for submap.
		      Date endDate = new Date(1,1,2019);    // Ending date for submap.
		                                            // (Remember that the end date
		                                            // is not included.)
		      Map<Date,String> decemberData = syllabus.subMap(startDate, endDate);
		      for ( Map.Entry<Date,String> entry : decemberData.entrySet() ) {
		         Date date = entry.getKey();
		         String info = entry.getValue();
		         System.out.println("December " + date.day + ": " + info);
		      }
		
		
		
	} //end main()

} //end class TestDate
