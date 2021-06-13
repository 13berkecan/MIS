import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.print("Size of the shape: ");
        int size = input.nextInt();

        getShape(size);
    }

    public static void getShape(int size) {
        //top to mid
        for (int line = 1; line < size; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //mid to bottom
        for (int line = size; line > 0; line--) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* 
1-	Write an application that prints a half of the diamond shape. 
Get the maximum number of stars which will appear in the middle of the shape from the user. 
Output should look similar to:
*
**
***
****
***
**
*

*/