package Aula06LP.Ex3;

import javax.swing.*;

public class TesteProduto {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Vamos criar um objeto produto!");

        String noome = JOptionPane.showInputDialog("Digite o nome do produto: ");
        double preço = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: "));

        Produto produto = new Produto(noome, preço, quantidade);

        String msg = produto.toString();

        JOptionPane.showMessageDialog(null, msg);

    }

}
