package br.edu.fescfafic.cinema.Model;

public class Estudante extends Cliente {
    public static final boolean ESTUDANTE = true;
    public Estudante(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
