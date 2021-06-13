import java.util.LinkedList;
import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input an array of {1,2,3} as 1 2 3
        System.out.print("Input an array to find minumum value of: ");
        LinkedList<Integer> array =  new LinkedList<>();
        for ( String val : input.nextLine().split(" ")) {
            array.add(Integer.parseInt(val));
        }

        System.out.printf("The minumum value of integer given is %d.", recursiveMinimumDefault(array));
    }

    public static int recursiveMinimumDefault(LinkedList<Integer> array) {
        return recursiveMinimum(array, array.size(), array.getLast());
    }

    private static int recursiveMinimum(LinkedList<Integer> array, int currentIndex, int currentMinimum) {
        if (currentIndex == 0) { return currentMinimum; }
        int lastVal = array.removeLast();
        currentMinimum = (currentMinimum > lastVal) ? lastVal : currentMinimum;
        return recursiveMinimum(array, currentIndex-1, currentMinimum);
    }
}

/*
4-	Write a recursive method recursiveMinimum that determines the smallest element in an array of integers. 
The method should return when it receives an array of one element.
*/