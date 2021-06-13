import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence here: ");
        String sentence = input.nextLine().toUpperCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        int[] letterFrequency = new int[alphabet.length()];

        //String.topUpperCase() fails at i (converts it to İ) somehow??
        for (char letter : sentence.toCharArray()) {
            if (alphabet.indexOf(letter) != -1) {
                letterFrequency[alphabet.indexOf(letter)] += 1;
            }
        }

        for (int i = 0; i < alphabet.length(); i++) {
            System.out.printf("%s: %d%n", alphabet.charAt(i), letterFrequency[i]);
        }
    }
}

/*
5-	Write an application that inputs a line of text and uses String method indexOf to determine the total number of occurrences 
of each letter of the alphabet in the text. Uppercase and lowercase letters should be counted  together. 
Store the totals for each letter in an array, and print the values in tabular format after the totals have been determined.
*/