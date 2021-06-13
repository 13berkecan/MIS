import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalCharges = 0;
        
        while(true) {
            System.out.print("Enter length of parking (a negative integer to quit): ");
            int hours = input.nextInt();
            if (hours <= 0) {break;}

            double charge = calculateCharges(hours);
            System.out.printf("Cost of parking %d hours is %.2f%n", hours, charge);
            
            totalCharges += charge;
        }

        System.out.printf("Total charges for the day is %.2f", totalCharges);
    }

    public static double calculateCharges(double hours) {
        if (hours <= 3) {
            return 2.00;
        } else if (hours < (10-2)*2+3) {
            return 2.00 + 0.50*Math.ceil(hours-3);
        } else {
            return 10.00;
        }
    }
}

/* 
2-	A parking garage charges a $2.00 minimum fee to park for up to three hours. 
The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours. 
The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for longer than 24 hours at a time. 
Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday. 
You should enter the hours parked for each customer. The program should display the charge for the current customer 
and should calculate and display the running total of yesterday’s receipts. 
It should use the method calculateCharges to determine the charge for each customer.
*/