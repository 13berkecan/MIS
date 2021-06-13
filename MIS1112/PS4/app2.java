import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the integer: ");
            int number = input.nextInt();

            if (isDivisible(number)) {
                System.out.printf("%d is divisible by 5.%n", number);
            } else {
                System.out.printf("%d is not divisible by 5.%n", number);
            }
        }
    }

    public static boolean isDivisible(int number) {
        return (number % 5 == 0 && number != 0) ? true : false;
    }
}

/*
2-	Write a method isDivisible that uses the remainder operator (%) to determine whether ten input integers are divisible by 5 or not. 
The method should take an integer argument and return true if the integer is divisible by 5 and false otherwise. Incorporate this 
method into an application that inputs a sequence of integers (one at a time) and determines the result.
*/