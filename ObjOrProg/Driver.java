/***
 * Create an HourlyEmployee class that inherits from Employee and has two new instance variables: 
 * hours, which represents the hours worked, and wage, which represents the employee's pay per hour. 
 * (Both are doubles.) Create a constructor that takes the arguments 
 * first name, last name, social security number, hourly wage, and the number of hours worked. 
 * Also create accessors, mutators, an earnings method that returns the money earned by the employee this week, 
 * and a toString method that returns information about the employee in the form of a String. 
 * The setWage method should ensure that the wage is nonnegative, 
 * and the setHours method should ensure that the value of hours is between 0 and 168 
 * (the number of hours in a week).
 * 
 * Create a Driver class with a main method that prompts the user to enter 
 * a first name, last name, social security number, hours, and wage for an employee. 
 * Then, the program should create an HourlyEmployee object and use its toString 
 * method to print information about it.
***/

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		//declare HourlyEmployee variable
		//and required information for it
		HourlyEmployee emp;
		String firstName;
		String lastName;
		String socialSecurityNumber;
		double hours;
		double wage;
		
		//to be able to get the information
		Scanner input = new Scanner(System.in);
		
		//initialize the information required
		System.out.print("Enter first name:");
		firstName = input.nextLine();
		System.out.print("Enter last name:");
		lastName = input.nextLine();
		System.out.print("Enter social security number:");
		socialSecurityNumber = input.nextLine();
		System.out.print("Enter hours worked:");
		hours = input.nextDouble();
		System.out.print("Enter wage:");
		wage = input.nextDouble();
		
		//initialize the HourlyEmployee variable
		emp = new HourlyEmployee(firstName, lastName,
								 socialSecurityNumber,
								 hours, wage);
		
		//call toString on the variable
		System.out.print(emp.toString());
	}
}

class Employee {
	
	//core info
	private String firstName;
	private	String lastName;
	private String socialSecurityNumber;
	
	//Employee constructor
	public Employee(String firstName, String lastName,
					String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	//getters
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getSocialSecurityNumber() {return socialSecurityNumber;}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n",
							 "employee",
							 this.getFirstName(),
							 this.getLastName(),
							 "social security number",
							 this.getSocialSecurityNumber());
	}
}

class HourlyEmployee extends Employee {
	
	//amount of hour worked and pay per hour
	private double hours;
	private double wage;
	
	//HourlyEmployee constructor
	public HourlyEmployee(String firstName, String lastName,
						  String socialSecurityNumber,
						  double hours, double wage) {
		//to Employee constructor
		super(firstName, lastName, socialSecurityNumber);
		
		//initialize instance variable
		this.hours = hours;
		this.wage = wage;
	}
	
	//getters
	public double getHours() {return this.hours;}
	public double getWage() {return this.wage;}
	
	//setters
	public void setHours(double hours) {
		if (hours > 0 && hours < 168) {
			this.hours = hours;
		}
	}
	public void setWage(double hours) {
		if (wage > 0) {
			this.wage = wage;
		}	
	}
	
	//earnings method
	public double earnings() {
		return this.getHours() * this.getWage();	
	}
	
	//toString method
	@Override
	public String toString() {
		return String.format("%s %s%s: %.1f %n%s: %.2f %n%s: %.2f%n",
							"hourly", super.toString(),
							"hours", this.getHours(),
							"wage", this.getWage(),
							"earnings", this.earnings());
	}
}