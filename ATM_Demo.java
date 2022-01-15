import java.util.*;

public class ATM_Demo {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        System.out.print("\nHello! What is your name? ");
        String name = scanner.nextLine();
        
        System.out.println("\nWelcome " + name + " to my ATM!\n\nWhat would you like to do?");

        ATM user1 = new ATM(name);

        while (flag) {

            System.out.println("\nMake a selection:\n1. Make a Deposit\n" + 
            "2. Make a Withdrawal\n3. View Account Details\n4. View Account Balance\n5. End Session\n");
            int selection = scanner.nextInt();

            if (selection == 1) {
                user1.makeDep();
            }
            else if (selection == 2) {
                user1.makeWD();
            }
            else if (selection == 3) {
                user1.getAccDet();
            }
            else if (selection == 4) {
                System.out.println("\nTotal Balance: $" + user1.getTotal());
            }
            else if (selection == 5) {
                System.out.println("\nThank you come again!");
                flag = false;
            }
        }

        scanner.close();
    }
    
}


