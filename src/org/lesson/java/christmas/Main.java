package org.lesson.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> gifts = new ArrayList<>();

        do {
            System.out.println("Inserisci un regalo: ");
            String giftInput = scanner.nextLine();
            gifts.add(giftInput);
            System.out.println("Oggetti nella lista: " + gifts.size() + "\n");
            System.out.println("Vuoi inserire un nuovo regalo?? 1 si, 2 no");
            if (scanner.nextInt()== 2){
                break;
            }
            scanner.nextLine();
        }while(true);
    }
}
