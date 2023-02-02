package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

import java.util.ArrayList;

public class VideoGame extends Produto implements Imposto {
    String marca;
    String modelo;
    boolean isUsado;

    VideoGame(){

    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }


    @Override
    public double calculaImposto() {
        double ImpostoVideoGameUsado;
        double ImpostoVideoGameNovo;
        if(!isUsado){
            ImpostoVideoGameNovo = getPreco() * 0.45;
            return ImpostoVideoGameNovo;
        } else{
            ImpostoVideoGameUsado = getPreco() * 0.25;
            return ImpostoVideoGameUsado;
        }
    }

}
