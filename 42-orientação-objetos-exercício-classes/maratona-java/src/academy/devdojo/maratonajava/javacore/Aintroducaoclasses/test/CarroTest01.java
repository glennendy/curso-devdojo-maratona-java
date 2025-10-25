package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "S10";
        carro.modelo = "Chevrolet";
        carro.ano = 2025;

        System.out.println(carro.nome+ " "+ carro.modelo+ " "+ carro.ano);
    }
}
