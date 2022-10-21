package br.com.dio.collection.map;

/*Dada a população estimada de alguns estados do NE brasileiro, faça:

Estado = PE - População = 9.616.621

Estado = AL - População = 3.351.543

Estado = CE - População = 9.187.103

Estado = RN - População = 3.534.265

Crie um dicionário e relacione os estados e suas populações;

Substitua a população do estado do RN por 3.534.165;

Confira se o estado PB está no dicionário, caso não adicione: PB -
4.039.277;

Exiba a população PE;

Exiba todos os estados e suas populações na ordem que foi
        informado;

        Exiba os estados e suas populações em ordem alfabética;

        Exiba o estado com o menor população e sua quantidade;

        Exiba o estado com a maior população e sua quantidade;

        Exiba a soma da população desses estados;

        Exiba a média da população deste dicionário de estados;

        Remova os estados com a população menor que 4.000.000;

        Apague o dicionário de estados;

        Confira se o dicionário está vazio.*/


import java.text.CollationElementIterator;
import java.util.*;

public class ExercioProposto01 {
    public static void main(String[] args) {

        System.out.println("\nCrie um dicionário e relacione os estados e suas populações: ");
        Map<String, Long> estadosNE = new HashMap<>(){{
           put("PE", 9616621L);
           put("AL", 3351543L);
           put("CE", 9187103L);
           put("RN", 3534265L);
        }};
        System.out.println(estadosNE.toString());

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        estadosNE.replace("RN", 3564165L);
        System.out.println(estadosNE.toString());

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: ");
        if(!estadosNE.containsKey("PB")){
            System.out.println("O estado PB não foi encontrado no dicionário. Estou adicionando...");
            estadosNE.put("PB", 4039277L);
        } else System.out.println("O estado PB já havia sido adicionado.");
        System.out.println(estadosNE.toString());

        System.out.println("\nExiba a população PE: ");
        System.out.println("População do Estado PE = " + estadosNE.get("PE") + " habitantes.");

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Long> estadosNE2 = new LinkedHashMap<>(){{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};
        for(Map.Entry<String, Long> estado: estadosNE2.entrySet())
            System.out.println(estado);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Long> estadosNE3 = new TreeMap<>(estadosNE);
        for(Map.Entry<String, Long> estado: estadosNE3.entrySet())
            System.out.println(estado);

        System.out.println("\nExiba o estado com o menor população e sua quantidade: ");
        Long menorPopulacao = Collections.min(estadosNE.values());
        String estadoMenorPopulacao = "";
        Set<Map.Entry<String, Long>> entries = estadosNE.entrySet();
        for(Map.Entry<String, Long>entry: entries){
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado menor população: " + estadoMenorPopulacao + " - População: " + menorPopulacao);
            }
        }

        System.out.println("\nExiba o estado com a maior população e sua quantidade: ");
        Long maiorPopulacao = Collections.max(estadosNE.values());
        String estadoMaiorPopulacao = "";
        for(Map.Entry<String, Long> entry: entries){
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("Estado maior população: " + estadoMaiorPopulacao + " - População: " + maiorPopulacao);
            }
        }

        Long soma = 0L;
        for(Map.Entry<String, Long> entry: entries) soma += entry.getValue();
        System.out.println("\nExiba a soma da população desses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + ((double) soma/estadosNE.size()));


        System.out.println("\n" + estadosNE);
        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Long> iterator = estadosNE.values().iterator();
        while (iterator.hasNext()){
            if (iterator.next() < 4000000) iterator.remove();
        }
        System.out.println(estadosNE);

        System.out.println("\nApague o dicionário de estados: ");
        estadosNE.clear();

        System.out.println("\nConfira se o dicionário está vazio: " + estadosNE.isEmpty());
    }
}
