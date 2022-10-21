package br.com.dio.collection.desafioDeCodigo;


import java.util.Scanner;

import static java.lang.System.in;

public class DesafioBasico01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(in);
        int t = leitor.nextInt();
        int[] n = new int[1000];
        int controle = 0;
        for(int i = 0; i<1000; i++){
            if(controle < t){
                n[i] = controle;
                controle++;
            }else {
                controle = 0;
                n[i] = controle;
                controle++;
            }
        }
        for(Integer numero: n) System.out.println(numero);;

    }
}
