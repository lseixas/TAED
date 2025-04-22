package Aula07LP.Ex3;

public class Objects {

    public static class Termostato {
        private int temperatura;

        public Termostato() {
            this.temperatura = 20;
        }

        public int getTemperatura() {
            return temperatura;
        }

        public void setTemperatura(int temperatura) {
            if (temperatura >= 15 && temperatura <= 28) {
                this.temperatura = temperatura;
            } else {
                System.out.println("Erro: Temperatura fora dos limites permitidos (15 a 28 graus).");
            }
        }
    }

    public static class CondicionadorDeAr {
        private Termostato termostato;
        private boolean ligado;

        public CondicionadorDeAr() {
            this.termostato = new Termostato();
            this.ligado = false;
        }

        public boolean isLigado() {
            return ligado;
        }

        public Termostato getTermostato() {
            return termostato;
        }

        public void ligar() {
            ligado = true;
        }

        public void desligar() {
            ligado = false;
        }

        public void aumentarTemperatura() {
            if (ligado) {
                int atual = termostato.getTemperatura();
                if (atual < 28) {
                    termostato.setTemperatura(atual + 1);
                } else {
                    System.out.println("Erro: Temperatura máxima (28 graus) já atingida.");
                }
            } else {
                System.out.println("Erro: O condicionador de ar está desligado.");
            }
        }

        public void reduzirTemperatura() {
            if (ligado) {
                int atual = termostato.getTemperatura();
                if (atual > 15) {
                    termostato.setTemperatura(atual - 1);
                } else {
                    System.out.println("Erro: Temperatura mínima (15 graus) já atingida.");
                }
            } else {
                System.out.println("Erro: O condicionador de ar está desligado.");
            }
        }

        public void imprimirTemperatura() {
            if (ligado) {
                System.out.println("Temperatura atual: " + termostato.getTemperatura() + "°C");
            } else {
                System.out.println("Erro: O condicionador de ar está desligado.");
            }
        }
    }


}
