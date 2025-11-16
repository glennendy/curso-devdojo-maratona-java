package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salario){
            System.out.print(salario + " ");
        }
    }

    public void imprimeMediaSalarial(){
        double media = 0;
        for(double salario: salario){
            media += salario;
        }
        media /= salario.length;
        System.out.println("\nMédia salarial "+ media);
    }
}
