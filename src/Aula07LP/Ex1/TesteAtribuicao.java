package Aula07LP.Ex1;

import Aula07LP.Ex1.Objects.Professor;
import Aula07LP.Ex1.Objects.Disciplina;
import Aula07LP.Ex1.Objects.Atribuicao;

public class TesteAtribuicao {
    public static void main(String[] args) {
        Professor prof = new Professor();
        Disciplina disc = new Disciplina();
        Atribuicao atribuicao = new Atribuicao(prof, disc);

        System.out.println(atribuicao.getDados());
    }
}

