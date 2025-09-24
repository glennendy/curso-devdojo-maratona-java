package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("pode comprar bebidas alcólicas");
        } else {
            System.out.println("não pode comprar bebidas alcólicas");
        }
    }
}
