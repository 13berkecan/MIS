import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int[] arr = new int[input.nextInt()]; 
        System.out.print("Input the array values seperated by space: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        while (true) {
            boolean swapped = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { break; }
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("Sorted array is: ");
        for (int num : arr) { System.out.printf("%d ", num); }
        System.out.println();
    }
}

/*Implement bubble sort—another simple yet inefficient sorting technique. 
It’s called bubble sort or sinking sort because smaller values gradually “bubble” their way 
to the top of the array (i.e., toward the first element) like air bubbles rising in water, 
while the larger values sink to the bottom (end) of the array. 
The technique uses nested loops to make several passes through the array. 
Each pass compares successive pairs of elements. 
If a pair is in increasing order (or the values are equal), 
the bubble sort leaves the values as they are. If a pair is in decreasing order, 
the bubble sort swaps their values in the array. 
The first pass compares the first two elements of the array and swaps their values if necessary. 
It then compares the second and third elements in the array. 
The end of this pass compares the last two elements in the array and swaps them if necessary. 
After one pass, the largest element will be in the last index
*/