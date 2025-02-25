package Aula03;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 palavras: ");

        String palavra1 = scanner.next();
        String palavra2 = scanner.next();
        String palavra3 = scanner.next();

        System.out.println("Palavras Digitadas: ");

        String string_palavra = palavra1 + " " + palavra2 + " " + palavra3;

        System.out.println(string_palavra);

        scanner.close();

    }
}
