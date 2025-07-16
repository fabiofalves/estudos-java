package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        //Captura do usuário o diretório da pasta
        System.out.print("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        //cria um objeto do tipo File que aponta para a origem do arquivo
        File sourceFile = new File(sourceFileStr);

        //Captura o endereço da pasta de origem
        String sourceFolderStr = sourceFile.getParent();

        //Cria uma subpasta chamada out dentro da pasta de origem.
        //e retorna verdadeiro se foi criado com sucesso.
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        System.out.println("Folder created: " + success);

        //cria o arquivo de destino summary.csv na subpasta out dentro da pasta de origem
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){

            String itemCsv =  br.readLine();//a variável itemCsv recebe cada linha do arquivo

            //Enquanto a linha não for vazia(null)
            while(itemCsv != null){

                String[] fields = itemCsv.split(",");//divide cada valor separado por ","

                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);//Parse converte string para o tipo da variável
                Integer quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for(Product item : list){
                    bw.write(item.toString());
                    bw.newLine();
                }

                System.out.println("Summary file created successfully!");

            } catch(IOException e){
                System.out.print("Error writing file: " + e.getMessage());
            }

        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Parse error: " + e.getMessage());
        }finally {
            sc.close();
        }
    }
}
