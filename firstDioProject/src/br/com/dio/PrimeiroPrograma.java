package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", "380");
        System.out.println(livro1);

        /*int a = 2;
        int b = 5;
        System.out.println("Hello World " + (a + b));*/

    }

    static class Livro {
        private String nome;
        private String numPag;

        public Livro(String nome, String numPag) {
            this.nome = nome;
            this.numPag = numPag;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNumPag() {
            return numPag;
        }

        public void setNumPag(String numPag) {
            this.numPag = numPag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPag='" + numPag + '\'' +
                    '}';
        }
    }
}
