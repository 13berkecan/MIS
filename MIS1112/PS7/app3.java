import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string to reverse it: ");
        String str = input.nextLine();

        System.out.printf("String '%s' reversed is '%s'.", str, stringReverseDefault(str.toCharArray()));
    }

    public static String stringReverseDefault(char[] chars) {
        return new String(stringReverse(chars, chars.length-1));
    }

    private static char[] stringReverse(char[] chars, int currentIndex) {
        if (currentIndex > chars.length/2) {
            char temp = chars[chars.length-1-currentIndex];
            chars[chars.length-1-currentIndex] = chars[currentIndex];
            chars[currentIndex] = temp;
            return stringReverse(chars, currentIndex-1);
        } else {
            return chars;
        }
    } 
}

/*
3-	Write a recursive method stringReverse that takes a character
array containing a string as an argument and prints the string backward. [Hint: Use String method
toCharArray, which takes no arguments, to get a char array containing the characters in the String.]
*/