package br.com.dio.metodos;

public class Calculadora {
    public static void somar(int a, int b){
        System.out.println("A soma entre " + a + " e " + b + " é " + (a+b));
    }
    public static void subtrair(int a, int b){
        System.out.println("A subtração entre " + a + " e " + b + " é " + (a-b));
    }
    public static void multiplicar(int a, int b){
        System.out.println("A multiplicação entre " + a + " e " + b + " é " + (a*b));
    }
    public static void dividir(int a, int b){
        System.out.println("A divisão entre " + a + " e " + b + " é " + (double)a/b);
    }
}
