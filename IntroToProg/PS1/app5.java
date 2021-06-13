import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter the balance at the beginning of the month: ");
        int currentBalance = input.nextInt();
        System.out.print("Enter total of all items charged by the customer this month: ");
        int totalCharges = input.nextInt();
        System.out.print("Enter total of all credits applied to the customer’s account this month: ");
        int totalCreditApplied = input.nextInt();
        System.out.print("Enter allowed credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = currentBalance + totalCharges - totalCreditApplied;

        System.out.printf("Current balance: %d%n", newBalance);

        // if credit limit is 1000, your balance can not go below -1000
        if (newBalance < -creditLimit) {
            System.out.printf("Credit limit exceeded for account %d", accountNumber);
        }
    }
}

/* 
5-	Develop a Java application that determines whether any of several department-store customers 
has exceeded the credit limit on a charge account. For each customer, the following facts are available: 
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits), 
display the new balance and determine whether the new balance exceeds the customer’s credit limit. 
For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
*/