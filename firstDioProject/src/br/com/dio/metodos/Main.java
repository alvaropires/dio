package br.com.dio.metodos;

public class Main {
    public static void main(String[] args) {
        //Chama a função calculadora
        System.out.println("Exercício da calculadora.");
        Calculadora.somar(3,6);
        Calculadora.subtrair(9, 2);
        Calculadora.multiplicar(7, 8);
        Calculadora.dividir(5, 2);

        //chama a função obterMensagem
        System.out.println("Exercício da mensagem.");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //chama a função emprestimo
        System.out.println("Exercicio do empréstimo.");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
