package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> employeeList = new ArrayList<>();

            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.valueOf(fields[2])));
                line = br.readLine();
            }

            List<String> employeEmail = employeeList.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            System.out.println("Email of people whose salary is more than 2000.00:");
            employeEmail.forEach(System.out::println);

            Double sum = employeeList.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
