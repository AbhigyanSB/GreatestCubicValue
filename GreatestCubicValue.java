/* This program will display the number, which has
 * the greatest cubic value, under the number, which
 * is provided by the user. */

//Import the Scanner class of Java.
import java.util.Scanner;

//Import the Math class of Java.
import java.lang.Math;

//Class to determine the greatest number having a cubic value less than the user input.
public class GreatestCubicValue {
	
	//Main method.
	public static void main(String[] args) {
		
		//Declare and initialize the number variable to search for the greatest number having a cubic value less than the user input.
		int number = 0;
		
		//Declare and initialize the greatest cubic variable less than the user input.
		double cubicValue = 0;
		
		//Create a Scanner object.
		Scanner input = new Scanner(System.in);
		
		//Ask for the user to enter the number, which the cubic value should not cross.
		System.out.println("Please enter the number, which the cubic value should not cross: ");
		
		//Store the user input.
		int userInput = input.nextInt();
		
		//While loop to check for each cubic value to be less than the user input.
		while (cubicValue < userInput) { 
			
			//Calculate the cubic value for a number.
			cubicValue = Math.pow(number+1, 3);
			
			//Increase the number by 1, each time the loop runs.
			number++;
			
			//Decrease the number value, once the cubic value exceeds the user input.
			if (cubicValue > userInput) { 
				number--;
			}	//If statement.
			
		}	//While loop.
		
		//Display the number, which has the greatest cubic value, under the number that the user has provided.
		System.out.println("The largest integer which cubic value is less than "+ userInput +" is: "+number);
		
		//Close the input.
		input.close();
	
	}	//Main() method.

}	//GreatestCubicValue class.
