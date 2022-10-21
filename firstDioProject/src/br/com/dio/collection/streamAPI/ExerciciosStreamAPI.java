package br.com.dio.collection.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.stream().forEach(System.out::println);

        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros e coloque dentro de um Set: ");
        /*numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

//        Set não aceita números repetidos, por isso o numero 1 só entrou uma vez.
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        collectSet.forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros: ");
        List<Integer> collectList = new ArrayList<>(numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList());
        collectList.forEach(System.out::println);

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> collectPares =
                collectList.stream()
                        .filter(i -> i % 2 == 0 && i > 2)
                        .toList();
        collectPares.forEach(System.out::println);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\nRemova os valores impares: ");
        collectList.removeIf(integer ->integer % 2 != 0);
        System.out.println(collectList);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream().skip(3).forEach(System.out::println);

        Long numerosUnicos = numerosAleatorios.stream().distinct().count();
        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? " + numerosUnicos);

        System.out.println("\nMostre o menor valor da lista: ");
        collectList.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);

        System.out.print("\nMostre o maior valor da lista: ");
        collectList.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);

        int somaNumerosPares = collectPares.stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nPegue apenas os números pares e some: " + somaNumerosPares);

        System.out.println("\nMostre a lista na ordem númerica: ");
        IntStream numerosOrdemNatural = numerosAleatorios.stream().mapToInt(Integer::parseInt).sorted();
        numerosOrdemNatural.forEach(System.out::println);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        List<Integer> numerosInteiros = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        Map<Object, List<Integer>> multiplos3e5 = numerosInteiros.stream().collect(Collectors.groupingBy(i-> i % 3 == 0 || i % 5 == 0));
        System.out.println(multiplos3e5);





    }
}
