package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Glennendy";
        funcionario.idade = 23;
        funcionario.salario = new double[]{1200, 900, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }
}
