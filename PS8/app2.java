import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which two number to find greatest common divisor of: ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.printf("Greates common divisor of %d and %d is %d.", x, y, gcd(x,y));
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return 1 * gcd(y, x % y);
    }
}

/*
2-	The greatest common divisor of integers x and y is the largest
integer that evenly divides into both x and y. Write a recursive method gcd that returns the greatest common divisor of x and y. 
The gcd of x and y is defined recursively as follows: If y is equal to 0, then gcd(x, y) is x; 
otherwise, gcd(x, y) is gcd(y, x % y), where % is the remainder operator.
*/