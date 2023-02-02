package br.com.gft.model;

import java.util.ArrayList;

public class Loja {
    String Nome;
    String cnpj;
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<VideoGame> videoGames = new ArrayList<>();

    Loja(){

    }

    public Loja(String nome, String cnpj, ArrayList<Livro> livros, ArrayList<VideoGame> videoGames) {
        Nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(ArrayList<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public String listaLivros (){
        if(livros.isEmpty()){
            return "A loja não tem livros no seu estoque.";
        } else {
            for (Livro livro: livros) {
                return livros.toString();
            }
        }
        return null;
    }

    public String listaVideoGames (){
        if(videoGames.isEmpty()){
            return "A loja não tem video-games no seu estoque.";
        } else{
            for (VideoGame game: videoGames) {
                return videoGames.toString();
            }
        }
        return null;
    }

    public double calculaPatrimonio(){
        double patrimonioTotal = 0;
        for (Livro livro: livros) {
            patrimonioTotal = patrimonioTotal + (livro.getPreco() * livro.getQtd());
        }
        for (VideoGame game: videoGames) {
            patrimonioTotal = patrimonioTotal + (game.getPreco() * game.getQtd());
        }
        return patrimonioTotal;
    }

}
