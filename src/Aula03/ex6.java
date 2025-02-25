package Aula03;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 letras para formar uma palavra:");

        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);
        char c3 = scanner.next().charAt(0);
        char c4 = scanner.next().charAt(0);
        char c5 = scanner.next().charAt(0);
        char c6 = scanner.next().charAt(0);
        char c7 = scanner.next().charAt(0);
        char c8 = scanner.next().charAt(0);
        char c9 = scanner.next().charAt(0);
        char c10 = scanner.next().charAt(0);

        String total = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;

        System.out.println("Palávra digitada: " + total);

    }

}
