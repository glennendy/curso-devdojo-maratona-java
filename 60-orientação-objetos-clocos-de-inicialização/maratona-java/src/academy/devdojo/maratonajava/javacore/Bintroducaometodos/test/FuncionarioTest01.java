package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Glennendy");
        funcionario.setIdade(23);
        funcionario.setSalario(new double[]{1200, 900, 2000});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());

    }
}
