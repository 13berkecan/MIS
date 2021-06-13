import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class app3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "Love", "Coding", "Also", "MIS"));

        list.add("Adding");
        list.add("Three");
        list.add("Words");

        printReversedList(list);
    }

    private static void printReversedList (ArrayList<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.println("Reversed List: ");
        while(iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }
}

/*
3-	Create an ArrayList consists of 5 string elements. Add 3 new elements to this list by using List methods. 
Use an Iterator method to print elements in reversed order. 
*/