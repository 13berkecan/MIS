import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Input the tempeture with the type seperated by space: ");
        double temperature = inputs.nextInt();
        String temperatureType = inputs.next();

        if (temperatureType.toLowerCase().equals("fahrenheit")) {
            System.out.printf("%.2f Celsius%n", getCelsius(temperature));
        } else if (temperatureType.toLowerCase().equals("celsius")) {
            System.out.printf("%.2f Fahrenheit%n", getFahrenheit(temperature));
        } else {
            System.out.println("Invalid!");
        }
    }

    public static double getCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double getFahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}

/*
3-	Implement the following integer methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, 
using the calculation celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, 
using the calculation fahrenheit = 9.0 / 5.0 * celsius + 32;
c) Use the methods from parts (a) and (b) to write an application that enables the 
user either to enter a Fahrenheit temperature and display 
the Celsius equivalent or to enter a Celsius temperature and display the Fahrenheit equivalent.
*/