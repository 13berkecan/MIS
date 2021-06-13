import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Which fibonacci number: ");
        int number = input.nextInt();
        int fibonacciNumber = getNthFibonacci(number);

        System.out.printf("%dth fibonacci number is %d", number, fibonacciNumber);
        //To get maximum fibonacci number Java integer can have, input above 45
    }
    
    public static int getNthFibonacci(int nth) {
        int count, main, next, temp;
        main = 0;
        next = 1;
        
        if (nth == 1) {return 0;};
        if (nth == 2) {return 1;};
 
        for (count = 2; count <= nth; count++) {
            temp = main + next;
            main = next;
            next = temp;

            if (temp < 0) {
                return main;
            }
        }
        return main;
    }
}

/* 
5-	The Fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, … begins with the terms 0 and 1 and 
has the property that each succeeding term is the sum of the two preceding terms. 
Write a method fibonacci(n) that calculates the nth Fibonacci number. 
Incorporate this method into an application that enables the user to enter the value of n.  
Determine the largest Fibonacci number that can be displayed on your system.
*/