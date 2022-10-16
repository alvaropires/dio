package br.com.dio.collection.list;


import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        /*Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        * Crie uma lista chamada notas2 e coloque todos os elementos da List ArrayList
        * Mostre a primeira nota da nova lista sem removê-lo
        * Mostre a primeira nota da nova lista removendo-a;*/

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo " + notas2.getFirst());
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista removendo-a: " + notas2.poll());
        System.out.println(notas2);



    }
}
