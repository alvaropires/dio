package br.com.dio.metodos.retornos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício RETORNOS.");

        double quadrado = Quadrilateros.area(3);
        double retangulo = Quadrilateros.area(5, 5);
        double trapezio = Quadrilateros.area(7, 8, 9);
        System.out.println("A área do quadrado é: " + quadrado);
        System.out.println("A área do retangulo é: " + retangulo);
        System.out.println("A área do trapézio é: " + trapezio);
    }
}
