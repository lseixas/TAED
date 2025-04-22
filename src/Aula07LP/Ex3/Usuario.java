package Aula07LP.Ex3;

import Aula07LP.Ex3.Objects.CondicionadorDeAr;
import Aula07LP.Ex3.Objects.Termostato;

public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr ar = new CondicionadorDeAr();
        ar.ligar();

        // Tentar aumentar para 30 graus (erro esperado)
        for (int i = 0; i < 10; i++) {
            ar.aumentarTemperatura();
        }

        // Tentar reduzir para 10 graus (erro esperado)
        for (int i = 0; i < 20; i++) {
            ar.reduzirTemperatura();
        }

        // Aumentar para 25 graus (válido)
        while (ar.getTermostato().getTemperatura() < 25) {
            ar.aumentarTemperatura();
        }

        // Imprimir a temperatura
        ar.imprimirTemperatura();
    }
}

