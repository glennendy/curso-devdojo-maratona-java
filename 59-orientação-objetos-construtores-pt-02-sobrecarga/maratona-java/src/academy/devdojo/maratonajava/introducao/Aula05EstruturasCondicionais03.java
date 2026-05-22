package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 7000;
        String mensagemDoar = "Eu vou doar 500 para o devdojo";
        String mensagemNaoDoar = "Eu não posso doar agora";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
