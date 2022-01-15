import java.util.*;
public class ATM {

    String name;
    double total = 0;
    double withdrawal;
    double deposit;

    Scanner scanner = new Scanner(System.in);

    public ATM(String name) {
        this.name = name;
    }

    public void makeDep() {
        System.out.print("\nHow much would you like to deposit? ");
        deposit = scanner.nextDouble();
        total += deposit;
    }

    public void makeWD() {
        System.out.print("\nHow much would you like to withdraw? ");
        withdrawal = scanner.nextDouble();
        total -= withdrawal;
    }

    public double getTotal() {
        return total;
    }
    
    public void getAccDet() {
        System.out.println("\nAccount Details: ");
        System.out.println("Name: " + name + "\nTotal Balance: $" + getTotal());
    }
}


