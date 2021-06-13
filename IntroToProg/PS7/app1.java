import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input base and exponent value to calculate: ");
        int base = input.nextInt();
        int exponent = input.nextInt();

        System.out.printf("%d to the power of %d is %d.", base, exponent, power(base, exponent));
    }

    public static long power(int base, int exponent) {
        System.out.printf("%d, %d%n", base, exponent);
        if (exponent == 1) { return base; }
        return base * power(base, exponent-1);
    }
}

/*
1-	Write a recursive method power(base, exponent) that, when
called, returns
base exponent
For example, power(3,4) = 3 * 3 * 3 * 3. Assume that exponent is an integer greater than or equal
to 1. Hint: The recursion step should use the relationship
base exponent = base · base exponent – 1 
and the terminating condition occurs when exponent is equal to 1, because
base1 = base
Incorporate this method into a program that enables the user to enter the base and exponent. 
*/