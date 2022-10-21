package br.com.dio.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DesafioLancamentoDados {
    public static void main(String[] args) {
        int quantidadeLancamentos = 100;
        Map<Integer, Integer> dado = new HashMap<>(){{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};
        System.out.println(dado);
        Random random = new Random();
        for(int i = 0; i < quantidadeLancamentos ; i++){
            int valorLancamento = random.nextInt(1,7);
            int contador = dado.get(valorLancamento);
            contador++;
            dado.put(valorLancamento, contador);
        }

        System.out.println(dado);
        for(Map.Entry<Integer, Integer> valor: dado.entrySet()){
            System.out.println("O valor " + valor.getKey() + " foi inserido " + valor.getValue() + " vezes.");;
        }
    }
}
