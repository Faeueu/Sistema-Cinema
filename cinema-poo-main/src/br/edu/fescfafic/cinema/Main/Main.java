package br.edu.fescfafic.cinema.Main;
import br.edu.fescfafic.cinema.Model.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();

        Atendente atendente = new Atendente(
                "Jõao",
                "000.000.000-00",
                "0000000",
                "1232423534635");

        Bilheteiro bilheteiro = new Bilheteiro(
                "Maria",
                "000.000.000-00",
                "0000000",
                "1243333334635");

        Cliente cliente = new Cliente(
                "Pedro");

        Estudante estudante = new Estudante(
                "Jonas");

        Horarios horario = new Horarios();
        horario.abrirCinema();

        Scanner buscar = new Scanner(System.in);
        int contador;
        int contadorEstudante;
        String base;
        String pipoca;
        int pipocaQuantidade;
        String refrigerante;
        int refrigeranteQuantidade;
        String chocolate;
        int chocolateQuantidade;

        System.out.print("Quantos ingressos deseja comprar: ");
        contador = buscar.nextInt();

        System.out.print("Quantos deste são estudantes: ");
        contadorEstudante = buscar.nextInt();

        if(contadorEstudante <= contador) {

            compra.somaIngresso(compra.vendaInteiro(contador, contadorEstudante), compra.vendaEstudante(contadorEstudante));

            Sessao sessao = new Sessao(40);
            sessao.lotacaoMaxima(contador, sessao.lotacaoAtual);

            if((contador + sessao.lotacaoAtual) <= sessao.lotacaoMaxima) {

                System.out.print("Deseja comprar alguma para comer: ");
                base = buscar.next();

                if (base.equals("sim")) {
                    System.out.print("Temos pipoca deseja comprar: ");
                    pipoca = buscar.next();

                    if (pipoca.equals("sim")) {

                        System.out.print("Quantas unidades: ");
                        pipocaQuantidade = buscar.nextInt();
                        compra.pipocaValor(pipocaQuantidade);
                    }

                    System.out.print("Temos refrigerante deseja comprar: ");
                    refrigerante = buscar.next();

                    if (refrigerante.equals("sim")) {

                        System.out.print("Quantas unidades: ");
                        refrigeranteQuantidade = buscar.nextInt();
                        compra.refrigeranteValor(refrigeranteQuantidade);
                    }

                    System.out.print("Temos chocolate deseja comprar: ");
                    chocolate = buscar.next();

                    if (chocolate.equals("sim")) {

                        System.out.print("Quantas unidades: ");
                        chocolateQuantidade = buscar.nextInt();
                        compra.chocolateValor(chocolateQuantidade);
                    }
                    System.out.println("Tenha um bom filme!");
                }
                else if (base.equals("não")) {
                    System.out.println("Tenha um bom filme!");
                }
            }
        }
        else{
            System.out.println("Numero invalido");
        }
    }
}