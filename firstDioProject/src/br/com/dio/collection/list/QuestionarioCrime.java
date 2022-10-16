package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Scanner;


public class QuestionarioCrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> respostas = new ArrayList<>();
        String[] perguntas = new String[]{"Telefonou para a vítima? [s/n] ",
                "Esteve no local do crime? [s/n] ",
                "Mora perto da vítima? [s/n] ",
                "Devia para a vítima? [s/n] ",
                "Já trabalhou com a vítima? [s/n] "
        };
        System.out.println("--\t INTERROGATÓRIO \t--");
        for (String pergunta: perguntas) {
            System.out.println(pergunta);
            respostas.add(scanner.next());
        }
        Integer contadorSim = 0;
        for(String resposta: respostas){
            if(resposta.equalsIgnoreCase("s")) {
                contadorSim += 1;
            }
        }
        if(contadorSim == 5){
            System.out.println("Você é o assassino!");
        } else if (contadorSim >= 3 && contadorSim < 5) {
            System.out.println("Você é cumplice!");
        } else if (contadorSim == 2){
            System.out.println("Você é suspeito!");
        } else {
            System.out.println("Você é inocente!");
        }
        System.out.println(contadorSim);
        System.out.println(respostas);
    }
}
