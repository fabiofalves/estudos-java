package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.valueOf(fields[1])));
                line = br.readLine();
            }

            double media = list.stream().
                    map(Product::getPrice).
                    reduce(0.0, Double::sum) / list.size();

            System.out.println("Average price: " + String.format("%.2f", media));

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < media)
                    .map(Product::getName)
                    .sorted(comparator.reversed())
                    .toList();

            names.forEach(System.out::println);

        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }
}
