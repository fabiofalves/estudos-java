package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> productList = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(response == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            } else if (response == 'u') {
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                sc.nextLine();
                Date manufactureDate = sdf.parse(sc.nextLine());
                productList.add(new UsedProduct(name, price, manufactureDate));
            } else{
                productList.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product product : productList){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
