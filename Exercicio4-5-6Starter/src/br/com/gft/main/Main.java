package br.com.gft.main;

import br.com.gft.model.Pessoa;
import java.util.ArrayList;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        //aqui criei a lista para usar na resposta dos três exercícios (4, 5 e 6)
        ArrayList<Pessoa> ListaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("João", 15);
        Pessoa pessoa2 = new Pessoa("Leandro", 21);
        Pessoa pessoa3 = new Pessoa("Paulo", 17);
        Pessoa pessoa4 = new Pessoa("Jessica", 18);
        ListaDePessoas.add(pessoa1);
        ListaDePessoas.add(pessoa2);
        ListaDePessoas.add(pessoa3);
        ListaDePessoas.add(pessoa4);

        //aqui temos a a busca da pessoa mais velha da lista, respondendo assim o exercício 4
        String nomeDoMaisVelho = null;
        int idadeDoMaisVelho = 0;
        for (Pessoa pessoa : ListaDePessoas) {
            if (pessoa.idade > idadeDoMaisVelho) {
                idadeDoMaisVelho = pessoa.idade;
                nomeDoMaisVelho = pessoa.nome;
            }
        }
        System.out.println("A pessoa mais velha da lista é: " + nomeDoMaisVelho);

        ArrayList<Pessoa> ListaDePessoasMaioresDeIdade = new ArrayList<>();
        int quantdadeDePessoasMaioresDeIdade = 0;
        int quantidadeDePessoas =0;
        for (Pessoa pessoa : ListaDePessoas) {
            if(pessoa.idade >= 18){
                quantdadeDePessoasMaioresDeIdade++;
                ListaDePessoasMaioresDeIdade.add(pessoa);
            }
            quantidadeDePessoas++;
        }

        System.out.println("A quantidade de pessoas na lista antes da conferência de maioridade era: " + quantidadeDePessoas);
        System.out.println("A quantidade de pessoas na lista depois da conferência de maioridade é: " + quantdadeDePessoasMaioresDeIdade);

        //aqui temos a consulta de presença na lista, respondendo o exercício 6
        int idadeDaJessica = 0;
        for (Pessoa pessoa : ListaDePessoasMaioresDeIdade) {
            if(Objects.equals(pessoa.nome, "Jessica")){
                idadeDaJessica = pessoa.idade;
            }
        }
        System.out.println("A Jessica consta na lista e sua idade é: " + idadeDaJessica);
    }

}
