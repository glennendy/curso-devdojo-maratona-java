package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos são: + - / *
        int numero01 = 20;
        int numero02 = 40;
        int resultado = numero01+numero02;
        System.out.println("O valor é "+(numero01+numero02));

        // % operador de resto

        int resto = 20 % 7;
        System.out.println(resto);

        //Operadores lógicos: < > <= >= == ! =

        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (OR) ! (Negação)

        int idade = 25;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario <= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double ValorTotalContaCorrente = 200;
        double ValorTotalContaPoupanca = 10000;
        float ValorPlaystation = 11000;
        boolean isPlaystationCincoCompravel = ValorTotalContaCorrente > ValorPlaystation || ValorTotalContaPoupanca > ValorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

    }
}
