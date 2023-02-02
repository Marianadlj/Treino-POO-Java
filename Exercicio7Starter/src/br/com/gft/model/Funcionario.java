package br.com.gft.model;

public class Funcionario {

    public String nome;
    public int salario;

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

}
