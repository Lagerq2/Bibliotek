package se.jensen.elias.bibliotek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> bocker = new ArrayList<>();
        while (true) {
            System.out.println("Biblioteket");
            System.out.println("Välj vad du vill göra:");
            System.out.println("[1] Lägg till bok");
            System.out.println("[2] Ta bort bok");
            System.out.println("[3] Skriv ut böcker");
            System.out.println("[4] Avsluta program");
            String val = scanner.nextLine();
            switch (val) {
                case "1":
                    Book bok = new Book();
                    System.out.println("Lägg Till bok:");
                    System.out.println("Namn: ");
                    String name = scanner.nextLine();
                    System.out.println("ISBN: ");
                    String isbn = scanner.nextLine();
                    bok.setTitle(name);
                    bok.setIsbn(isbn);
                    bocker.add(bok);
                    break;

                case "2":
                    int i = 1;
                    for (Book b : bocker) {
                        System.out.println("Tryck [" + i + "] För att ta bort: " + b);
                        i++;
                    }
                    int raderaVal = scanner.nextInt();
                    raderaVal--;
                    bocker.remove(raderaVal);
                    break;
                case "3":
                    for (Book b : bocker) {
                        System.out.println(b);
                    }
                    break;
                case "4":
                    return;
            }
        }
    }
}
