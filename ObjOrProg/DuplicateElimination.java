/***
 * Write an application that inputs five numbers, each between 10 and 100, inclusive. 
 * As each number is read, display it only if it’s not a duplicate of a number already read. 
 * Provide for the “worst case,” in which all five numbers are different. 
 * Use the smallest possible array to solve this problem. 
 * Display the complete set of unique values input after the user enters each new value.
***/

import java.util.Scanner;

public class DuplicateElimination {
	public static void main(String[] args) {
		//to be able to take input
		Scanner input = new Scanner(System.in);
		
		//the number of inputs to take
		int numOfInputs = 5;
		
		//the array to store unique values from the input
		int[] uniqueValues = new int[numOfInputs];
		//to keep track of the unique numbers
		int uniqValCount = 0;
		
		//outer loop to get the data
		for (int count = 0; count < numOfInputs; count++) {
			//to get the input
			System.out.print("Enter an integer between 10 and 100:");
			//to save the input temporarily
			int currVal = input.nextInt();
			
			//inner loop to check duplicate
			//every entry to be assumed true until proven not via the loop
			boolean isUnique = true;
			for (int value : uniqueValues) {
				if (currVal == value) {
					isUnique = false;
				}
			}
			
			//output for the input
			if (isUnique) {
				System.out.printf("This is the first time %d has been entered%n", currVal);
				//add the unique number to the array
				uniqueValues[uniqValCount] = currVal;
				//up the count
				uniqValCount++;
			}
		}
		
		//output the result
		System.out.println("The complete set of unique values entered is:");
		//bunch more stuff to output etc etc
		for (int index = 0, count = 1; index < numOfInputs; index++, count++) {
			if (uniqueValues[index] != 0) {
				System.out.printf("Unique Value %d: is %d%n", count, uniqueValues[index]);
			}
		}
	}
}