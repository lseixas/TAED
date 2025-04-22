package Aula06LP.Ex3;

public class Produto {

    private String nome;
    private double preço;
    private int quantidade;

    public Produto(String nome, double preço, int quanntidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quanntidade;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nPreço: " + this.preço + "\nQuantidade: " + this.quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreço(double preço){
        this.preço = preço;
    }

    public double getPreço(){
        return this.preço;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

}
