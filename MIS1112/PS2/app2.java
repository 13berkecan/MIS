import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        String[] grades = new String[5];

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for (int seq = 0; seq < 5; seq++) {
            System.out.print("Enter name and grade seperated by space: ");
            names[seq] = input.next();
            grades[seq] = input.next();
        }

        for (String grade : grades) {
            switch (grade) {
                case "A":
                    aCount++;
                    break;
                case "B":
                    bCount++;
                    break;
                case "C":
                    cCount++;
                    break;
                case "D":
                    dCount++;
                    break;
            }
        }

        System.out.printf("Number of students each grade has:%n%s%d%n%s%d%n%s%d%n%s%d%n",
            "A: ", aCount, 
            "B: ", bCount, 
            "C: ", cCount, 
            "D: ", dCount);

    }
}

/* 
2-	A group of five students earned the following grades: 
Student 1, ‘A’; student 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. 
Write an application that reads a series of pairs of numbers as follows:
a) student name
b) student letter grade
Your program should use a switch statement to determine how many students got a grade of ‘A’,
how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. 
Use a loop as needed to input the five student grades, and then finally display the results.
*/