package br.com.dio.collection.set;

/*Crie um conjunto contendo as cores do arco-íris e:

        Exiba todas as cores uma abaixo da outra

        A quantidade de cores que o arco-íris tem

        Exiba as cores em ordem alfabética

        Exiba as cores na ordem inversa da que foi informada

        Exiba todas as cores que começam com a letra ”v”

        Remova todas as cores que não começam com a letra “v”

        Limpe o conjunto

        Confira se o conjunto está vazio*/

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        HashSet<String> coresArcoIris = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        System.out.println("Exiba todas as cores uma abaixo da outra: ");
        for(String cor: coresArcoIris) System.out.println(cor);

        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<String>(coresArcoIris);
        for (String cor: coresArcoIris2) System.out.println(cor);

        System.out.println("Exiba as cores na ordem inversa do que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        List<String> corInversa = new LinkedList<>(coresArcoIris3);
        Collections.reverse(corInversa);
        for (String cor: corInversa) System.out.println(cor);

        System.out.println("Exiba todas as cores que começam com a letra *v*");
        for(String cor: coresArcoIris) if(cor.startsWith("v")) System.out.println(cor);

        System.out.println("Remova todas as cores que não começam com a letra *v*");
//        remove todas as cores que não começam com a letra "v", utilizando o operador -!-;
        coresArcoIris.removeIf(nota-> !nota.startsWith("v"));
        for(String cor: coresArcoIris) System.out.println(cor);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
