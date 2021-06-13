// Fig. 4.12: Anlysis.java
// Analysis of examination results using nested control statements. 
import java.util.Scanner; // class uses class Scanner

public class Anlysis
{
    public static void main(String[] args) 
    {

        // create Scanner to obtain input from command minds. 
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations 
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // process 10 students using counter-ccmtrolled loop 
        while (studentCounter <= 10) 
        {
            // prompt user for input and obtain value from user 
            System.out.print("Enter result (1 = pass. 2 = fail): "); 
            int result = input.nextInt();

            // [MODIFIED] validate input
            if ( result != 1 && result != 2 ) {
                System.out.println("Invalid Entry! Try again.");
                continue;
            }

            // if...else is nested in the while statement 
            if (result == 1)
            passes = passes + 1;
            else
            failures = failures + 1;

            // increment studentCounter so loop eventually terminates 
            studentCounter = studentCounter + 1;
        }
        // termination phase: prepare and display results 
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        // determine whether more than 8 students passed 
        if (passes > 8)
            System.out.println("Bonus to instructor!"); 
    }
} // end class Analysis

