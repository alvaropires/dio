package br.com.dio.collection.map;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.replace("gol", 15.2);
//        Também pode ser utilizado o código abaixo:
//        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("\nConfira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno") + " Km/l");

        System.out.println("\nExiba o terceiro modelo adicionado: ");
//        Não possui método que possa visualizar por índice

        System.out.println("\nExiba os modelos: " + carrosPopulares.keySet());

        System.out.println("\nExiba os consumos dos carros: " + carrosPopulares.values());

        System.out.println("\nExiba o modelo mais economico e o seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente + " Km/l");
            }
        }

        System.out.println("\nExiba o modelo menos econômico e o seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
//        Podemos utilizar a variável entries que foi criada na linha 56
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente + " Km/l");
            }
        }

        Double soma = 0d;
        for(Double consumoCarro: carrosPopulares.values()) soma += consumoCarro;
        System.out.println("\nExiba a soma dos consumos: " + soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 Km/l: ");
      /* Também pode ser utilizada essa maneria, via removeIf

        entries.removeIf(entry -> entry.getValue().equals(15.6));
        System.out.println(carrosPopulares);*/

        System.out.println(carrosPopulares);
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(15.6)) iterator.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2.toString());

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3.toString());

        System.out.println("\nApague o conjunto de carros: ");
        carrosPopulares.clear();

        System.out.println("\nConfira se o conjunto está vazio: " + carrosPopulares.isEmpty());








    }
}
