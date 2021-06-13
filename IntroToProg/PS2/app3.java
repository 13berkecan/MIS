import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many integer to compute from: ");
        int size = input.nextInt();

        System.out.print("Input integers seperated by space: ");
        int[] nums = new int[size];

        for (int seq = 0; seq < size; seq++) {
            nums[seq] = input.nextInt();
        }

        int min = getMinimum(nums);
        int max = getMaximum(nums);
        int sum = max + min;

        System.out.printf("Minimum number is %d.%nMaximum number %d.%nSum of them is %d.", min, max, sum);

    }

    public static int getMinimum (int[] nums) {
        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static int getMaximum (int[] nums) {
        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}

/*
3-	Write an application that finds the minimum and maximum amongst several integers 
and then computes the sum of the two extremes (min. + max.). 
The user will be prompted to input how many values the application should ask the user to input. 
*/