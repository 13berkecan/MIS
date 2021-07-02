import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer to get factorial of it: ");
        int number = input.nextInt();
        System.out.printf("Factorial of %d is %d.%n", number, factorial(number));
    }

    public static long factorial(int number) {
        return factorial(number, 1, 0, number);  
    }

    public static long factorial(int number, int curTotal, int step, int factNum) {
        System.out.printf("%"+(step*5+2)+"d"+ (number <= 1 ? "  " : " *") +
                          "%"+((factNum-step)*5)+"s", number, "");
        curTotal *= number;
        if (number <= 1) {
            System.out.printf("%d! = %d%n", factNum, curTotal);
            return 1;
        } else {
            System.out.println(curTotal);
            return number * factorial(number-1, curTotal, step+1, factNum);
        }
    }
}

/* 
It’s interesting to watch recursion “in action.” Modify the factorial method in Fig. 18.3 
to print its local variable and recursive-call parameter. For each recursive call, 
display the outputs on a separate line and add a level of indentation. 
Do your utmost to make the outputs clear, interesting and meaningful. 
Your goal here is to design and implement an output format that makes it easier to understand recursion. 
You may want to add such display capabilities to other recursion examples and exercises throughout the text. 
*/