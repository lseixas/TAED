package Aula03;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em kg e sua altura em m: ");

        double peso = Double.parseDouble(scanner.next());
        double altura = Double.parseDouble(scanner.next());

        System.out.println("Seus dados digitados foram: " + peso + "kg e " + altura + "m");

    }

}
