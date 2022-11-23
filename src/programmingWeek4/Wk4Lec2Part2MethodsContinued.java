package programmingWeek4;

import java.util.Calendar;
import java.util.Scanner;

public class Wk4Lec2Part2MethodsContinued {

	
	
		public static void main(String[] args) {

		
			
			// Methods introduction

			System.out.println("In main start");
		
			yearTurn100(10);
			yearTurn100(55);
		    yearTurn100(22);
		    
		    
		    String myName;
		    int printCount;
		    
			Scanner sc = new Scanner(System.in);
			System.out.println(" ");
			System.out.println("START");
			System.out.println("What is your name: ");
			myName = sc.nextLine();
			
			System.out.println("How many times do you want to print?");
			printCount = sc.nextInt();
			
			
			
			
			printMyName1(printCount,myName);
		    sc.close();
		    
		}// main method ends
			
		
		/**
		 * Method to print the year when the user will turn 100
		 * @param currentAge - the user's current age  
		 */
		public static void yearTurn100(int currentAge) {
			int currentYear, yearTurning100;
			currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
			yearTurning100= currentYear+(100-currentAge);
			
			System.out.println(yearTurning100);	
		}// end of method
		
		/**]
		 * method to print my name n times
		 * @param reps  number of times name will be printed
		 */
		public static void printMyName1 (int reps, String name) {
			for (int i=0; i<reps; i++) {
				System.out.println(name);
			}
		}

	} // end of the class

