package Aula03LP1;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma data, começando pelo dia, mês e ano");

        int d = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());

        System.out.print("A data digitada foi: " + d + "/" + m + "/" + y);

    }
}
