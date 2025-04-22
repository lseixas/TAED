package Aula07LP.Ex2;

public class Objects {

    public static class Cliente {
        private String nome;
        private String cpf;
        private ContaCorrente conta;

        public Cliente(String nome, String cpf, ContaCorrente conta) {
            this.nome = nome;
            this.cpf = cpf;
            this.conta = conta;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public ContaCorrente getConta() {
            return conta;
        }
    }


    public static class ContaCorrente {
        private int numero;
        private int digito;
        private Agencia agencia;
        private double saldo;

        public ContaCorrente(int numero, Agencia agencia, double saldoInicial) {
            if (numero > 0 && numero <= 9999) {
                this.numero = numero;
                this.digito = calcularDigito(numero);
            } else {
                throw new IllegalArgumentException("Número da conta inválido");
            }
            this.agencia = agencia;
            this.saldo = saldoInicial;
        }

        private int calcularDigito(int numero) {
            String numStr = String.format("%04d", numero);
            int soma = Character.getNumericValue(numStr.charAt(0)) * 4 +
                    Character.getNumericValue(numStr.charAt(1)) * 6 +
                    Character.getNumericValue(numStr.charAt(2)) * 8 +
                    Character.getNumericValue(numStr.charAt(3)) * 2;
            int digito = soma % 11;
            return digito == 10 ? 0 : digito;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public double sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                return valor;
            } else {
                System.out.println("Saldo insuficiente. Saque não realizado.");
                return 0;
            }
        }

        public double consultarSaldo() {
            return saldo;
        }

        public void imprimirSaldo() {
            System.out.println("Conta: " + numero + "-" + digito);
            System.out.println("Agência: " + agencia.getNumero() + "-" + agencia.getDigito());
            System.out.printf("Saldo: R$ %.2f%n", saldo);
        }

        public Agencia getAgencia() {
            return agencia;
        }

        public int getNumero() {
            return numero;
        }

        public int getDigito() {
            return digito;
        }
    }


    public static class Agencia {
        private String nome;
        private int numero;
        private int digito;

        public Agencia(String nome, int numero) {
            this.nome = nome;
            if (numero > 0 && numero <= 9999) {
                this.numero = numero;
                this.digito = calcularDigito(numero);
            } else {
                throw new IllegalArgumentException("Número da agência inválido");
            }
        }

        private int calcularDigito(int numero) {
            String numStr = String.format("%04d", numero);
            int soma = Character.getNumericValue(numStr.charAt(0)) * 4 +
                    Character.getNumericValue(numStr.charAt(1)) * 6 +
                    Character.getNumericValue(numStr.charAt(2)) * 8 +
                    Character.getNumericValue(numStr.charAt(3)) * 2;
            int digito = soma % 11;
            return digito == 10 ? 0 : digito;
        }

        public String getNome() {
            return nome;
        }

        public int getNumero() {
            return numero;
        }

        public int getDigito() {
            return digito;
        }
    }

}
