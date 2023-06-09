package org.lesson.java.christmas;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> gifts = new ArrayList<>();

        File fileGiftsPath = new File("gifts-file.txt");

        Scanner reader = new Scanner(fileGiftsPath);

        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            gifts.add(data);
            System.out.println(gifts);
        }

        reader.close();

        do {
            System.out.println("Inserisci un regalo: ");
            String giftInput = scanner.nextLine();
            gifts.add(giftInput);
            System.out.println("Oggetti nella lista: " + gifts.size() + "\n");
            System.out.println("Vuoi inserire un nuovo regalo?? 1 si, 2 no");
            if (scanner.nextInt()== 2){
                FileWriter myWriter = new FileWriter(fileGiftsPath);
                myWriter.write(String.valueOf(gifts));
                myWriter.close();
                break;
            }
            scanner.nextLine();
        }while(true);
    }
}
