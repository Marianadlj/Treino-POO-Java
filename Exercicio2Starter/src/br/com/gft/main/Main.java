package br.com.gft.main;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

        VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000, 7,"Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500, 500,"Microsoft", "One", false);

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja americanas = new Loja("Americanas", "12345678", livros, games);

        l2.calculaImposto();
        l3.calculaImposto();

        ps4Usado.calculaImposto();
        ps4.calculaImposto();

        americanas.listaLivros();
        americanas.listaVideoGames();
        americanas.calculaPatrimonio();

        System.out.println("R$ " + l2.calculaImposto() + " de impostos sobre o livro Senhor dos Anéis.");
        System.out.println("Livro educativo não tem imposto: " + l3.getNome());
        System.out.println("Imposto PS4 Slim usado, " + ps4Usado.calculaImposto());
        System.out.println("Imposto PS4 Slim " + ps4.calculaImposto());
        System.out.println("________________________________________________________ ");
        System.out.println("A loja Americanas possui estes livros para venda:" );
        System.out.println("Titulo: " + l1.getNome() + ", Preço: " +  l1.getPreco() + ", Quantidade: " + l1.getQtd() + " em estoque.");
        System.out.println("Titulo: " + l2.getNome() + ", Preço: " +  l2.getPreco() + ", Quantidade: " + l2.getQtd() + " em estoque.");
        System.out.println("Titulo: " + l3.getNome() + ", Preço: " +  l3.getPreco() + ", Quantidade: " + l3.getQtd() + " em estoque.");
        System.out.println("________________________________________________________ ");
        System.out.println("A loja Americanas possui estes video-games para venda:" );
        System.out.println("Video-game: " + ps4.getModelo() + ", Preço: " + ps4.getPreco() + ", Quantidade: " + ps4.getQtd() + " em estoque.");
        System.out.println("Video-game: " + ps4Usado.getModelo() + ", Preço: " + ps4Usado.getPreco() + ", Quantidade: " + ps4Usado.getQtd() + " em estoque.");
        System.out.println("Video-game: " + xbox.getModelo() + ", Preço: " + xbox.getPreco() + ", Quantidade: " + xbox.getQtd() + " em estoque.");
        System.out.println("________________________________________________________ ");
        System.out.println(americanas.calculaPatrimonio());
    }
}