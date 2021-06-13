import java.util.Scanner;

public class GradeAnlysis {
    public static void main(String[] args) {

        int[][] grades = new int[5][2];
        Scanner input = new Scanner(System.in);

        //input grades
        for (int i = 0; i < 5; i++) {
            System.out.printf("For student %d: ", i+1);
            int grade1 = input.nextInt();
            int grade2 = input.nextInt();

            grades[i][0] = grade1;
            grades[i][1] = grade2;
        }

        //average student
        for (int i = 0; i < 5; i++) {
            System.out.printf("Average for student %d: %d%n", i+1, (grades[i][0]+grades[i][1])/2);
        }

        //average midterm
        int midtermTotal = 0;
        for (int i = 0; i < 5; i++) {  
            midtermTotal += grades[i][0];
        }
        System.out.printf("%nAverage for midterm: %d%n", midtermTotal/5 );

        //average final
        int finalTotal = 0;
        for (int i = 0; i < 5; i++) { 
            finalTotal += grades[i][1]; 
        }
        System.out.printf("%nAverage for final: %d%n", finalTotal/5 );
    }
}
