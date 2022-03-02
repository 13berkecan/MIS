/***
 * (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine 
 * whether an integer is even. The method should take an integer argument and return true 
 * if the integer is even and false otherwise. Incorporate this method into an application 
 * that inputs a sequence of integers (one at a time) and determines whether each is even or odd.
***/

import java.util.Scanner;

class EvenOrOdd {
	public static void main(String[] args) {
		//to be able to take input
		Scanner input = new Scanner(System.in);
		
		while (true) {
			//for input
			System.out.print("Enter a number:");
			int currVal = input.nextInt();
			
			//for output
			System.out.printf("%d is %s %n", currVal, isEven(currVal) ? "even" : "odd");
			
			//for repetition
			System.out.print("Enter y to play again, n to quit(y/n):");
			if (input.next().equals("n")) { break; }
			//this is a weird necessity 
			System.out.print("?");
		}
		
		//a very weird necessity
		System.out.println("?");
	}
	
	//the method
	public static boolean isEven(int val) {
		return val % 2 == 0;
	}
}