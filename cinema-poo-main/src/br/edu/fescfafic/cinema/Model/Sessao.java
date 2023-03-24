package br.edu.fescfafic.cinema.Model;
public class Sessao {
    public int lotacaoMaxima = 45;
    public int lotacaoAtual;
    public Sessao(int lotacao) {
        this.lotacaoAtual = lotacao;
    }
    public void lotacaoMaxima(int valor, int lotacao){
        int total = valor + lotacao;
        if(total > lotacaoMaxima){
            System.out.println("Ultrapassou a lotação maxima!");
        }
        else if(total == lotacaoMaxima){
            System.out.println("A lotaçõa maxima foi atingida!\n");
        }
        else{
            System.out.println("A lotação atual é de: " +total+ " de: "+lotacaoMaxima+'\n');
        }
    }
}