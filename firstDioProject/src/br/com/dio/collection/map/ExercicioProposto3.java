/*
package br.com.dio.collection.map;

*/
/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*//*


import java.util.*;

public class ExercicioProposto3 {
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
        Set<Map.Entry<Integer, Contato>> listaContatos4 = new TreeSet<>(new ComparatorNumeroTelefone());
        listaContatos4.addAll(listaContatos.entrySet());
        for(Map.Entry<Integer, Contato> entry: listaContatos4){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\t Ordem nome de contato \t--");
        Set<Map.Entry<Integer, Contato>> listaContatos5 = new TreeSet<>(new ComparatorNomeContato());
        listaContatos5.addAll(listaContatos.entrySet());
        for(Map.Entry<Integer, Contato> entry: listaContatos5){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

    }
}
*/
