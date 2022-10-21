package one.digitalInnovation.com.classes;

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carros = new Carro();
        carros.setCor("Azul");
        carros.setModelo("BMW serie 3");
        carros.setCapacidadeTanque(50);

        System.out.println(carros.getModelo());
        System.out.println(carros.getCor());
        System.out.println(carros.getCapacidadeTanque());
        System.out.println(carros.totalParaEncherTanque(6.29));

        Carro carro2 = new Carro("Cinza", "Mercedes Benz class S", 60);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalParaEncherTanque(6.29));

    }
}
