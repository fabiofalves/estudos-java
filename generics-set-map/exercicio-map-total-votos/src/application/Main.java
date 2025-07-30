package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> voteRegister = new HashMap<>();
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String file = br.readLine();
            while (file != null){
                String[] fields = file.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if(voteRegister.containsKey(name)){
                    int voteSoFar = voteRegister.get(name);
                    voteRegister.put(name, votes + voteSoFar);
                }
                else{
                    voteRegister.put(name, votes);
                }

                file = br.readLine();
            }

            for (String key : voteRegister.keySet()){
                System.out.println(key + ": " + voteRegister.get(key));
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
