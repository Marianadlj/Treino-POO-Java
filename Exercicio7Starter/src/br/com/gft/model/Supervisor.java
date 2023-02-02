package br.com.gft.model;

public class Supervisor extends Funcionario {

    public Supervisor (String nome, int salario) {
        super(nome, salario);
    }

    public int bonus(){
        double salarioComBonus = salario + 5000;
        return (int) salarioComBonus;
    }

}
