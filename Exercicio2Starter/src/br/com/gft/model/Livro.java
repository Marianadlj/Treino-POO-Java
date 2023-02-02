package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

import java.util.ArrayList;
import java.util.Objects;

public class Livro extends Produto implements Imposto {
    String autor;
    String tema;
    int qtdpag;

    Livro(){

    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdpag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdpag = qtdpag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdpag() {
        return qtdpag;
    }

    public void setQtdpag(int qtdpag) {
        this.qtdpag = qtdpag;
    }

    @Override
    public double calculaImposto() {
        double ImpostoLivro = 0;
        if(Objects.equals(getTema(), "educativo")){
            return 0.0;
        } else{
            ImpostoLivro = getPreco()  * 0.1;
        }
        return ImpostoLivro;
    }
}
