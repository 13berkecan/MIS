import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Radius of sphere: ");
        double radius = input.nextDouble();

        System.out.printf("Volume of sphere with %.2f radius is %.2f.%n", radius, sphereVolume(radius));
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

/*
5-Declare method sphereVolume to calculate and return the volume of the sphere. 
Use the following statement to calculate the volume: 

double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

Write a Java application that prompts the user for the double radius of a sphere, 
calls sphereVolume to calculate the volume and displays the result.
*/