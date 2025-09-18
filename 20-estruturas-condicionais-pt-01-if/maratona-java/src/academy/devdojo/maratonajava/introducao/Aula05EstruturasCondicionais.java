package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("pode comprar bebidas alcólicas");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não pode comprar bebida alcólicas");
        }
    }
}
