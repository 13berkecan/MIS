import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class app5 {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>(Arrays.asList("I","like", "watching", "series"));
        ArrayList<String> secondList = new ArrayList<>(Arrays.asList("I", "watch", "TV", "series"));

        System.out.println("First List: ");
        for (String word : firstList) {
            System.out.printf("%s ", word);
        }
        System.out.println();

        System.out.println("Second List: ");
        for (String word : secondList) {
            System.out.printf("%s ", word);
        }
        System.out.println();

        boolean disjoint = Collections.disjoint(firstList, secondList);
        if (disjoint) {
            System.out.println("Lists do not have elements in common."); 
        } else {
            System.out.println("Lists have elements in common.");
        }

        firstList.addAll(secondList);
        secondList = null;

        System.out.println("Lists concatenated: ");
        for (String word : firstList) {
            System.out.printf("%s ", word);
        }
    }
}

/*
5-	Create two ArrayLists of 4 string elements each and concatenate these two lists using Collections methods 
and examine whether they have elements in common. 
*/