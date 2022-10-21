package br.com.dio.collection.map;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("\n--\tOrdem aleatória\t--");
        Map<String, Livros> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen",new Livros("Uma breve história do tempo", 256));
           put("Duhigg, Charles",new Livros("O Poder do Hábito", 408));
           put("Harari, Yuval Noah",new Livros("21 Lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livros> livro: meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem de inserção\t--");
        Map<String, Livros> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen",new Livros("Uma breve história do tempo", 256));
            put("Duhigg, Charles",new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah",new Livros("21 Lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livros> livro: meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem alfabética autores\t--");
        Map<String, Livros> meusLivros3 = new TreeMap<>(meusLivros);
        for(Map.Entry<String, Livros> livro: meusLivros3.entrySet()){
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new ComparatorNomeDoLivro());
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livros> livro: meusLivros4){
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem número de páginas\t--");
        Set<Map.Entry<String, Livros>> meusLivros5 = new TreeSet<>(new ComparatorNumeroPaginas());
        meusLivros5.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livros> livro: meusLivros5){
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }






    }
}

