package br.com.dio.condicionais;

public class NotaEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota>=5 && nota<7) {
            System.out.println("Prova de Recuperação");
        } else{
            System.out.println("Reprovado");
        }
    }
}
