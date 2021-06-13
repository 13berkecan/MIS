import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        int boardingSeat = 13; //Represents no seat
        String boardingType = null; //Represents no type
        Scanner input = new Scanner(System.in); 
        String[] boardingTypes = new String[] {"First Class", "Economy Class"};
        boolean[] statusOfSeats = new boolean[10];

        for (int i = 0; i < statusOfSeats.length; i++) {
            statusOfSeats[i] = false;
        }

        //App
        while(true) {
            System.out.print("For First Class ticket enter 1, for Economy Class ticker enter 2: ");
            boardingType = boardingTypes[input.nextInt()-1];

            //If available seat is found seat is assigned else not
            boardingSeat = getSeat(boardingType, statusOfSeats);

            //If no seat available for the type
            
            if (boardingSeat == 13) {
                System.out.printf("No avilable seat for %s, would you like to get a ticket for other class? (Y/N): ", boardingType);
                String answer = input.next();
                //If available seat is found for the other type cont else break
                if (answer.equals("Y")) {
                    boardingSeat = getSeatForOtherType(boardingType, statusOfSeats, boardingTypes);
                    //If no seat available for the other type
                    if (boardingSeat == 13) {
                        System.out.printf("No available seat for %s as well. Next flight leaves in 3 hours.%n", boardingType);
                        break;
                    }
                } else if (answer.equals("N")) {
                    System.out.println("Next flight leaves in 3 hours.");
                    break;
                }
            }
            

            System.out.printf("Boarding %s in seat %d.%n", 
                boardingType, boardingSeat);
        }
    }

    public static int getSeat(String boardingType, boolean[] statusOfSeats) {
        //Returns true if found seat and change seat value else false

        if (boardingType.equals("First Class")) {
            for (int seat = 0; seat < 5; seat++) {
                if (statusOfSeats[seat] == false) {
                    statusOfSeats[seat] = true;
                    return seat+1;
                }
            }
        }

        if (boardingType.equals("Economy Class")) {
            for (int seat = 5; seat < 10; seat++) {
                if (statusOfSeats[seat] == false) {
                    statusOfSeats[seat] = true;
                    return seat+1;
                }
            }
        }

        return 13;
    }

    public static int getSeatForOtherType(String boardingType, boolean[] statusOfSeats, String[] boardingTypes) {
        //Change boarding type
        if (boardingType.equals(boardingTypes[0])) {
            boardingType = boardingTypes[1];
        } else if (boardingType.equals(boardingTypes[1])) {
            boardingType = boardingTypes[0];
        }

        return getSeat(boardingType, statusOfSeats);
    }
}

/*
3-	A small airline has just purchased a computer for its new automated reservations system. 
You’ve been asked to develop the new system. 
You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats). 
Your application should display the following alternatives: Please type 1 for First Class and Please type 2 for Economy. 
If the user types 1, your application should assign a seat in the firstclass section (seats 1–5). 
If the user types 2, your application should assign a seat in the economy section (seats 6–10). 
Your application should then display a boarding pass indicating the person’s seat number 
and whether it’s in the first-class or economy section of the plane. 
Use a one-dimensional array of primitive type boolean to represent the seating chart of the plane. 
Initialize all the elements of the array to false to indicate that all the seats are empty. 
As each seat is assigned, set the corresponding element of the array to true to indicate that the seat is no longer available. 
Your application should never assign a seat that has already been assigned. 
When the economy section is full, your application should ask the person if it’s acceptable to be placed in the first-class section 
(and vice versa). If yes, make the appropriate seat assignment. If no, display the message "Next flight leaves in 3 hours.
*/