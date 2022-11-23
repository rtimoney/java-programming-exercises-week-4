/**
 * 
 */
	
package programmingWeek4;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Ronan J Timoney
 *
 */
public class MethodsIntro {

	/**
	 * the main method
	 * the start point for this program
	 * @param args
	 */
	public static void main(String[] args) {

		// Methods introduction

		System.out.println("In main start");
		
		invokeMe();
		for(int i=0;i<10;i++){ 
		writeNameToScreen();}
		
		dateAndTime();
		yearTurn100();
		
		
		
	//	for (int loop =0; loop<+10; loop++) {
	//	writeNameToScreen();
	//	}
		
		System.out.println("In main end");
		
	} // end of main method

	
	/**
	 * This method prints a message to screen.
	 */
	
	
	// visibility - access - return type - method name -  
	public static void invokeMe ()  {
		System.out.println("You invoked me !");
	} // end of invokeMe method
	
	
	/**
	 * This method prints name to screen
	 */
	public static void writeNameToScreen () {
	
		System.out.println("Ronan");
		
		
	//	for (int loop =0; loop<+10; loop++) {
	//	System.out.println("Ronan");
	//	}
	} // end of writeNameToScreen
	
	
	public static void dateAndTime () {

	
	
	       //getting current date and time using Date class
	       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	       Date dateobj = new Date();
	       System.out.println(df.format(dateobj));

	       /*getting current date time using calendar class 
	        * An Alternative of above*/
	       Calendar calobj = Calendar.getInstance();
	       System.out.println(df.format(calobj.getTime()));
	    }
	
	/**
	 * Create a method to calculate and return the year when I will turn 100
	 */
	public static void yearTurn100() {
		int currentAge, currentYear, yearTurning100;
		currentAge=28;
		currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		yearTurning100= currentYear+currentAge;
		
		System.out.println(yearTurning100);	
	}// end of method
	

} // end of the class
