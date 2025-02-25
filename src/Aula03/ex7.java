package Aula03;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 4 digitos um a um: ");

        char i1 = scanner.next().charAt(0);
        char i2 = scanner.next().charAt(0);
        char i3 = scanner.next().charAt(0);
        char i4 = scanner.next().charAt(0);

        String total = "" + i1 + i2 + i3 + i4;

        System.out.println("Número digitado: ");

        System.out.println(total);

    }
}
