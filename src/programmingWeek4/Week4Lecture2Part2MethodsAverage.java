package programmingWeek4;


public class Week4Lecture2Part2MethodsAverage {

	public static void main(String[] args) {
		System.out.println("Start");
		avg(1,2,3,4);
		System.out.println("End");
	}  // end of main method
	
	/**
	 * This method calculates the average of our 4 ints
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public static void avg (int a,int b,int c,int d) {
		System.out.println("Calc. avg");
		int sum = a+b+c+d;
                               // have to write 4.0 so that the answer doesn't revert back to an int		
		double avg = sum/4.0;
		System.out.println("The average is : "+avg);
	} // end of avg function

} // end of class
