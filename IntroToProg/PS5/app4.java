import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the strings to be compared seperated by space: ");
        String[] words = input.nextLine().split(" ");
        
        String baseWord = words[0];
        String compareWord = words[1];

        System.out.print("Enter the values of starting index and length of comparison seperated by space: ");
        int startIndex = input.nextInt();
        int lengthOfComparison = input.nextInt();

        if (baseWord.regionMatches(true, startIndex, compareWord, startIndex, lengthOfComparison)) {
            System.out.println("Compared strings are equal.");
        } else {
            System.out.println("Compared strings are not equal.");
        }
    }
}

/*
4-	Write an application that uses String method regionMatches to compare two strings input by the user. 
The application should input the number of characters to be compared and the starting index of the comparison. 
The application should state whether the strings are equal. Ignore the case of the characters when performing the comparison. 
*/