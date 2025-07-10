package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter de number of employees: ");
        int n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.printf("Employee #%d data:%n", i);
            System.out.print("Outsourced? (y/n): ");

            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("valuePerHour: ");
            double valuePerHour = sc.nextDouble();

            if(response == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employeeList.add(new OutsourcedEmployee(hours, name, valuePerHour, additionalCharge));
            }
            else{
                employeeList.add(new Employee(hours, name, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee e : employeeList){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }
}
