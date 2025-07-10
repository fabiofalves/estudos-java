package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            sc.nextLine();
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if(response == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else if(response == 'c') {
                System.out.print("Number of employees:  ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            } else {
                System.out.println("Invalid option!");
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double totalTax = 0.0;
        for(TaxPayer taxPayer : list){
            totalTax += taxPayer.tax();
            System.out.println(taxPayer.toString());
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", totalTax);

        sc.close();

    }
}
