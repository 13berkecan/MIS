import java.util.ArrayList;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the five-letter word: ");
        String word = input.next();
        char[] letters = word.toCharArray();
        ArrayList<String> pairs = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < word.length(); k++) {
                    //To prevent repetition on same index char
                    if ( i != j && j != k && k != i) {
                        String pair = new String(new char[] {letters[i], letters[j], letters[k]});
                        //Check if already found
                        if (!pairs.contains(pair)) {
                            pairs.add(pair);
                        }
                    }
                }
            }
        }
        
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }
}

/* 
2-	Write an application that reads a five-letter word from the user and produces every possible three-letter string 
that can be derived from the letters of that word. 
For example, the three-letter words produced from the word “bathe” include “ate,” “bat,” “bet,” “tab,” “hat,” “the” and “tea.”
*/


