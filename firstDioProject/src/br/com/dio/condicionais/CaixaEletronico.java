package br.com.dio.condicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 30;

        if (valorSolicitado < saldo){
            saldo -= valorSolicitado;
        }
        System.out.println("O seu saldo restante é: " + saldo);
    }
}
