public class app1 {
    public static void main(String[] args) {
        for (int number = 0; number < 10000; number++) {
            if (isPrime(number)) {
                System.out.printf("%d ", number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i=2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

/* 
1-	A positive integer is prime if it’s divisible by only 1 and itself. 
For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. 
The number 1, by definition, is not prime. Write a method that determines whether a number is prime. 
Use this method in an application that determines and displays all the prime numbers less than 10,000. 
*/