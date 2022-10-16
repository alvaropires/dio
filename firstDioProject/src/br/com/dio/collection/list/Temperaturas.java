package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        for(int i=1; i<=6; i++){
            System.out.println("Digite a temperatura do mês " + i + ": ");
            temperaturas.add(scanner.nextDouble());
        }
        Double soma = 0.0;
        for(Double temperatura: temperaturas) soma += temperatura;
        Double media = soma / temperaturas.size();
        System.out.println("A média semestral das temperaturas  foi de " + media + " °C.");
        System.out.println("As temperaturas acima da média foram: ");
        String mes = null;
        for(int i = 0; i < temperaturas.size(); i++){
            switch (i+1){
                case 1:
                    mes = "Janeiro";
                    break;
                case 2:
                    mes = "Fevereiro";
                    break;
                case 3:
                    mes = "Março";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                case 5:
                    mes = "Maio";
                    break;
                case 6:
                    mes = "Junho";
                    break;
                default:
                    System.out.println("Não houve temperatura acima da média.");
            }
            if(temperaturas.get(i) > media){
                System.out.println( mes + " - " + temperaturas.get(i) +" °C");
            }
        }
    }
}
