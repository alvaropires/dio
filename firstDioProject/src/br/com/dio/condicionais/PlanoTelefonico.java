package br.com.dio.condicionais;

public class PlanoTelefonico {
    public static void main(String[] args) {
        String pacote = "T";
        switch (pacote){
            case "T": {
            }
            System.out.println("5Gb Youtube");
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
