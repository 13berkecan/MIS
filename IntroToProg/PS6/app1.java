import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class app1 {
    public static void main(String[] args) {
        LinkedList<Character> firstList = new LinkedList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j'));
        LinkedList<Character> secondList = new LinkedList<>(firstList);
        Collections.reverse(secondList);

        System.out.println("Original list:");
        for (char letter : firstList) {
            System.out.printf("%s ", letter);
        }
        System.out.println();

        System.out.println("Reversed list: ");
        for (char letter : secondList) {
            System.out.printf("%s ", letter);
        }
    }
}

/*
1-	Write a program that creates a LinkedList object of 10 characters, 
then creates a second LinkedList object containing a copy of the first list, 
but in reverse order. Use Collections methods. 
*/