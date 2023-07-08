package programmingWeek4;

public class MethodsWithReturns {
	
	public static void main(String[] args) {

		int bigNum; 
		
		//first output
		bigNum = biggestNumber(3, 4);
	    System.out.println(bigNum);
		
	    // second output
		System.out.println(biggestNumber(2002, 900));
		// third output
		System.out.println(biggestNumber(15, 900));
	} // end of main method

	
	// we can create functions outside of the main method
	
/**
 * this is going to return the biggest number 
 * @param num1
 * @param num2
 * @return the biggest number
 */
	public static int biggestNumber(int num1, int num2) {
		int biggestNum = num1; 
		
		if (num1>num2) {biggestNum = num1;}
		else { biggestNum = num2;}
		return biggestNum;	
	} // end of method biggestNumber
} // end of class
 
