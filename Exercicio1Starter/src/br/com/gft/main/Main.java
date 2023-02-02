package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Fiat",
                "Uno",
                "kjhg989",
                "Verde",
                0,
                false,
                10,
                0,
                30000);

        /*
        testes que apliquei

        carro1.pintar("Rosa");
        carro1.ligar();
        carro1.abastecer(30);
        System.out.println(carro1.getLitrosCombustivel()); //saida = 40
        System.out.println(carro1.getCor());  //saida = Rosa
        System.out.println(carro1.isLigado()); //saida = true
        System.out.println(carro1.abastecer(60)); //saida = Mais combustível do que o necessário

        carro1.acelerar();
        carro1.acelerar();
        System.out.println(carro1.getVelocidade()); // saida = 40

        carro1.frear();
        carro1.frear();
        carro1.desligar();
        System.out.println(carro1.getVelocidade()); // saida = 0
        System.out.println(carro1.isLigado()); //saida = false

         */

    }
}