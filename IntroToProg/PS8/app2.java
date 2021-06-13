import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int[] arr = new int[input.nextInt()]; 
        System.out.print("Input the array values seperated by space: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Input the wanted value: ");
        int key = input.nextInt();
        
        int keyIndex = recursiveLinearSearch(arr, key);
        if (keyIndex == -1) {
            System.out.printf("Value %d is not in the array.%n", key);
        } else {
            System.out.printf("Value %d is found at the index %d of the array.%n", key, keyIndex);
        }
    }

    public static int recursiveLinearSearch(int[] arr, int key) {
        return recursiveLinearSearch(arr, key, 0);
    }

    private static int recursiveLinearSearch(int[] arr, int key, int startIndex) {
        if (startIndex == arr.length) { return -1; }
        if (arr[startIndex] == key) { return startIndex; }
        return recursiveLinearSearch(arr, key, startIndex+1);
    }
}

/*
Modify linear seach example (Fig. 19.2) to use recursive method recursiveLinearSearch to perform 
a linear search of the array. The method should receive the search key and starting index as arguments. 
If the search key is found, return its index in the array; otherwise, return –1. 
Each call to the recursive method should check one index in the array.
*/