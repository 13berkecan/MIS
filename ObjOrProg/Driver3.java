/***
 * Define the class InvalidSideException, which inherits from the Exception class. 
 * Also define a Square class, which has one method variable -- an int describing the side length. 
 * The constructor of the Square class should take one argument, an int meant to initialize the side length; 
 * however, if the argument is not greater than 0, the constructor should throw an InvalidSideError. 
 * The Square class should also have a method getArea(), which returns the area of the square.
 * 
 * Create a Driver class with a main method to test your classes. 
 * Your program should prompt the user to enter a value for the side length, 
 * and then create a Square object with that side length. If the side length is valid, 
 * the program should print the area of the square. Otherwise, it should catch the 
 * InvalidExceptionError, print "Side length must be greater than 0.", and terminate the program.
***/

import java.util.Scanner;

public class Driver3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter side length of square:");
		int side = input.nextInt();
		
		try {
			Square sq = new Square(side);
			System.out.println(sq.getArea());
		} catch (InvalidSideException e) {
			System.out.println(e.getMessage());	
		}
	}
}

class InvalidSideException extends Exception {
	public InvalidSideException(String msg) {
		super(msg);	
	}
}

class Square {
	private int side;

	public Square(int side) throws InvalidSideException{
		if (side <= 0) {
			throw new InvalidSideException("Side length must be greater than 0.");
		} else {
			this.side = side;
		}
				
	}
	
	public int getArea() {
		return this.side*this.side;
	}
}