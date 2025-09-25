package se.jensen.elias.bibliotek;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Biblioteket");
            System.out.println("Välj vad du vill göra:");
            System.out.println("[1] Lägg till bok");
            System.out.println("[2] Ta bort bok");
            System.out.println("[3] Sök bok");
            System.out.println("[4] Avsluta program");
            String val = scanner.nextLine();
            switch (val) {
                case "1":
                    System.out.println("Lägg Till bok:");
                    System.out.println("Namn: ");
                    String name = scanner.nextLine();
                    System.out.println("ISBN: ");
                    String isbn = scanner.nextLine();
                    Book book1 = new Book(name, isbn);
                    System.out.println(book1);
                case "2":
                    System.out.println("Ta bort bok");
                case "3":
                    System.out.println("Sök bok");
                case "4":
                    return;
            }
        }
    }
}
