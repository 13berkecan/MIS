import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;

public class app2 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        LinkedList<Integer> randomIntegers = new LinkedList<>();

        for (int i = 0; i < 25; i++) {
            randomIntegers.addLast(random.nextInt(101));
        }

        System.out.println("Unsorted Array: ");
        printArray(randomIntegers);

        Collections.sort(randomIntegers);
        System.out.println("Sorted Array: ");
        printArray(randomIntegers);

        int sumArr = 0;
        for (int num : randomIntegers) { sumArr += num; }
        System.out.printf("Sum of the elements: %d%n", sumArr);

        float avrArr = sumArr/25;
        System.out.printf("Average of the array: %.2f%n", avrArr);
    }

    public static void printArray(LinkedList<Integer> list) {
        
        for (int num : list) {
            System.out.printf("%d ", num);
        }
        System.out.println();

    }
}

/*
Write a program that inserts 25 random integers from 0 to 100 in order into a LinkedList object. 
The program should sort the elements, then calculate the sum of the elements and 
the floating-point average of the elements. 
*/