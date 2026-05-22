package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "S10";
        carro1.modelo = "Chevrolet";
        carro1.ano = 2025;

        carro1 = carro2;

        carro2.nome = "TORO";
        carro2.modelo = "FIAT";
        carro2.ano = 2025;


        System.out.println(carro1.nome+ " "+ carro1.modelo+ " "+ carro1.ano);
        System.out.println(carro2.nome+ " "+ carro2.modelo+ " "+ carro2.ano);
    }
}
