package br.com.gft.model;

public class Gerente extends Funcionario {

    public Gerente (String nome, int salario) {
        super(nome, salario);
    }

    public int bonus(){
        double salarioComBonus = salario + 10000;
        return (int) salarioComBonus;
    }
}