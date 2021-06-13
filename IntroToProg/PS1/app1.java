import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of each side of a triangle seperated by space: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        if ( a+b > c && a+c > b && b+c > a) {
            System.out.println("Given triangle is valid");
        } else { 
            System.out.println("Given triangle is not valid");
        }
    }
}

/*
1-	Write an application that reads three nonzero values entered by the user and determines and prints whether 
they could represent the sides of a triangle. 
Check “triangle inequality theorem”: https://images.app.goo.gl/h2FvfEVJHfrYDEsR9 
*/