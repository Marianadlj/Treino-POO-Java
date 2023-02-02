package br.com.gft.main;

import br.com.gft.model.Gerente;
import br.com.gft.model.Vendedor;
import br.com.gft.model.Supervisor;

public class Main {
    public static void main (String [] args) {
        Gerente gerente = new Gerente("Marcia lima", 6000);
        System.out.println("Nome do gerente: " + gerente.getNome() + " Salário com bonus: " + gerente.bonus());

        Supervisor supervisor = new Supervisor("Jean Mercur", 3000);
        System.out.println("Nome do supervisor: " + supervisor.getNome() + " Salário com bonus: " + supervisor.bonus());

        Vendedor vendedor = new Vendedor("Lidya Guerra", 1500);
        System.out.println("Nome do vendedor: " + vendedor.getNome() + " Salário com bonus: " + vendedor.bonus());
    }
}