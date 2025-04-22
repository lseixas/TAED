package Aula07LP.Ex2;

import Aula07LP.Ex2.Objects.Agencia;
import Aula07LP.Ex2.Objects.Cliente;
import Aula07LP.Ex2.Objects.ContaCorrente;

public class CaixaEletronico {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("Agência Central", 7890);
        ContaCorrente conta = new ContaCorrente(1234, agencia, 150.00);
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);

        // sacar 140.0
        System.out.println("Saque de 140.0: R$ " + conta.sacar(140.0));

        // consultar saldo
        System.out.println("Saldo após saque: R$ " + conta.consultarSaldo());

        // sacar 200.0 (falha)
        System.out.println("Saque de 200.0: R$ " + conta.sacar(200.0));

        // consultar saldo
        System.out.println("Saldo após tentativa de saque: R$ " + conta.consultarSaldo());

        // depositar 25.45
        conta.depositar(25.45);

        // imprimir saldo completo
        System.out.println("\n--- Dados da Conta ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        conta.imprimirSaldo();
    }
}

