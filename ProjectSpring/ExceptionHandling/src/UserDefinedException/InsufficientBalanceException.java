package UserDefinedException;

import java.util.Scanner;

public class InsufficientBalanceException extends Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int balance = 10000;
            System.out.println("Enter amount to be withdrawn");
            int amount = s.nextInt();
            if (amount <= balance) {
                System.out.println("Amount withdrawn successfully");
            } else {
                try {
                    throw new InsufficientBalanceException();
                } catch (InsufficientBalanceException e) {
                    System.out.println("You have enough balance to withdrawn");
                }
            }
        }
    }
}
