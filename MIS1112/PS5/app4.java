import java.util.Random;

public class app4 {
    public static void main(String[] args) {
        int[] sumOfTwoDice = new int[] {2,3,4,5,6,7,8,9,10,11,12};
        int[] frequencyOfSums = new int[11];

        for (int i = 0; i < 36_000_000; i++) {
            int sum = rollTwoDice();
            frequencyOfSums[sum-2]++;
            //Indexed to match sumOfTwoDice
        }

        for (int i = 0; i < frequencyOfSums.length; i++) {
            System.out.printf("%-2d%10d%n", sumOfTwoDice[i], frequencyOfSums[i]);
        } 
    }
    
    public static int rollTwoDice() {
        Random randomInteger = new Random();
        int dice1 = randomInteger.nextInt(6)+1;
        int dice2 = randomInteger.nextInt(6)+1;

        return dice1+dice2;
    }
}

/* 
4-	Write an application to simulate the rolling of two dice. 
The application should use an object of class Random once to roll the first die and again to roll the second die. 
The sum of the two values should then be calculated. 
Each die can show an integer value from 1 to 6, so the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, 
and 2 and 12 the least frequent. Figure 6.21 shows the 36 possible combinations of the two dice. 
Your application should roll the dice 36,000,000 times. 
Use a one-dimensional array to tally the number of times each possible sum appears. 
Display the results in tabular format.
*/