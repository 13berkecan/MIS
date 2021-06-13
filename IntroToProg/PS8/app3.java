import java.util.Scanner;

public class app3 {
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

        int keyIndex = recursiveBinarySearch(arr, key);
        if (keyIndex == -1) {
            System.out.printf("Value %d is not in the array.%n", key);
        } else {
            System.out.printf("Value %d is found at the index %d of the array.%n", key, keyIndex);
        }
    }

    public static int recursiveBinarySearch(int[] arr, int key) {
        return recursiveBinarySearch(arr, key, 0, arr.length-1, -1);
    }

    private static int recursiveBinarySearch(int[] arr, int key, int startIndex, int endIndex, int localation) {
        int midIndex = (startIndex + endIndex + 1)/2;
        if (endIndex < startIndex) { return -1;}
        if (key == arr[midIndex]) {
            return midIndex; 
        } else if (key < arr[midIndex]) {
            return recursiveBinarySearch(arr, key, startIndex, midIndex-1, localation);
        } else {
            return recursiveBinarySearch(arr, key, midIndex+1, endIndex, localation); 
        }
    }
}

/*
Modify binary search example (Fig. 19.3) to use recursive method recursiveBinarySearch to perform a binary search 
of the array. The method should receive the search key, starting index and ending index as arguments. 
If the search key is found, return its index in the array. If the search key is not found, return –1.
*/