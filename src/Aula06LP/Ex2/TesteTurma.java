package Aula06LP.Ex2;

import Aula06LP.Ex1.Turma;

import javax.swing.*;

public class TesteTurma {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome da turma: ");
        String curso = JOptionPane.showInputDialog("Digite o curso da turma: ");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos da turma: "));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a série da turma: "));

        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        String msg = "Turma criada com sucesso!\n" + "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() + "\nSérie: " + turma.getSerie();

        JOptionPane.showMessageDialog(null, msg);

        int nova_quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite, agora, uma nova quantidade de alunos: "));

        turma.setQuantidadeDeAlunos(nova_quantidade);

        String nova_msg = "Quantidade de alunos alterada com sucesso!\n" + "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() + "\nSérie: " + turma.getSerie();

        JOptionPane.showMessageDialog(null, nova_msg);

    }
}