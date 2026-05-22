package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.security.PublicKey;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null){
            return;
        }
        for(double salario: salario){
            System.out.print(salario + " ");
        }

        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial(){
        if (salario == null){
            return;
        }

        for(double salario: salario){
            media += salario;
        }
        media /= salario.length;

        System.out.println("\nMédia salarial "+ media);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario(double[] salario){
        this.salario = salario;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double[] getSalario(){
        return salario;
    }

    public double getMedia(){
        return media;
    }
}
