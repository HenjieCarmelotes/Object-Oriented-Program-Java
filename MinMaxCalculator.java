package oop;

public class MinMaxCalculator extends StatisticsCalculator {
	
	private double max = Double.NEGATIVE_INFINITY;  // Largest item possible.
	   private double min = Double.POSITIVE_INFINITY;  // Smallest item possible.

	   public void enter(double num) {
	      super.enter(num);  // Call the enter method from the StatCalc class.
	      if (num > max)  // Then do the extra processing for min and max.
	         max = num;
	      if (num < min)
	         min = num;
	   }
	 
	   public double getMin() {
	      return min;
	   }
	   
	   public double getMax() {
	      return max;
	   }
	

}
