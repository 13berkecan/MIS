import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int[] arr = new int[input.nextInt()]; 
        System.out.print("Input the array values seperated by space: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        quickSortHelper(arr);
        printArray(arr);
    }

    public static void quickSortHelper(int[] arr) {
        quickSort(arr, 0, arr.length-1);     
    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, pivotIndex-1);
            quickSort(arr, pivotIndex+1, endIndex);
        }
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int swapIndex = endIndex;
        int pivot = arr[startIndex];

        for (int i = endIndex; i > startIndex; i--) {
            if (arr[i] > pivot) {
                swap(arr, i, swapIndex);
                swapIndex--;
            }
        }
        swap(arr, startIndex, swapIndex);
        return swapIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        System.out.print("Sorted array is: ");
        for (int num : arr) { System.out.printf("%d ", num); }
        System.out.println();
    }
}

/*
The recursive sorting technique called quicksort uses the following 
basic algorithm for a one-dimensional array of values: 
a) Partitioning Step: Take the first element of the unsorted array and determine its final location 
in the sorted array (i.e., all values to the left of the element in the array are less
than the element, and all values to the right of the element in the array are greater than
the element—we show how to do this below). We now have one element in its proper
location and two unsorted subarrays.
b) Recursive Step: Perform Step 1 on each unsorted subarray. Each time Step 1 is performed
on a subarray, another element is placed in its final location of the sorted array, and two
unsorted subarrays are created. When a subarray consists of one element, that element
is in its final location (because a one-element array is already sorted).
Write recursive method quickSortHelper to sort a one-dimensional integer array. 
The method should receive as arguments a starting index and an ending index on the original array being sorted. 
*/