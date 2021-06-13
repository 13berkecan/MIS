import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class app4 {
    public static void main(String[] args) {
        String[] words = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        Collections.sort(list);

        int threeIndex = Collections.binarySearch(list, "Three");
        int fiveIndex = Collections.binarySearch(list, "Five");

        System.out.printf("Index of word Three: %d%n", threeIndex);
        System.out.printf("Index of word Five: %d%n", fiveIndex);
    }
}

/*
4-	Create an ArrayList consists of 10 string elements and use binarySearch to find the location of 3. and 5. elements. 
*/