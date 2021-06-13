import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Radius of circle: ");
        double radius = input.nextDouble();

        circleArea(radius);
    }

    public static void circleArea(double radius) {
        double area = Math.PI*Math.pow(radius, 2);
        System.out.printf("Area of circle with %.2f radius is %.2f%n", radius, area);
    }
}

/*
1-	Write an application that prompts the user for the radius of a circle 
and uses a method called circleArea to calculate the area of the circle. 
*/