package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Glen";
        estudante01.idade = 23;
        estudante01.sexo = 'M';

        estudante02.nome = "Saskya";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
