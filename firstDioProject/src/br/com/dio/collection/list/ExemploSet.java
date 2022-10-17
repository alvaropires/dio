package br.com.dio.collection.list;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: ");
//        Não existe possibilidade, pois o Set não possui o método IndexOf
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
//        Segue o que proposto na questão anterior
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//            Não é permitido pois não possui o método get
        System.out.println("Confira se a nota 5.0 está no conjunto" + notas.contains(5.0));

        System.out.println("Exiba a terceira nota adicionada: ");
//        Não consigo pois não possui método get para repassar a nota

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Double soma = 0.0;
        for(Double nota: notas) soma += nota;

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
//        Não consigo trabalhar com indices em set
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        notas.removeIf(nota -> nota < 7.0);
        System.out.println(notas);

        System.out.println("Exibe todas as notas na ordem em que foram informados: ");
//        para trabalhar com ordenação com Set, não pode ser utilizada implementação HashSet, mas sim LinkedHashSet

        LinkedHashSet<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: ");
        System.out.println(notas);
    }
}
