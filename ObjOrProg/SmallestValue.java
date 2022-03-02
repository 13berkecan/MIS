/***
 * (Find the Smallest Value) Write an application that finds the smallest of several integers. 
 * Write a program which first asks the user to enter the number of values to enter, 
 * then asks for each value, and finally prints out the lowest value of those entered.
***/

import java.util.Scanner;

public class SmallestValue {
	public static void main(String[] args) {
		//to be able to take inputs
		Scanner input = new Scanner(System.in);
		
		//to get the number of inputs
		System.out.print("Enter the number of integers you are going to enter:");
		int numOfInt = input.nextInt();
		
		//to be able to store the numbers
		int[] numbers = new int[numOfInt];
		
		//to get the numbers and store them						
		for (int index = 1; index <= numOfInt; index++) {
			System.out.printf("Enter the %d of %d number:", index, numOfInt);
			numbers[index-1] = input.nextInt();
		}
		
		//to find lowest one of the numbers
		int lowest = numbers[0]; /*temporarily assign first value to lowest*/
		for (int number : numbers) {
			if (number < lowest) {
				lowest = number;
			}
		}
		
		//to print out the lowest number
		System.out.printf("The lowest number is %d%n", lowest);
	}
}