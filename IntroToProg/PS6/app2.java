import java.util.Arrays;
import java.util.LinkedList;

public class app2 {
    public static void main(String[] args) {
        LinkedList<Integer> firstList = new LinkedList<>(Arrays.asList(0,1,2,3,4));
        LinkedList<Integer> secondList = new LinkedList<>(Arrays.asList(5,6,7,8,9));

        System.out.println("First List: ");
        for (int num : firstList) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        System.out.println("Second List: ");
        for (int num : secondList) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        concatenateLinkedList(firstList, secondList);

        System.out.println("Concantenated List: ");
        for (int num : firstList) {
            System.out.printf("%d ", num);
        }
    }

    private static void concatenateLinkedList(LinkedList firstList, LinkedList secondList) {
        firstList.addAll(secondList);
        secondList = null;
    }
}

/*
2-	Write a program that creates two LinkedList object and a method to concatenate these two lists. 
Call this method in the main method and print out each element of the concatenated list. Use LinkedList methods. 
*/