package br.edu.fescfafic.cinema.Model;
public class Compra {
    Ingressos ingressos = new Ingressos(25);
    Bomboniere bomboniere = new Bomboniere(12, 8,6);
    public double meia = 0.50;

    public double vendaInteiro(int inteiro, int estudante){
        int total = inteiro - estudante;
        double valorInteiro = total * ingressos.ingressoInteiro;
        System.out.println("Foram vendidos "+total+" ingressos inteiros no valor: "+valorInteiro+"0R$");
        return valorInteiro;
    }

    public double vendaEstudante(int valor){
        double valorEstudante = (valor * ingressos.ingressoInteiro) * meia;
        System.out.println("Foram vendidos "+ valor+" ingressos para estudantes no valor: "+valorEstudante+"0R$");
        return valorEstudante;
    }

    public void somaIngresso(double inteiro, double estudante){
        double somando = inteiro + estudante;
        System.out.println("No total deu "+somando+"0R$");
    }
    public void pipocaValor(int valor){
        double pipoca = valor * bomboniere.pipoca;
        System.out.printf("Foram "+valor+" pipocas, no total deu: "+pipoca+"0R$"+'\n');
    }
    public  void refrigeranteValor(int valor){
        double refri = valor * bomboniere.refigerante;
        System.out.printf("Foram "+valor+" refrigetantes, no total deu: "+refri+"0R$"+'\n');
    }
    public  void chocolateValor(int valor){
        double chocolate = valor * bomboniere.chocolate;
        System.out.printf("Foram "+valor+" refrigetantes, no total deu: "+chocolate+"0R$"+'\n');
    }
}