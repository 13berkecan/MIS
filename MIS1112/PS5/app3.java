import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer code of a char: ");
        int value = input.nextInt();

        System.out.printf("Integer code of char %d represents '%s'.%n", value, (char) value);
    }
}

/*
3-	Write an application that inputs an integer code for a character and displays the corresponding character. 
Modify this application so that it generates all possible three-digit codes in the range from 000 to 255 
and attempts to print the corresponding characters. 
*/