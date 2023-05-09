package programmingWeek4;

// import the scanner
import java.util.Scanner;


public class ExperimentingWeek4 {

	
	public static void main(String[] args) {
		
		
		yearYouTurn100();
	}

		
		
		// GAP
	
		public static void yearYouTurn100() {
			int currentAge, currentYear, yearTurning100;
	    Scanner scan= new Scanner(System.in);
		System.out.println("Enter the oldest age you will be in this calendar year : ");
       currentAge = scan.nextInt();
       scan.close();
       
       System.out.println("The oldest age you will be in this calendar year is : "+currentAge);
       
		currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		yearTurning100= currentYear+(100-currentAge);
		
		System.out.println("You will turn 100 in : "+yearTurning100);	}
	

} // comment 
