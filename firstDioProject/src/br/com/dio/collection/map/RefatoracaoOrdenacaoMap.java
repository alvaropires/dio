package br.com.dio.collection.map;

import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        Map<Integer, Contato> listaContatos = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};

        System.out.println("\n--\t Ordem aleatória \t--");
        for(Map.Entry<Integer, Contato> entry: listaContatos.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\t Ordem de inserção \t--");
        Map<Integer, Contato> listaContatos2 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        for(Map.Entry<Integer, Contato> entry: listaContatos2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\t Ordem de id \t--");
        Map<Integer, Contato> listaContatos3 = new TreeMap<>(listaContatos);
        for(Map.Entry<Integer, Contato> entry: listaContatos3.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\t Ordem número de telefone \t--");
        /*Set<Map.Entry<Integer, Contato>> listaContatos4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
        });*/

       /* Set<Map.Entry<Integer, Contato>> listaContatos4 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> c1) {
                        return c1.getValue().getNumero();
                    }
                }));*/

        Set<Map.Entry<Integer, Contato>> listaContatos4 = new TreeSet<>(Comparator.comparing(
                contato -> contato.getValue().getNumero()));
        listaContatos4.addAll(listaContatos.entrySet());
        for(Map.Entry<Integer, Contato> entry: listaContatos4){
            System.out.println(entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\t Ordem nome de contato \t--");
        Set<Map.Entry<Integer, Contato>> listaContatos5 = new TreeSet<>(Comparator.comparing(
                contato -> contato.getValue().getNome()));
        listaContatos5.addAll(listaContatos.entrySet());
        for(Map.Entry<Integer, Contato> entry: listaContatos5){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
