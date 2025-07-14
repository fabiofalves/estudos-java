package application;

import model.entities.Account;
import model.exceptions.withdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter account data:");

        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withDrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withDrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();
        try{
            account.withdraw(amount);
            System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
        } catch(withdrawException e){
            System.out.print("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
