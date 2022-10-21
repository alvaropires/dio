package br.com.dio.collection.set;

/*Crie uma classe LinguagemFavorita que possua os atributos
        nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
        3 linguagens e faça um programa que ordene esse conjunto
        por:

        Ordem de Inserção

        Ordem Natural (nome)

        IDE

        Ano de criação e nome

        Nome, ano de criacao e IDE

        Ao final, exiba as linguagens no console, um abaixo da outra.*/

import java.util.*;

public class ExercicioProposto02 {
    public static void main(String[] args) {

        System.out.println("Ordem de inserção: ");
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("python", 1989, "pycharm"));
            add(new LinguagemFavorita("java", 1991, "intellij idea"));
            add(new LinguagemFavorita("c#", 2000, "vs code"));
        }};
        System.out.println(minhasLinguagens.toString());

        System.out.println("\nOrdem natural: ");
        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(minhasLinguagens);
        System.out.println(minhasLinguagens2.toString());

        System.out.println("\nOrdem IDE: ");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(new ComparatorIde());
        minhasLinguagens3.addAll(minhasLinguagens);
        System.out.println(minhasLinguagens3.toString());

        System.out.println("\nOrdem de Ano de criação e nome: ");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagens4.addAll(minhasLinguagens);
        System.out.println(minhasLinguagens4.toString());

        System.out.println("\nOrdem de Nome, ano de criação e IDE: ");
        Set<LinguagemFavorita> minhaLinguagens5 = new TreeSet<>(new ComparatorNomeAnoIde());
        minhaLinguagens5.addAll(minhasLinguagens);
        System.out.println(minhaLinguagens5.toString());

        System.out.println("\nExiba as linguagens uma abaixo da outra: ");
        for(LinguagemFavorita linguagem: minhaLinguagens5) System.out.println(linguagem.toString());
    }
}
