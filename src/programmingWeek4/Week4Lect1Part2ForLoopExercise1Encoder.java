package programmingWeek4;

import java.util.Scanner;

public class Week4Lect1Part2ForLoopExercise1Encoder {

	public static void main(String[] args) {
		// prompt the user for their name 
		// notes need a scanner  
		// need a variable to store the name 
		
		String name;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter your name : ");
        name = keyboard.nextLine();
      
		// for loop going through the name character by character 
		//
        for(int i=0; i<name.length();i++) {
        	if (name.charAt(i) != ' ') {
        	System.out.print("*");
        	}else {
        		System.out.print(" ");
        	}
        }
	} // comment 

}
