/***
 * Implement the Shape hierarchy -- create an abstract class called Shape, 
 * which will be the parent class to TwoDimensionalShape and ThreeDimensionalShape. 
 * The classes Circle, Square, and Triangle should inherit from TwoDimensionalShape, 
 * while Sphere, Cube, and Tetrahedron should inherit from ThreeDimensionalShape.
 * 
 * Each TwoDimensionalShape should have the methods getArea() and getPerimeter(), 
 * which calculate the area and perimeter of the shape, respectively. 
 * Every ThreeDimensionalShape should have the methods getArea() and getVolume(), 
 * which respectively calculate the surface area and volume of the shape. 
 * Every class should have a member variable containing its dimensions -- for example, 
 * the Circle class should have a member variable describing its radius, 
 * while the Triangle class should have three member variables describing the length of each side. 
 * Note that the Tetrahedron cass should describe a regular tetrahedron, and as such, 
 * should only have one member variable.
 * 
 * Create a Driver class with a main method to test your Shape hierarchy. 
 * The program should prompt the user to enter the type of shape they'd like to create, 
 * and then the shape's dimensions. If the shape is two dimensional, 
 * the program should print its area and its perimeter, and if it's a three dimensional shape, 
 * its surface area and volume.
***/

import java.util.Scanner;

public class Driver2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter");
		
		System.out.printf("%s%n%s:",
						  "1)Two dimensional shape",
						  "2)Three dimensional shape");
		
		int dimensionChoice = input.nextInt();
		
		System.out.println("Enter");
		
		String twoDimensionalShapeOptions = 
			String.format("%s%n%s%n%s",
						  "1)Circle",
						  "2)Square",
						  "3)Triangle");
		
		String threeDimensionalShapeOptions = 
			String.format("%s%n%s%n%s",
						  "1)Sphere",
						  "2)Cube",
						  "3)Tetrahedron");
		
		System.out.printf("%s:",
						  dimensionChoice == 1 ? 
						  twoDimensionalShapeOptions :
						  threeDimensionalShapeOptions);
		
		int shapeChoice = input.nextInt();
		
		
		int choice = (dimensionChoice-1)*3+shapeChoice;
		String choiceName = "";
		
		switch(choice) {
			case 1:
				choiceName = "circle";
				break;
			case 2:
				choiceName = "square";
				break;
			case 3:
				choiceName = "triangle";
				break;
			case 4:
				choiceName = "sphere";
				break;
			case 5:
				choiceName = "cube";
				break;
			case 6:
				choiceName = "tetrahedron";
				break;
		}
		
		String choiceParameterName = (choice == 1 || choice == 4) ?
								   "radius" : "side";
		
		double parameter = 0;
		double[] parameters = new double[3];
		
		if (!choiceName.equals("triangle")) {
			System.out.printf("Enter %s of %s:",
							  choiceParameterName,
							  choiceName);
			parameter = input.nextDouble();
		} else {
			for (int i = 0; i < 3; i++) {
				System.out.printf("Enter %s of %s:",
								  choiceParameterName,
								  choiceName);
				double param = input.nextDouble();
				parameters[i] = param;
			}
		}
	
		String out;
		if (dimensionChoice == 1) {
			double area;
			double perimeter;
			if (choice == 1) {
				Circle c = new Circle(parameter);
				area = c.getArea();
				perimeter = c.getPerimeter();
			} else if (choice == 2) {
				Square s = new Square(parameter);
				area = s.getArea();
				perimeter = s.getPerimeter();
			} else {
				Triangle t = new Triangle(parameters[0],
										  parameters[1],
										  parameters[2]);
				area = t.getArea();
				perimeter = t.getPerimeter();
			}
			out = String.format("%s: %.2f %n%s: %.2f%n",
								"Area", area,
								"Perimeter", perimeter);
		} else {
			double surfaceArea;
			double volume;
			if (choice == 4) {
				Sphere sp = new Sphere(parameter);
				surfaceArea = sp.getArea();
				volume = sp.getVolume();
			} else if (choice == 5) {
				Cube cu = new Cube(parameter);
				surfaceArea = cu.getArea();
				volume = cu.getVolume();
			} else {
				Tetrahedron te = new Tetrahedron(parameter);
				surfaceArea = te.getArea();
				volume = te.getVolume();
			}
			out = String.format("%s: %.2f %n%s: %.2f%n",
								"Surface area", surfaceArea,
								"Volume", volume);
		}
		
		System.out.print(out);
	}
}

abstract class Shape {
	@Override
	public String toString() {
		return String.format("Shape");
	}
}

abstract class TwoDimensionalShape extends Shape {
	public abstract double getArea();
	public abstract double getPerimeter();
	
	@Override
	public String toString() {
		return String.format("Two Dimensional %s", super.toString());
	}
}

abstract class ThreeDimensionalShape extends Shape {
	public abstract double getArea();
	public abstract double getVolume();
	
	@Override
	public String toString() {
		return String.format("Three Dimensional %s", super.toString());
	}
}

class Circle extends TwoDimensionalShape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.radius,2);
	}
	
	@Override
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
	@Override
	public String toString() {
		return String.format("%s Circle with radius %.2f", 
							 super.toString(), this.radius);
	}
}

class Square extends TwoDimensionalShape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return Math.pow(this.side, 2);
	}
	
	@Override
	public double getPerimeter() {
		return this.side*4;	
	}
	
	@Override
	public String toString() {
		return String.format("%s Square with side %.2f",
							 super.toString(), this.side);
	}
}

class Triangle extends TwoDimensionalShape {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	@Override
	public double getArea() {
		double m = (sideA+sideB+sideC)/2;
		return Math.sqrt(m*(m-this.sideA)*(m-this.sideB)*(m-this.sideC));
	}
	
	@Override
	public double getPerimeter() {
		return this.sideA+this.sideB+this.sideC;
	}
	
	@Override
	public String toString() {
		return String.format("%s Triangle with sides %.2f,%.2f,%.2f",
							 super.toString(), this.sideA,
							 this.sideB, this.sideC);
	}
}

class Sphere extends ThreeDimensionalShape {
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return 4*Math.PI*Math.pow(this.radius, 2);
	}
	
	@Override
	public double getVolume() {
		return 4.0/3.0*Math.PI*Math.pow(this.radius, 3);
	}
	
	@Override
	public String toString() {
		return String.format("%s Sphere with radius %.2f",
							 super.toString(), this.radius);
	}
}

class Cube extends ThreeDimensionalShape {
	private double side;
	
	public Cube(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return 6*Math.pow(this.side, 2);
	}
	
	@Override
	public double getVolume() {
		return Math.pow(this.side, 3);
	}
	
	@Override
	public String toString() {
		return String.format("%s Cube with side %.2f",
							 super.toString(), this.side);
	}
}

class Tetrahedron extends ThreeDimensionalShape {
	private double side;
	
	public Tetrahedron(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return Math.sqrt(3)*Math.pow(this.side, 2);
	}
	
	@Override
	public double getVolume() {
		return Math.pow(this.side, 3)/Math.sqrt(2)/6;
	}
	
	@Override
	public String toString() {
		return String.format("%s Tetrahedron with side %.2f",
							 super.toString(), this.side);
	}
}