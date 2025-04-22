package Aula07LP.Ex1;

public class Objects {

    public static class Professor {
        private String name;
        private int idade;

        public Professor() {
            this.name = "defaultName";
            this.idade = 0;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getName() {
            return this.name;
        }

        public int getIdade() {
            return this.idade;
        }

        public String getDados() {
            return "Nome: " + this.name + "\nIdade: " + this.idade;
        }
    }

    public static class Disciplina {
        private String name;
        private boolean pratica;

        public Disciplina() {
            this.name = "defaultName";
            this.pratica = false;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPratica(boolean pratica) {
            this.pratica = pratica;
        }

        public String getName() {
            return this.name;
        }

        public boolean getPratica() {
            return this.pratica;
        }

        public String getDados() {
            return "Nome: " + this.name + "\nPratica: " + this.pratica;
        }

    }

    public static class Atribuicao {
        private Professor professor;
        private Disciplina disciplina;

        public Atribuicao(Professor professor, Disciplina disciplina) {
            this.professor = professor;
            this.disciplina = disciplina;
        }

        public Professor getProfessor() {
            return professor;
        }

        public void setProfessor(Professor professor) {
            this.professor = professor;
        }

        public Disciplina getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(Disciplina disciplina) {
            this.disciplina = disciplina;
        }

        public String getDados() {
            return "Professor: " + professor.getName() +
                    "\nDisciplina: " + disciplina.getName();
        }
    }

}

