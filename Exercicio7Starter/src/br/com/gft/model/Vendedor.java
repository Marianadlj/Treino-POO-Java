package br.com.gft.model;

public class Vendedor extends Funcionario {

    public Vendedor (String nome, int salario) {
        super(nome, salario);
    }

    public int bonus(){
        double salarioComBonus = salario + 3000;
        return (int) salarioComBonus;
    }

}
