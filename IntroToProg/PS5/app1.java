import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the telephone number in the form (XXX) XXX-XXXX: ");
        String numberAsWhole = input.nextLine();

        String[] tokens;
        String areaToken;
        String bodyToken;
        String tailToken;

        tokens = numberAsWhole.split(" |-");
        areaToken = tokens[0].replaceAll("\\(|\\)", "");
        bodyToken = tokens[1];
        tailToken = tokens[2];

        System.out.printf("Area Code:               %s%n", areaToken);
        System.out.printf("First three digits:      %s%n", bodyToken);
        System.out.printf("Last four digits:        %s%n", tailToken);
        System.out.printf("Telephone number:        %s%s%s%n",areaToken,bodyToken,tailToken);
    }
}

/* 
1-	Write an application that inputs a telephone number as a string in the form (555) 555-5555. 
The application should use String method split to extract the area code as a token, 
the first three digits of the phone number as a token and the last four digits of the phone number as a token. 
The seven digits of the phone number should be concatenated into one string. 
Both the area code and the phone number should be printed. 
Remember that you’ll have to change delimiter characters during the tokenization process.
*/